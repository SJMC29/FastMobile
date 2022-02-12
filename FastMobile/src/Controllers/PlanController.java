
package Controllers;

import Models.Plan;
import Persistence.PlanJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;

public class PlanController {
    
    PlanJpaController planJPA = new PlanJpaController();
    
    public void createPlan(Plan p){
        planJPA.create(p);
    }
        
    public List<Plan> getPlans(){
        return planJPA.findPlanEntities();
    }
    
    public Plan getPlan(Integer id){
        return planJPA.findPlan(id);
    }
    
   
}
