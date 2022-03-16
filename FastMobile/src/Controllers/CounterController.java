/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Counter;
import Persistence.CounterJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDITH
 */
public class CounterController {
    
    CounterJpaController counterJPA = new CounterJpaController();
    
    public void createCounter(){
        Counter c =  new Counter(0);
        counterJPA.create(c);
    }
    
    public int getCounter(){
        return counterJPA.findCounter(1).getCounter();
    }
    
    public void upDate(){
        Counter c = counterJPA.findCounter(1);
        int x = c.getCounter();
        x += 1;
        c.setCounter(x);
        try {
            counterJPA.edit(c);
        } catch (Exception ex) {
            Logger.getLogger(CounterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
