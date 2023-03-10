package pl.nullpointerexception.restapp.Question;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.nullpointerexception.restapp.Answer.NewAnswerDto;
import pl.nullpointerexception.restapp.Answer.AnswerService;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;
    private final QuestionService questionService ;



    public QuestionController(QuestionRepository questionRepository, QuestionService questionService) {
        this.questionRepository = questionRepository;
        this.questionService = questionService;

    }

    @GetMapping
    List<Question> getProducts(@RequestParam(required = false) String text) {
        if (text == null) {
            return (List<Question>) questionRepository.findAll();
        } else {
            return questionRepository.findAllByText(text);
        }
    }


    @GetMapping("/{id}")
    ResponseEntity<NewQuestionDto> getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/answers")
    ResponseEntity<List<NewAnswerDto>> getQuestionAnswer(@PathVariable Long id) {
        if (questionService.getQuestionById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(questionService.getAnswerByQuestionId(id));
    }

    @PostMapping
    ResponseEntity<NewQuestionDto> saveQuestion(@RequestBody NewQuestionDto question) {
        NewQuestionDto savedCompany = questionService.saveQuestion(question);
        URI savedCompanyUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCompany.getId())
                .toUri();
        return ResponseEntity.created(savedCompanyUri).body(savedCompany);
    }


    @PutMapping("/{id}")
    ResponseEntity<?> replaceQuestion(@PathVariable Long id, @RequestBody NewQuestionDto question) {
        return questionService.replaceQuestion(id, question)
                .map(c -> ResponseEntity.noContent().build())
                .orElse(ResponseEntity.notFound().build());
    }


}
