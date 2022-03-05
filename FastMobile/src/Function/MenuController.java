/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.UserController;
import Interface.ListClients;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileUsers;
import Interface.RegisterClient;
import Interface.RegisterUser;
import Models.User;
/**
 *
 * @author Sara Maradiago
 */
public class MenuController {
    UserController user_controller = new UserController();
    
    public void logOut(Menu menu){
            new Login().setVisible(true);
            menu.dispose();
    }
    public void goToProfile(Menu menu, User user){                       
            new ProfileUsers(user).setVisible(true);
            menu.dispose();
    }
    public void goToRegisterClient(Menu menu, User user){                       
            new RegisterClient(user).setVisible(true);
            menu.dispose();
    }
    public void goToRegisterUser(Menu menu, User user){                       
            new RegisterUser(user).setVisible(true);
            menu.dispose();    
    }
    public void goToListClients(Menu menu, User user){                       
            new ListClients(user).setVisible(true);
            menu.dispose();    
    }
}
