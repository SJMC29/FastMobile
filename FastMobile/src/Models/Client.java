
package Models;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Client;
    @OneToOne
    @JoinColumn(name="id_person",nullable = false)
    private Person person;
    @ManyToOne
    @JoinColumn(name="id_Type",nullable = false)
    private Client_Type clien_Type;
    @Column(nullable = false)
    private boolean suspended;
    @Temporal(TemporalType.DATE)
    private Date lastPayment;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Client_Phone> phones;
    
}
