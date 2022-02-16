
package Controllers;

import Models.Client;
import Persistence.ClientJpaController;
import Persistence.exceptions.IllegalOrphanException;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;

public class ClientController {
   
    ClientJpaController clientJPA = new ClientJpaController();
    
    public void createClient(Client c){
        clientJPA.create(c);
    }
      
   public void destroyClient(Integer id) throws NonexistentEntityException, IllegalOrphanException{
       clientJPA.destroy(id);
   }
    
    public List<Client> getClients(){
        return clientJPA.findClientEntities();
    }
    
    public Client getClient(Integer id){
        return clientJPA.findClient(id);
    }
    
}
