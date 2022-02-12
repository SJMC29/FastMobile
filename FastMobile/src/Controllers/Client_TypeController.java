package Controllers;

import Models.Client_Type;
import Persistence.Client_TypeJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;


public class Client_TypeController {
    
    Client_TypeJpaController client_TypeJPA = new Client_TypeJpaController();
    
    
    public void createClient_Type(Client_Type Clt){
        client_TypeJPA.create(Clt);
        
    }
        
    public List<Client_Type> getClient_Types(){
        return client_TypeJPA.findClient_TypeEntities();
    }
    
    public Client_Type getClient_Type(Integer id){
        return client_TypeJPA.findClient_Type(id);
    }
}
