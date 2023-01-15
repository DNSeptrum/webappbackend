package pl.nullpointerexception.restapp.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import pl.nullpointerexception.restapp.Repository.GroupRepository;
import pl.nullpointerexception.restapp.Model.Groupad;
@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupRepository groupRepository;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @GetMapping
    List<Groupad> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<Groupad>) groupRepository.findAll();
        } else {
            return groupRepository.findAllByname(name);
        }
    }

    @GetMapping("/{id}")
    Optional<Groupad> getUserById(@PathVariable Long id) {
        return groupRepository.findById(id);
    }

    // @GetMapping("/{id}/producer")
    // User getUserByProductId(@PathVariable Long id) {
    //     return userRepository.findById(id).getUser;
    //  }
}
