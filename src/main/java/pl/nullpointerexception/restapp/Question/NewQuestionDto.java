package pl.nullpointerexception.restapp.Question;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import pl.nullpointerexception.restapp.Answer.Answer;

import java.util.ArrayList;
import java.util.List;

public class NewQuestionDto {

    private int id;

    private String text;
    private int CorrectAnswer;
    // private String answer;



    @OneToMany(fetch = FetchType.EAGER)
    private List<Answer> answers = new ArrayList<>();

    public NewQuestionDto() {

    }

    public void addQuestion(Answer answer) {
        answers.add(answer);
    }

    public NewQuestionDto( String text, int correctAnswer) {

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
