
package Controllers;

import Models.Person;
import Persistence.PersonJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonController {
    
    PersonJpaController personJPA = new PersonJpaController();
    
    public void createPerson(Person p){
        try {
            personJPA.create(p);
        } catch (Exception ex) {
            Logger.getLogger(PersonController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public List<Person> getPeople(){
        return personJPA.findPersonEntities();
    }
    
    public Person getPerson(String id){
        return personJPA.findPerson(id);
    }
    
}
