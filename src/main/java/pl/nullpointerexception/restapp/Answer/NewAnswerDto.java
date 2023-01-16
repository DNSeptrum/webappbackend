package pl.nullpointerexception.restapp.Answer;

public class NewAnswerDto {

    private Long id;
    private String answer;

    public NewAnswerDto(String answer) {
        this.answer = answer;
    }

    public NewAnswerDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
