package pl.nullpointerexception.restapp.Answer;

import org.springframework.stereotype.Service;
import pl.nullpointerexception.restapp.Question.Question;
import pl.nullpointerexception.restapp.Question.QuestionRepository;


@Service
public class AnswerDtoMapper {
    private final QuestionRepository questionRepository;

    public AnswerDtoMapper(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

     public NewAnswerDto map(Answer answer) {
        NewAnswerDto dto= new NewAnswerDto();
        dto.setId(answer.getId());
        dto.setAnswer(answer.getAnswer());
        return dto;
    }

    Answer map(NewAnswerDto dto) {
        Answer answer = new Answer();
        answer.setId(dto.getId());
        answer.setAnswer(dto.getAnswer());
       // Question question = questionRepository.findById(dto.getQuestionId()).orElseThrow();
      //  answer.setQuestion(question);
        return answer;
    }
}
