/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Client_Phone;
import Models.Consume;
import Persistence.ConsumeJpaController;
import java.util.ArrayList;
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
    
    public List<String> getMonthlyConsumes (String[] dates, Client_Phone ph){
        List<Consume> list = consumeJPA.findMonthlyConsumes(dates, ph);
        int minutes = 0;
        int megas = 0;
        for (Consume c: list) {
            minutes+=c.getMinutesConsume();
            megas+=c.getInternetConsume();
        }
        List<String> results = new ArrayList<String>();
        results.add(Integer.toString(minutes));
        results.add(Integer.toString(megas));
        return results;
    }  
    
    
}
