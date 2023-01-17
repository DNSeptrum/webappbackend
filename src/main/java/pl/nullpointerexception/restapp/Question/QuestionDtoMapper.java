package pl.nullpointerexception.restapp.Question;
import org.springframework.stereotype.Service;

@Service
public class QuestionDtoMapper {

    public NewQuestionDto map(Question question) {
        NewQuestionDto dto= new NewQuestionDto();
        dto.setId(question.getId());
        dto.setText(question.getText());
        dto.setCorrectAnswer(question.getCorrectAnswer());
        dto.setAnswers(question.getAnswers());
        return dto;
    }

    Question map(NewQuestionDto dto) {
        Question question = new Question();
        question.setId(dto.getId());
        question.setText(dto.getText());
        question.setCorrectAnswer(dto.getCorrectAnswer());
        question.setAnswers(dto.getAnswers());

        return question;
    }
}
