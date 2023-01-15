package pl.nullpointerexception.restapp.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import pl.nullpointerexception.restapp.Repository.QuestionRepository;
import pl.nullpointerexception.restapp.Model.Question;
@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
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
    Optional<Question> getUserById(@PathVariable Long id) {
        return questionRepository.findById(id);
    }
}
