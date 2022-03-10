/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Models.Client;
import Models.Client_Phone;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author EDITH
 */
public class Client_PhoneJpaController implements Serializable {

    public Client_PhoneJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public Client_PhoneJpaController(){
        emf = Persistence.createEntityManagerFactory("FastMobile_PU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Client_Phone client_Phone) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client client = client_Phone.getClient();
            if (client != null) {
                client = em.getReference(client.getClass(), client.getId_Client());
                client_Phone.setClient(client);
            }
            em.persist(client_Phone);
            if (client != null) {
                client.getPhones().add(client_Phone);
                client = em.merge(client);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Client_Phone client_Phone) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client_Phone persistentClient_Phone = em.find(Client_Phone.class, client_Phone.getId_Phone());
            Client clientOld = persistentClient_Phone.getClient();
            Client clientNew = client_Phone.getClient();
            if (clientNew != null) {
                clientNew = em.getReference(clientNew.getClass(), clientNew.getId_Client());
                client_Phone.setClient(clientNew);
            }
            client_Phone = em.merge(client_Phone);
            if (clientOld != null && !clientOld.equals(clientNew)) {
                clientOld.getPhones().remove(client_Phone);
                clientOld = em.merge(clientOld);
            }
            if (clientNew != null && !clientNew.equals(clientOld)) {
                clientNew.getPhones().add(client_Phone);
                clientNew = em.merge(clientNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = client_Phone.getId_Phone();
                if (findClient_Phone(id) == null) {
                    throw new NonexistentEntityException("The client_Phone with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client_Phone client_Phone;
            try {
                client_Phone = em.getReference(Client_Phone.class, id);
                client_Phone.getId_Phone();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The client_Phone with id " + id + " no longer exists.", enfe);
            }
            Client client = client_Phone.getClient();
            if (client != null) {
                client.getPhones().remove(client_Phone);
                client = em.merge(client);
            }
            em.remove(client_Phone);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Client_Phone> findClient_PhoneEntities() {
        return findClient_PhoneEntities(true, -1, -1);
    }

    public List<Client_Phone> findClient_PhoneEntities(int maxResults, int firstResult) {
        return findClient_PhoneEntities(false, maxResults, firstResult);
    }

    private List<Client_Phone> findClient_PhoneEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Client_Phone.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Client_Phone findClient_Phone(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Client_Phone.class, id);
        } finally {
            em.close();
        }
    }

    public int getClient_PhoneCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Client_Phone> rt = cq.from(Client_Phone.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public Client_Phone fineClient_PhoneByNumber(String number){
        EntityManager em = getEntityManager();
        try {
            return (Client_Phone) em.createNamedQuery("Phone_Number")
                    .setParameter("number", number)
                    .getSingleResult();
        } catch (NoResultException enfe){
            return null;
        } finally {
            em.close();
        } 
    }
    
}
