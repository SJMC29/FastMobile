/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.Client_TypeController;
import Interface.RegisterClient;
import Models.Client_Type;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Mateo Obando
 */
public class ClientController {
    
      
      Client_TypeController typeControl = new Client_TypeController();  
      List<Client_Type> types;
    public void sendForm(RegisterClient rc){
        System.out.println(rc.getjTextFieldNombre());
    }
    
    public void loadPlans(JComboBox<String> lista){
        types = typeControl.getClient_Types();
        lista.removeAllItems();
        for(int i=0;i<types.size();i++){
            lista.addItem(types.get(i).getName());
        }
    }
    
}
