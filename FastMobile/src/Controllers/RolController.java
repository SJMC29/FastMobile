
package Controllers;

import Models.Rol;
import Persistence.RolJpaController;

public class RolController {
    
    RolJpaController rolJPA = new RolJpaController();
    
    public void createRol(Rol rol){
        rolJPA.create(rol);
    }
    
}
