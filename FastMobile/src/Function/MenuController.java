/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Interface.Login;
import Interface.Menu;
/**
 *
 * @author Sara Maradiago
 */
public class MenuController {
    public void logOut(Menu menu){
            new Login().setVisible(true);
            menu.dispose();
    }
}
