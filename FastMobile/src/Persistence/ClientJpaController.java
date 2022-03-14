/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Controllers.PersonController;
import Models.Client;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Models.Client_Phone;
import Models.Person;
import Persistence.exceptions.IllegalOrphanException;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author EDITH
 */
public class ClientJpaController implements Serializable {

    public ClientJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ClientJpaController(){
        emf = Persistence.createEntityManagerFactory("FastMobile_PU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Client client) {
        if (client.getPhones() == null) {
            client.setPhones(new ArrayList<Client_Phone>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Client_Phone> attachedPhones = new ArrayList<Client_Phone>();
            for (Client_Phone phonesClient_PhoneToAttach : client.getPhones()) {
                phonesClient_PhoneToAttach = em.getReference(phonesClient_PhoneToAttach.getClass(), phonesClient_PhoneToAttach.getId_Phone());
                attachedPhones.add(phonesClient_PhoneToAttach);
            }
            client.setPhones(attachedPhones);
            em.persist(client);
            for (Client_Phone phonesClient_Phone : client.getPhones()) {
                Client oldClientOfPhonesClient_Phone = phonesClient_Phone.getClient();
                phonesClient_Phone.setClient(client);
                phonesClient_Phone = em.merge(phonesClient_Phone);
                if (oldClientOfPhonesClient_Phone != null) {
                    oldClientOfPhonesClient_Phone.getPhones().remove(phonesClient_Phone);
                    oldClientOfPhonesClient_Phone = em.merge(oldClientOfPhonesClient_Phone);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Client client) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client persistentClient = em.find(Client.class, client.getId_Client());
            List<Client_Phone> phonesOld = persistentClient.getPhones();
            List<Client_Phone> phonesNew = client.getPhones();
            List<String> illegalOrphanMessages = null;
            for (Client_Phone phonesOldClient_Phone : phonesOld) {
                if (!phonesNew.contains(phonesOldClient_Phone)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Client_Phone " + phonesOldClient_Phone + " since its client field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Client_Phone> attachedPhonesNew = new ArrayList<Client_Phone>();
            for (Client_Phone phonesNewClient_PhoneToAttach : phonesNew) {
                phonesNewClient_PhoneToAttach = em.getReference(phonesNewClient_PhoneToAttach.getClass(), phonesNewClient_PhoneToAttach.getId_Phone());
                attachedPhonesNew.add(phonesNewClient_PhoneToAttach);
            }
            phonesNew = attachedPhonesNew;
            client.setPhones(phonesNew);
            client = em.merge(client);
            for (Client_Phone phonesNewClient_Phone : phonesNew) {
                if (!phonesOld.contains(phonesNewClient_Phone)) {
                    Client oldClientOfPhonesNewClient_Phone = phonesNewClient_Phone.getClient();
                    phonesNewClient_Phone.setClient(client);
                    phonesNewClient_Phone = em.merge(phonesNewClient_Phone);
                    if (oldClientOfPhonesNewClient_Phone != null && !oldClientOfPhonesNewClient_Phone.equals(client)) {
                        oldClientOfPhonesNewClient_Phone.getPhones().remove(phonesNewClient_Phone);
                        oldClientOfPhonesNewClient_Phone = em.merge(oldClientOfPhonesNewClient_Phone);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = client.getId_Client();
                if (findClient(id) == null) {
                    throw new NonexistentEntityException("The client with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Client client;
            try {
                client = em.getReference(Client.class, id);
                client.getId_Client();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The client with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Client_Phone> phonesOrphanCheck = client.getPhones();
            for (Client_Phone phonesOrphanCheckClient_Phone : phonesOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Client (" + client + ") cannot be destroyed since the Client_Phone " + phonesOrphanCheckClient_Phone + " in its phones field has a non-nullable client field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(client);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Client> findClientEntities() {
        return findClientEntities(true, -1, -1);
    }

    public List<Client> findClientEntities(int maxResults, int firstResult) {
        return findClientEntities(false, maxResults, firstResult);
    }

    private List<Client> findClientEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Client.class));
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

    public Client findClient(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Client.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Client> rt = cq.from(Client.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public void destroy(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Nuestras Query
    public Client findClientByPerson(String id_person){
        EntityManager em = getEntityManager();
        PersonController personControl = new PersonController();
        Person p = personControl.getPerson(id_person);
        try{
            return (Client) em.createNamedQuery("Client_Person")
                .setParameter("person", p)
                .getSingleResult();
        } finally {
            em.close();
        }
        
    }
}
