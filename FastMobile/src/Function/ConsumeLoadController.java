/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.Client_PhoneController;
import Controllers.ConsumeController;
import Interface.Menu;
import Interface.ConsumeLoad;
import Models.Client_Phone;
import Models.Consume;
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
public class ConsumeLoadController {
    
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Client_PhoneController phoneController = new Client_PhoneController();
    ConsumeController consumeController = new ConsumeController();
    
    public void goToMenu(ConsumeLoad consumeLoad, User usuario){
        new Menu(usuario).setVisible(true);
        consumeLoad.dispose();
    }
    
    public void loadConsumes(File file) throws ParseException{
        
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                String [] c = scan.nextLine().split(";");
                Client_Phone ph = phoneController.getClient_PhoneByNumber(c[0]); 
                if(ph!=null){
                    Consume consumo = new Consume(ph, parseInt(c[1]),parseInt(c[2]),format.parse(c[3]));
                    //System.out.println("consumo = " + consumo);
                    consumeController.createConsume(consumo);
                } else {
                    System.out.println("No se encontro el Numero");
                }
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsumeLoadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}