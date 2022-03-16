/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author EDITH
 */
@Entity(name="recipts")
public class Counter implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_receipt;
    @Column(nullable = false)
    private int counter;
    
    public Counter(){
    }
    
    public Counter(int counter){
        this.counter=counter;
    }

    public Integer getId_receipt() {
        return id_receipt;
    }

    public void setId_receipt(Integer id_receipt) {
        this.id_receipt = id_receipt;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Counter{" + "id_receipt=" + id_receipt + ", counter=" + counter + '}';
    }
    
    
}
