
package Models;

import Controllers.Client_TypeController;
import Controllers.PersonController;
import Controllers.PlanController;
import Controllers.RolController;
import Controllers.UserController;

public class Tests {

    public static void main(String[] args) {
        // TODO code application logic here
        
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
        
        for(Client_Type c: typeControl.getClient_Types()){
            System.out.println(c);
        }
          */
        
        Person per_1 = new Person("1193477073", "Alejandro", "Caicedo", "alejandrocaicedo21216@gmail.com", "3153990050", "Calle 72F #5N-23", 123333.12, 94.377777);
        personControl.createPerson(per_1);
    }
    
}
