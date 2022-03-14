
package Models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="clients")
@NamedQueries({
        @NamedQuery(name = "Client_Person", 
                    query = "SELECT c FROM clients c WHERE c.person = :person"),
        //@NamedQuery(name = "UsersRol",
                    //query = "SELECT u FROM users u WHERE u.rol = :rol")
    })
public class Client implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Client;
    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="id_person",nullable = false)
    private Person person;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="id_type",nullable = false)
    private Client_Type clien_Type;
    @Column(nullable = false)
    private boolean suspended; 
    @Temporal(TemporalType.DATE)
    private Date lastPayment;
    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "client")
    private List<Client_Phone> phones;
    
    // Constructores
    public Client() {
    }

    public Client(Person person, Client_Type clien_Type, boolean suspended, Date lastPayment) {
        this.person = person;
        this.clien_Type = clien_Type;
        this.suspended = suspended;
        this.lastPayment = lastPayment;
    }

    // Stters and Getters
    public Integer getId_Client() {
        return id_Client;
    }

    public void setId_Client(Integer id_Client) {
        this.id_Client = id_Client;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Client_Type getClien_Type() {
        return clien_Type;
    }

    public void setClien_Type(Client_Type clien_Type) {
        this.clien_Type = clien_Type;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public Date getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(Date lastPayment) {
        this.lastPayment = lastPayment;
    }

    public List<Client_Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Client_Phone> phones) {
        this.phones = phones;
    }

    // to String
    @Override
    public String toString() {
        return "Client{" + "id_Client=" + id_Client + ", person=" + person + ", clien_Type=" + clien_Type + ", suspended=" + suspended + ", lastPayment=" + lastPayment + ", phones=" + phones + '}';
    }
}
