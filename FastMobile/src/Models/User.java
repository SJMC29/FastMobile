
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="users")
public class User implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name="id_Person")
    private Person person;
    @Column(nullable = false ,length = 50)
    private String password;
    @Basic
    private boolean active;
    @ManyToOne
    @JoinColumn(name="id_Rol")
    private Rol rol;

    // Contructors
    public User() {
    }

    public User(Person person, String password, boolean active, Rol rol) {
        this.person = person;
        this.password = password;
        this.active = active;
        this.rol = rol;
    }
    
    // Setters and Getters

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    // to String

    @Override
    public String toString() {
        return "User{" + "person=" + person + ", password=" + password + ", active=" + active + ", rol=" + rol + '}';
    }
    
}
