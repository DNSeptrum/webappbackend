package pl.nullpointerexception.restapp.Ocena;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ocena")
public class OcenaController {

    private final OcenaRepository ocenaRepository;

    public OcenaController(OcenaRepository ocenaRepository) {
        this.ocenaRepository = ocenaRepository;
    }

    @GetMapping
    List<Ocena> getProducts(@RequestParam(required = false) String type) {
        if (type == null) {
            return (List<Ocena>) ocenaRepository.findAll();
        } else {
            return ocenaRepository.findAllByType(type);
        }
    }

    @GetMapping("/{id}")
    Optional<Ocena> getUserById(@PathVariable Long id) {
        return ocenaRepository.findById(id);
    }
}
