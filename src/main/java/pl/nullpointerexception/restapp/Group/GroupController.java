package pl.nullpointerexception.restapp.Group;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupRepository groupRepository;
    private final  GroupService groupService;

    public GroupController(GroupRepository groupRepository, GroupService groupService) {
        this.groupRepository = groupRepository;
        this.groupService = groupService;
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

    @PostMapping
    ResponseEntity<NewGroupDto> saveOcena(@RequestBody NewGroupDto GroupDto) {
        NewGroupDto savedGroup = groupService.saveGroup(GroupDto);
        URI savedJobOfferUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedGroup.getId())
                .toUri();
        return ResponseEntity.created(savedJobOfferUri).body(savedGroup);
    }
}
