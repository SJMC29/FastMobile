
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="rols")
public class Rol implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Rol;
    
    @Column(nullable = false, length = 50)
    private String name;
    
    // Constructor
    public Rol() {
    }
    
    public Rol(String name) {
        this.name = name;
    }
    
    
    // Setters and Getters
    public Integer getId_Rol() {    
        return id_Rol;
    }

    public void setId_Rol(Integer id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {    
        this.name = name;
    }

    // to String
    @Override
    public String toString() {
        return "Rol{" + "id_Rol=" + id_Rol + ", name=" + name + '}';
    }
    
}
