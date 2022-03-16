
package Controllers;

import Models.Client_Phone;
import Persistence.Client_PhoneJpaController;
import java.util.List;

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
    
}
