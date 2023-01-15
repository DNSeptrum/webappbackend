package pl.nullpointerexception.restapp.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;
    private int CorrectAnswer;
   // private String answer;



    @OneToMany(fetch = FetchType.EAGER)
    private List<Answer> answers = new ArrayList<>();
    public void addQuestion(Answer answer) {
        answers.add(answer);
    }


    public Question() {
    }

    public Question( String text, int correctAnswer) {

        this.text = text;
        CorrectAnswer = correctAnswer;
       // this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        CorrectAnswer = correctAnswer;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }



}
