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
        System.out.println(login.getUser());
        System.out.println(login.getPassword());
        new Menu().setVisible(true);
        login.setVisible(false);
    }
}
