
package Persistence;

import Models.Client_Type;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class Client_TypeJpaController implements Serializable {

    public Client_TypeJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public  Client_TypeJpaController(){
        emf = Persistence.createEntityManagerFactory("FastMobile_PU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Client_Type client_Type) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(client_Type);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Client_Type client_Type) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            client_Type = em.merge(client_Type);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = client_Type.getId_type();
                if (findClient_Type(id) == null) {
                    throw new NonexistentEntityException("The client_Type with id " + id + " no longer exists.");
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
            Client_Type client_Type;
            try {
                client_Type = em.getReference(Client_Type.class, id);
                client_Type.getId_type();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The client_Type with id " + id + " no longer exists.", enfe);
            }
            em.remove(client_Type);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Client_Type> findClient_TypeEntities() {
        return findClient_TypeEntities(true, -1, -1);
    }

    public List<Client_Type> findClient_TypeEntities(int maxResults, int firstResult) {
        return findClient_TypeEntities(false, maxResults, firstResult);
    }

    private List<Client_Type> findClient_TypeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Client_Type.class));
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

    public Client_Type findClient_Type(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Client_Type.class, id);
        } finally {
            em.close();
        }
    }

    public int getClient_TypeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Client_Type> rt = cq.from(Client_Type.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
