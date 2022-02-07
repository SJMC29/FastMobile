/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Interface.Login;
import Interface.Menu;

/**
 *
 * @author Fanfo
 */
public class LoginController {
    public void letIngreso(Login login){
        if (login.getUser().equals("admin") && login.getPassword().equals("123")) {
            new Menu().setVisible(true);
            login.dispose();
        } else {
            login.showError();
        }
    }
}
