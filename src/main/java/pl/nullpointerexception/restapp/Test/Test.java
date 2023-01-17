package pl.nullpointerexception.restapp.Test;



import jakarta.persistence.*;
import pl.nullpointerexception.restapp.Question.Question;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name = "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int creator;
    private Date date;
    private Date startingDate;
    private int timePerQuestion;
    private int maxPoint;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Question> questions = new ArrayList<>();
    public void addQuestion(Question question) {
        questions.add(question);
    }


    public Test() {
    }

    public Test( String name, int creator, Date date, Date startingDate, int timePerQuestion, int maxPoint) {

        this.name = name;
        this.creator = creator;
        this.date = date;
        this.startingDate = startingDate;
        this.timePerQuestion = timePerQuestion;
        this.maxPoint = maxPoint;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public int getTimePerQuestion() {
        return timePerQuestion;
    }

    public void setTimePerQuestion(int timePerQuestion) {
        this.timePerQuestion = timePerQuestion;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", date=" + date +
                ", startingDate=" + startingDate +
                ", timePerQuestion=" + timePerQuestion +
                ", maxPoint=" + maxPoint +
                '}';
    }
}
