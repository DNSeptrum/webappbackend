package pl.nullpointerexception.restapp.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import pl.nullpointerexception.restapp.Repository.TestRepository;
import pl.nullpointerexception.restapp.Model.Test;
@RestController
@RequestMapping("/tests")
public class TestController {

    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping
    List<Test> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<Test>) testRepository.findAll();
        } else {
            return testRepository.findAllByname(name);
        }
    }

    @GetMapping("/{id}")
    Optional<Test> getUserById(@PathVariable Long id) {
        return testRepository.findById(id);
    }

    // @GetMapping("/{id}/producer")
    // User getUserByProductId(@PathVariable Long id) {
    //     return userRepository.findById(id).getUser;
    //  }
}
