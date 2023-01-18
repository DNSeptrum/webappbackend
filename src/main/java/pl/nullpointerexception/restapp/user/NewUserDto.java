package pl.nullpointerexception.restapp.user;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import pl.nullpointerexception.restapp.Ocena.Ocena;

import java.util.ArrayList;
import java.util.List;

public class NewUserDto {

    private Long id;
    private String email;
    private String name;
    private String surname;
    private String password;
    private String role;

    private int lastGradeID;
    private boolean isLoggedIn;


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Ocena> grades = new ArrayList<>();

    public NewUserDto() {

    }

    public void addOcena(Ocena ocena) {
        grades.add(ocena);
    }

    public NewUserDto(String email, String name, String surname, String password, String role, int lastGradeID, boolean isLoggedIn) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.role = role;
        this.lastGradeID = lastGradeID;
        this.isLoggedIn = isLoggedIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Ocena> getGrades() {
        return grades;
    }

    public void setGrades(List<Ocena> grades) {
        this.grades = grades;
    }

    public int getLastGradeID() {
        return lastGradeID;
    }

    public void setLastGradeID(int lastGradeID) {
        this.lastGradeID = lastGradeID;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

}
