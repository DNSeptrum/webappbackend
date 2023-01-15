package pl.nullpointerexception.restapp.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.nullpointerexception.restapp.Question.NewQuestionDto;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {

    private final TestRepository testRepository;
     private final TestService testService;
    public TestController(TestRepository testRepository, TestService testService) {
        this.testRepository = testRepository;
        this.testService = testService;
    }

    @GetMapping
    List<Test> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<Test>) testRepository.findAll();
        } else {
            return testRepository.findAllByname(name);
        }
    }

   // @GetMapping("/{id}")
    //Optional<Test> getUserById(@PathVariable Long id) {
    //    return testRepository.findById(id);
   // }

    @GetMapping("/{id}")
    ResponseEntity<NewTestDto> getTestById(@PathVariable Long id) {
        return testService.getTestById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/questions")
    ResponseEntity<List<NewQuestionDto>> getQuestionOffers(@PathVariable Long id) {
        if (testService.getTestById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(testService.getQuestionByTestId(id));
    }

    @PostMapping
    ResponseEntity<NewTestDto> saveTest(@RequestBody NewTestDto test) {
        NewTestDto savedTest = testService.saveTest(test);
        URI savedCompanyUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedTest.getId())
                .toUri();
        return ResponseEntity.created(savedCompanyUri).body(savedTest);
    }


}
