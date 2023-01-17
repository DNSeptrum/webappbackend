package pl.nullpointerexception.restapp.Question;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import pl.nullpointerexception.restapp.Answer.Answer;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private int CorrectAnswer;
   // private String answer;



    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Answer> answers = new ArrayList<>();

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }


    public Question() {
    }

    public Question( String text, int correctAnswer) {

        this.text = text;
        CorrectAnswer = correctAnswer;
       // this.answer = answer;
    }

    public Question(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
