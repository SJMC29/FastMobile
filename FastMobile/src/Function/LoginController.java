/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.UserController;
import Interface.Login;
import Interface.Menu;

/**
 *
 * @author Fanfo
 */
public class LoginController {
    UserController user_controller = new UserController();
    public void letIngreso(Login login){
        //System.out.println(user_controller.getUser(login.getUser()).getPassword());
        String passBD = user_controller.getUser(login.getUser()).getPassword();
        String passInterface = login.getPassword();
        if (passBD.equals(passInterface)) {
            new Menu().setVisible(true);
            login.dispose();
        } else {
            login.showError();
        }
    }
}
