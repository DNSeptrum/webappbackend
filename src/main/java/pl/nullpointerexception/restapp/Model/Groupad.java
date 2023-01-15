package pl.nullpointerexception.restapp.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Groupad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private int creator;
    private Date date;
    @ManyToMany
    private List<Test> tests = new ArrayList<>();

    public void addTest(Test test) {
        tests.add(test);
    }
    @ManyToMany
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    @ManyToMany
    private List<User> members = new ArrayList<>();

    public void addUser(User user) {
        members.add(user);
    }

    public Groupad() {
    }

    public Groupad(String name, int creator, Date date) {
        this.name = name;
        this.creator = creator;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public List<User> getUsers() {
        return members;
    }

    public void setUsers(List<User> users) {
        this.members = users;
    }

    @Override
    public String toString() {
        return "Groupad{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", date=" + date +
                ", tasks=" + tasks +
                ", tests=" + tests +
                ", members=" + members +
                '}';
    }
}