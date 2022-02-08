
package Controllers;

import Models.Client;
import Persistence.ClientJpaController;
import java.util.List;

public class ClientController {
   
    ClientJpaController clientJPA = new ClientJpaController();
    
    public void createClient(Client c){
        clientJPA.create(c);
    }
        
    public List<Client> getClients(){
        return clientJPA.findClientEntities();
    }
    
    public Client getClient(Integer id){
        return clientJPA.findClient(id);
    }
    
}
