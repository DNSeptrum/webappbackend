package pl.nullpointerexception.restapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Groupad {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Password;
    private double adminID;

    public Groupad() {
    }

    public Groupad(Long id,String Name, String Password, double adminID) {
        this.id = id;
        this.Name = Name;
        this.Password = Password;
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Groupad{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", password='" + Password + '\'' +
                ", ID=" + adminID +
                '}';
    }
}