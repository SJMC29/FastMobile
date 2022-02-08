
package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="plans")
public class Plan implements Serializable {
    
    // Atributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Plan;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false)
    private int minutes;
    @Column(nullable = false)
    private int internet;
    @Column(nullable = false)
    private boolean instagram;
    @Column(nullable = false)
    private int price;

    // Contructores
    public Plan() {
    }
    
    public Plan(String name, int minutes, int internet, boolean instagram, int price) {
        this.name = name;
        this.minutes = minutes;
        this.internet = internet;
        this.instagram = instagram;
        this.price = price;
    }

    
    // Getters and Setters
    public Integer getId_Plan() {
        return id_Plan;
    }

    public void setId_Plan(Integer id_Plan) {
        this.id_Plan = id_Plan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public boolean isInstagram() {
        return instagram;
    }

    public void setInstagram(boolean instagram) {
        this.instagram = instagram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // to String
    @Override
    public String toString() {
        return "Plan{" + "id_Plan=" + id_Plan + ", name=" + name + ", minutes=" + minutes + ", internet=" + internet + ", instagram=" + instagram + ", price=" + price + '}';
    }
    
}
