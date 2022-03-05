/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Interface.Menu;
import Interface.PaymentLoad;
import Models.User;

/**
 *
 * @author Fanfo
 */
public class PaymentLoadController {
    public void goToMenu(PaymentLoad paymentLoad, User usuario){
        new Menu(usuario).setVisible(true);
        paymentLoad.dispose();
    }
        
}