
package Models;

import Controllers.ClientController;
import Controllers.Client_PhoneController;
import Controllers.Client_TypeController;
import Controllers.PersonController;
import Controllers.PlanController;
import Controllers.RolController;
import Controllers.UserController;
import Interface.ProfileClients;
import Interface.RegisterUser;
import Persistence.exceptions.IllegalOrphanException;
import Persistence.exceptions.NonexistentEntityException;

public class Tests {

    public static void main(String[] args) throws NonexistentEntityException, IllegalOrphanException {
        // TODO code application logic here
        
        Client_PhoneController phoneControl = new Client_PhoneController();
        ClientController clientControl = new ClientController();
        RolController rolControl = new RolController();
        Client_TypeController typeControl = new  Client_TypeController();
        PlanController planControl = new PlanController();
        PersonController personControl = new PersonController();
        UserController userControl = new UserController();
        /*// Creacion de roles
        Rol rol_1 = new Rol("Administrador");
        Rol rol_2 = new Rol("Gerente");
        Rol rol_3 = new Rol("Operador");
        
        rolControl.createRol(rol_1);
        rolControl.createRol(rol_2);
        rolControl.createRol(rol_3);
        */
        
        /*// Creacion de tipos de cliente
        Client_Type type_1 = new Client_Type("Natural");
        Client_Type type_2 = new Client_Type("Corporativo");
        typeControl.createClient_Type(type_1);
        typeControl.createClient_Type(type_2);
        
       
        }
          */
        /*
        Person per_1 = new Person("1193477073", "Alejandro", "Caicedo", "alejandrocaicedo21216@gmail.com", "3153990050", "Calle 72F #5N-23", 123333.12, 94.377777);
        personControl.createPerson(per_1);
        */
        /*
        Person per_1 = personControl.getPerson("1193477073");
        System.out.println(per_1);
        Rol rol_1 = rolControl.getRol(1);
        User user_1 = new User(per_1, "Admin", true, rol_1);
        userControl.createUser(user_1);
        */
        
        /*for(User u :userControl.getUsers()){
            System.out.println(u);            
        }
        
        User u = userControl.getUser("1193477073");
        Client cliente = clientControl.getClient(1);*/
        
        
       // Plan pl_2 = new Plan("Plan de 25 GB",750,25,true,44990);
       //planControl.createPlan(pl_2);
        
        /*
        for(Client_Type cl: typeControl.getClient_Types()){
            System.out.println(cl);
        }
        */
        
        //personControl.destroyPerson("19831237833");
        
        
        for(Client c: clientControl.getClients()){
            System.out.println(c);
        }
        
        //personControl.destroyPerson("19831237833");
        //clientControl.destroyClient(1);
        
        /*
        for(Client c: clientControl.getClients()){
            System.out.println(c);
        }
        personControl.destroyPerson("19831237833");*/
        
        //for(Client_Phone p: phoneControl.getClient_Phones()){
        //    System.out.println(p);
        //}
        
        //for(Client c: clientControl.getClients()){
        //    System.out.println(c);
        //}
        
    }
    
    
}
