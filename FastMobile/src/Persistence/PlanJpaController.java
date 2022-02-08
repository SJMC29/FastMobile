/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Models.Plan;
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

/**
 *
 * @author EDITH
 */
public class PlanJpaController implements Serializable {

    public PlanJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public PlanJpaController(){
        emf = Persistence.createEntityManagerFactory("FastMobile_PU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Plan plan) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(plan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Plan plan) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            plan = em.merge(plan);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = plan.getId_Plan();
                if (findPlan(id) == null) {
                    throw new NonexistentEntityException("The plan with id " + id + " no longer exists.");
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
            Plan plan;
            try {
                plan = em.getReference(Plan.class, id);
                plan.getId_Plan();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The plan with id " + id + " no longer exists.", enfe);
            }
            em.remove(plan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Plan> findPlanEntities() {
        return findPlanEntities(true, -1, -1);
    }

    public List<Plan> findPlanEntities(int maxResults, int firstResult) {
        return findPlanEntities(false, maxResults, firstResult);
    }

    private List<Plan> findPlanEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Plan.class));
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

    public Plan findPlan(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Plan.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlanCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Plan> rt = cq.from(Plan.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
