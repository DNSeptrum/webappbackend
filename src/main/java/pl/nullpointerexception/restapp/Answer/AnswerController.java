package pl.nullpointerexception.restapp.Answer;
import org.springframework.web.bind.annotation.*;
import pl.nullpointerexception.restapp.Group.GroupRepository;
import pl.nullpointerexception.restapp.Group.Groupad;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    private final AnswerRepository answerRepository;

    public AnswerController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @GetMapping
    List<Answer> getProducts(@RequestParam(required = false) String answer) {
        if (answer == null) {
            return (List<Answer>) answerRepository.findAll();
        } else {
            return answerRepository.findAllByAnswer(answer);
        }
    }

    @GetMapping("/{id}")
    Optional<Answer> getUserById(@PathVariable Long id) {
        return answerRepository.findById(id);
    }
}
