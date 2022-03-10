/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Consume;
import Persistence.ConsumeJpaController;
import java.util.List;

/**
 *
 * @author EDITH
 */
public class ConsumeController {
 
    ConsumeJpaController consumeJPA = new ConsumeJpaController();
    
    public void createConsume(Consume c){
        consumeJPA.create(c);
    }
    
    public List<Consume> getConumes(){
        return consumeJPA.findConsumeEntities();
    }
}
