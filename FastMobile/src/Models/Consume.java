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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author EDITH
 */
@Entity(name="Consumes")
@NamedQueries({
        @NamedQuery(name = "Monthly_Consumes", 
                    query = "select c from Consumes c where c.consumeDate BETWEEN CAST (:startDate AS DATE) AND CAST (:endDate AS DATE) AND c.phone=:phone"),
        //@NamedQuery(name = "UsersRol",
                    //query = "SELECT u FROM users u WHERE u.rol = :rol")
    })

public class Consume implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Consume;
    @ManyToOne
    @JoinColumn(name="id_Phone", nullable = false)
    private Client_Phone phone;
    @Column(nullable = false)
    private int minutesConsume;
    @Column(nullable = false)
    private int internetConsume;
    @Temporal(TemporalType.DATE)
    private Date consumeDate;

    // Constructores
    public Consume(){
    }

    public Consume(Client_Phone phone, int minutesConsume, int internetConsume, Date consumeDate) {
        this.phone = phone;
        this.minutesConsume = minutesConsume;
        this.internetConsume = internetConsume;
        this.consumeDate = consumeDate;
    }
    
    // Setter y Getters

    public Integer getId_Consume() {
        return id_Consume;
    }

    public void setId_Consume(Integer id_Consume) {
        this.id_Consume = id_Consume;
    }

    public Client_Phone getPhone() {
        return phone;
    }

    public void setPhone(Client_Phone phone) {
        this.phone = phone;
    }

    public int getMinutesConsume() {
        return minutesConsume;
    }

    public void setMinutesConsume(int minutesConsume) {
        this.minutesConsume = minutesConsume;
    }

    public int getInternetConsume() {
        return internetConsume;
    }

    public void setInternetConsume(int internetConsume) {
        this.internetConsume = internetConsume;
    }

    public Date getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
    }
    
    // to String

    @Override
    public String toString() {
        return "Consume{" + "id_Consume=" + id_Consume + ", phone=" + phone + ", minutesConsume=" + minutesConsume + ", internetConsume=" + internetConsume + ", consumeDate=" + consumeDate + '}';
    }
    
}
