package pl.nullpointerexception.restapp.Answer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    private final AnswerRepository answerRepository;
    private final AnswerService answerService;
    public AnswerController(AnswerRepository answerRepository, AnswerService answerService) {
        this.answerRepository = answerRepository;
        this.answerService = answerService;
    }

    @GetMapping
    List<Answer> getProducts(@RequestParam(required = false) String answer) {
        if (answer == null) {
            return (List<Answer>) answerRepository.findAll();
        } else {
            return answerRepository.findAllByAnswer(answer);
        }
    }

   // @GetMapping("/{id}/a")
   // Optional<Answer> getUserById(@PathVariable Long id) {
   //     return answerRepository.findById(id);
  //  }

    @GetMapping("/{id}")
    ResponseEntity<NewAnswerDto> getAnswerById(@PathVariable Long id) {
        return answerService.getAnswerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    ResponseEntity<NewAnswerDto> saveAnswer(@RequestBody NewAnswerDto AnswerDto) {
        NewAnswerDto savedAnswer = answerService.saveAnswer(AnswerDto);
        URI savedJobOfferUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedAnswer.getId())
                .toUri();
        return ResponseEntity.created(savedJobOfferUri).body(savedAnswer);
    }
}
