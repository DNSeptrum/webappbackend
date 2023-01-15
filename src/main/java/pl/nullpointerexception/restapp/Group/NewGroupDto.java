package pl.nullpointerexception.restapp.Group;

import jakarta.persistence.ManyToMany;
import pl.nullpointerexception.restapp.Task.Task;
import pl.nullpointerexception.restapp.Test.Test;
import pl.nullpointerexception.restapp.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewGroupDto {

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


    public NewGroupDto(String name, int creator, Date date) {
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

}
