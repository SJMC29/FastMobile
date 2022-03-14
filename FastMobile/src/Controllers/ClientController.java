
package Controllers;

import Models.Client;
import Models.Person;
import Persistence.ClientJpaController;
import Persistence.exceptions.IllegalOrphanException;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public List<Client> getClients(int cantidadAMostrar, int primerElemento){
        return clientJPA.findClientEntities(cantidadAMostrar, primerElemento);
    }
    
    public int getCounterClientes(){
        return clientJPA.getClientCount();
    }
    
    public void upDateClient(Client c){
        try {
            clientJPA.edit(c);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Client getClienteByPerson(String id_Person){
        return clientJPA.findClientByPerson(id_Person);
    }
}
