package pl.nullpointerexception.restapp.user;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    List<User> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<User>) userRepository.findAll();
        } else {
            return userRepository.findAllByname(name);
        }
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

   // @GetMapping("/{id}/producer")
   // User getUserByProductId(@PathVariable Long id) {
   //     return userRepository.findById(id).getUser;
  //  }
}