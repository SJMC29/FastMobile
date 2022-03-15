/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.ClientController;
import Controllers.PaymentConroller;
import Interface.Menu;
import Interface.PaymentLoad;
import Models.Client;
import Models.Payment;
import Models.User;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fanfo
 */
public class PaymentLoadController {
    
    ClientController clientControl = new ClientController();
    PaymentConroller paymnetControl =  new PaymentConroller();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    public void goToMenu(PaymentLoad paymentLoad, User usuario){
        new Menu(usuario).setVisible(true);
        paymentLoad.dispose();
    }

    public void loadPayments(PaymentLoad pL, File file, User u) throws ParseException {
    
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String [] line = scan.nextLine().split(";");
                Client c = clientControl.getClienteByPerson(line[0]);
                if(c!=null){
                    Payment pay = new Payment(c, parseInt(line[1]), format.parse(line[2]));
                    //System.out.println("pay = " + pay);
                    paymnetControl.createPayment(pay);
                    c.setLastPayment(format.parse(line[2]));
                    clientControl.upDateClient(c);
                } else {
                    System.out.println("No se encontro el Cliente");
                }
            }
            scan.close();
            new Menu(u).setVisible(true);
            pL.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PaymentLoadController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
        
}