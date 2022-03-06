/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Interface.Menu;
import Interface.ConsumeLoad;
import Models.User;

/**
 *
 * @author Fanfo
 */
public class ConsumeLoadController {
    public void goToMenu(ConsumeLoad consumeLoad, User usuario){
        new Menu(usuario).setVisible(true);
        consumeLoad.dispose();
    }
        
}