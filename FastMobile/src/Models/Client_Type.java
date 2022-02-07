package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "client_Types")
public class Client_Type implements Serializable {
    
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_type;
    @Column(nullable = false, length = 50)
    private String name;
    
    //Constructores

    public Client_Type() {
    }

    public Client_Type(String name) {
        this.name = name;
    }
    
    //Setters and Getters

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //to string

    @Override
    public String toString() {
        return "Client_Type{" + "id_type=" + id_type + ", name=" + name + '}';
    }
    
    
}
