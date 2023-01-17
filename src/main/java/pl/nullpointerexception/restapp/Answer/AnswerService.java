package pl.nullpointerexception.restapp.Answer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;
    private final AnswerDtoMapper answerDtoMapper;

    public AnswerService(AnswerRepository answerRepository, AnswerDtoMapper answerDtoMapper) {
        this.answerRepository = answerRepository;
        this.answerDtoMapper = answerDtoMapper;
    }

    Optional<NewAnswerDto> getAnswerById(Long id) {
        return answerRepository.findById(id)
                .map(answerDtoMapper::map);
    }

    public NewAnswerDto saveAnswer(NewAnswerDto AnswerDto) {
        Answer answerToSave = answerDtoMapper.map(AnswerDto);
        //answerToSave.setDateAdded(LocalDateTime.now());
        Answer savedAnswer = answerRepository.save(answerToSave);
        return answerDtoMapper.map(savedAnswer);
    }
}
