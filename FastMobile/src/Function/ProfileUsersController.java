/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Models.User;
import Interface.Login;
import Interface.Menu;
import Interface.ProfileUsers;

/**
 *
 * @author Sara Maradiago
 */
public class ProfileUsersController {
    
    public void logOut(ProfileUsers profileUser){
            new Login().setVisible(true);
            profileUser.dispose();
    }     
    
    public void goToMenu(ProfileUsers profileUser, User usuario){
            new Menu(usuario).setVisible(true);
            profileUser.dispose();
    }
}
