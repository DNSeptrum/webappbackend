package pl.nullpointerexception.restapp.user;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private  final  UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }


    @GetMapping
    List<User> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<User>) userRepository.findAll();
        } else {
            return (List<User>) userRepository.findAllByname(name);
        }
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    ResponseEntity<NewUserDto> saveUser(@RequestBody NewUserDto user) {
        NewUserDto savedUser = userService.saveUser(user);
        URI savedCompanyUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(savedCompanyUri).body(savedUser);
    }
}
