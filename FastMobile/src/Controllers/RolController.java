
package Controllers;

import Models.Rol;
import Persistence.RolJpaController;
import java.util.List;

public class RolController {
    
    RolJpaController rolJPA = new RolJpaController();
    
    public void createRol(Rol rol){
        rolJPA.create(rol);
    }
    
    public List<Rol> getRols(){
        return rolJPA.findRolEntities();
    }
    
    public Rol getRol(Integer id){
        return rolJPA.findRol(id);
    }
}
