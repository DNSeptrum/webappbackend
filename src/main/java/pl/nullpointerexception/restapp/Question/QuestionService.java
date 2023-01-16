package pl.nullpointerexception.restapp.Question;
import org.springframework.stereotype.Service;
import pl.nullpointerexception.restapp.Answer.AnswerDtoMapper;
import pl.nullpointerexception.restapp.Answer.NewAnswerDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionDtoMapper questionDtoMapper;
    private final AnswerDtoMapper answerDtoMapper;

    public QuestionService(QuestionRepository questionRepository, QuestionDtoMapper questionDtoMapper, AnswerDtoMapper answerDtoMapper) {
        this.questionRepository = questionRepository;
        this.questionDtoMapper = questionDtoMapper;
        this.answerDtoMapper = answerDtoMapper;
    }

    Optional<NewQuestionDto> getQuestionById(Long id) {
        return questionRepository.findById(id)
                .map(questionDtoMapper::map);
    }

    List<NewAnswerDto> getAnswerByQuestionId(Long questionId) {
        return questionRepository.findById(questionId)
                .map(Question::getAnswers)
                .orElse(Collections.emptyList())
                .stream()
                .map(answerDtoMapper::map)
                .toList();
    }

    NewQuestionDto saveQuestion(NewQuestionDto questionDto) {
        Question question = questionDtoMapper.map(questionDto);
        Question savedQuestion = questionRepository.save(question);
        return questionDtoMapper.map(savedQuestion);
    }

    Optional<NewQuestionDto> replaceCompany(Long questionId, NewQuestionDto questionDto) {
        if (!questionRepository.existsById(questionId)) {
            return Optional.empty();
        }
        questionDto.setId(questionId);
        Question companyToUpdate = questionDtoMapper.map(questionDto);
        Question updatedEntity = questionRepository.save(companyToUpdate);
        return Optional.of(questionDtoMapper.map(updatedEntity));
    }
}
