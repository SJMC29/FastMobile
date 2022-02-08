
package Controllers;

import Models.User;
import Persistence.UserJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {
    
    UserJpaController userJPA = new UserJpaController();
    
    public void createUser(User u){
        try {
            userJPA.create(u);
        } catch (Exception ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public List<User> getUsers(){
        return userJPA.findUserEntities();
    }
    
    public User getUser(String id){
        return userJPA.findUser(id);
    }
    
}
