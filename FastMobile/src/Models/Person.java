
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="people")
public class Person implements Serializable {
    
    // Atributos
    @Id
    @Column(length = 50)
    private String id_Person;
    @Column(nullable = false,length = 50)
    private String name;
    @Column(nullable = false,length = 50)
    private String lastName;
    @Column(nullable = false,length = 50,unique = true)
    private String eMail;
    @Column(nullable = false,length = 50)
    private String phone;
    @Column(nullable = false,length = 80)
    private String address;
    @Basic
    private double latitude;
    private double longitude;
    
    // Contructores

    public Person() {
    }

    public Person(String id_Person, String name, String lastName, String eMail, String phone, String address, double latitude, double longitude) {
        this.id_Person = id_Person;
        this.name = name;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    // Setters and Getter

    public String getId_Person() {
        return id_Person;
    }

    public void setId_Person(String id_Person) {
        this.id_Person = id_Person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    // to String

    @Override
    public String toString() {
        return "Person{" + "id_Person=" + id_Person + ", name=" + name + ", lastName=" + lastName + ", eMail=" + eMail + ", phone=" + phone + ", address=" + address + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
    
}
