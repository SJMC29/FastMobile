
package Models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="client_phones")
public class Client_Phone implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Phone;
    @ManyToOne
    @JoinColumn(name="id_Client", nullable = false)
    private Client client;
    @Column(length = 50,nullable = false, unique = true)
    private String phone_Number;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="id_Plan",nullable = false)
    private Plan plan;
    
    // Contructores
    public Client_Phone() {
    }

    public Client_Phone(Client client, String phone_Number, Plan plan) {
        this.client = client;
        this.phone_Number = phone_Number;
        this.plan = plan;
    }
    
    // Getters and Setters
    public Integer getId_Phone() {
        return id_Phone;
    }

    public void setId_Phone(Integer id_Phone) {
        this.id_Phone = id_Phone;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    
    // to String
    @Override
    public String toString() {
        return "Client_Phone{" + "id_Phone=" + id_Phone + ", client=" + client.getId_Client() + ", phone_Number=" + phone_Number + ", plan=" + plan + '}';
    }
    
    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Client_Phone)
        {
            sameSame = this.id_Phone == ((Client_Phone) object).id_Phone;
        }

        return sameSame;
    }
}
