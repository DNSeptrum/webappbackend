package pl.nullpointerexception.restapp.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Optional;

@Entity
public class Ocena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    private int value;

    private int taskID;
    private Date Data;
    private String score;
  //  @ManyToOne
  //  @JoinColumn(name = "user_id")
  //  private User user;



 public Ocena(String type,int value,int taskID,Date Data,String score){
     this.type = type;
     this.value = value;
     this.taskID = taskID;
     this.Data = Data;
     this.score = score;
    // this.user = user;
 }

    public Ocena() {

    }

    public void setData(Date data) {
        Data = data;
    }

    public Date getData() {
        return Data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

   // public User getUser() {
   //     return user;
   // }

   // public void setUser(User user) {
    //    this.user = user;
   // }


}
