
package Models;

import Controllers.Client_TypeController;
import Controllers.RolController;

public class Tests {

    public static void main(String[] args) {
        // TODO code application logic here
        
        RolController rolControl = new RolController();
        Client_TypeController typeControl = new  Client_TypeController();
        
        /*Creacion de roles
        Rol rol_1 = new Rol("Administrador");
        Rol rol_2 = new Rol("Gerente");
        Rol rol_3 = new Rol("Operador");
        
        rolControl.createRol(rol_1);
        rolControl.createRol(rol_2);
        rolControl.createRol(rol_3);
        */
        
        /*Creacion de tipos de cliente
        Client_Type type_1 = new Client_Type("Natural");
        Client_Type type_2 = new Client_Type("Corporativo");
        typeControl.createClient_Type(type_1);
        typeControl.createClient_Type(type_2);
        */
        /*
        for(Client_Type c: typeControl.getClient_Types()){
            System.out.println(c);
      
        }
          */
    }
    
}
