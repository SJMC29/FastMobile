
package Controllers;

import Models.Client_Phone;
import Persistence.Client_PhoneJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client_PhoneController {

    Client_PhoneJpaController client_PhoneJPA = new Client_PhoneJpaController();
    
    public void createClient_Phone(Client_Phone clP){
        client_PhoneJPA.create(clP);
    }
        
    public List<Client_Phone> getClient_Phones(){
        return client_PhoneJPA.findClient_PhoneEntities();
    }
    
    public Client_Phone getClient_Phone(Integer id){
        return client_PhoneJPA.findClient_Phone(id);
    }
    
    public void upDateClient_Phone(Client_Phone ph){
        try {
            client_PhoneJPA.edit(ph);
        } catch (Exception ex) {
            Logger.getLogger(Client_PhoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
