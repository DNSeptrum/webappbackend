package pl.nullpointerexception.restapp.Test;

import org.springframework.stereotype.Service;
import pl.nullpointerexception.restapp.Question.NewQuestionDto;
import pl.nullpointerexception.restapp.Question.QuestionDtoMapper;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    private final TestRepository testRepository;
    private final QuestionDtoMapper questionDtoMapper;
    private final TestDtoMapper testDtoMapper;

    public TestService(TestRepository testRepository, QuestionDtoMapper questionDtoMapper, TestDtoMapper testDtoMapper) {
        this.testRepository = testRepository;
        this.questionDtoMapper = questionDtoMapper;
        this.testDtoMapper = testDtoMapper;
    }


    Optional<NewTestDto> getTestById(Long id) {
        return testRepository.findById(id)
                .map(testDtoMapper::map);
    }

    List<NewQuestionDto> getQuestionByTestId(Long testId) {
        return testRepository.findById(testId)
                .map(Test::getQuestions)
                .orElse(Collections.emptyList())
                .stream()
                .map(questionDtoMapper::map)
                .toList();
    }

    NewTestDto saveTest(NewTestDto testDto) {
        Test test = testDtoMapper.map(testDto);
        Test  savedTest = testRepository.save(test);
        return testDtoMapper.map(savedTest);
    }
}
