/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author EDITH
 */
@Entity(name="payments")
public class Payment implements Serializable {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Payment;
    @ManyToOne
    @JoinColumn(name="id_Client", nullable = false)
    private Client cliente;
    @Column(nullable = false)
    private int amount;
    @Temporal(TemporalType.DATE)
    private Date payDate; 
    
    //Constructores
    public Payment() {
    }
    
    public Payment(Client cliente, int amount, Date payDate) {
        this.cliente = cliente;
        this.amount = amount;
        this.payDate = payDate;
    }
    
    //Setters y getters
    public Integer getId_Payment() {
        return id_Payment;
    }

    public void setId_Payment(Integer id_Payment) {
        this.id_Payment = id_Payment;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    
    //to String

    @Override
    public String toString() {
        return "Payment{" + "id_Payment=" + id_Payment + ", cliente=" + cliente.getId_Client() + ", amount=" + amount + ", payDate=" + payDate + '}';
    }
    
}
