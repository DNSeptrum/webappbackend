package pl.nullpointerexception.restapp.Ocena;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ocena")
public class OcenaController {
    private int Id = 5;
    private final OcenaRepository ocenaRepository;
    private final OcenaService ocenaService;

    public OcenaController(OcenaRepository ocenaRepository, OcenaService ocenaService) {
        this.ocenaRepository = ocenaRepository;
        this.ocenaService = ocenaService;
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
    Optional<Ocena> getOcenaById(@PathVariable Long id) {
        return ocenaRepository.findById(id);
    }


    @PostMapping
    ResponseEntity<NewOcenaDto> saveOcena(@RequestBody NewOcenaDto question) {
        NewOcenaDto savedOcena = ocenaService.saveOcena(question);
        URI savedCompanyUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedOcena.getId())
                .toUri();
        return ResponseEntity.created(savedCompanyUri).body(savedOcena);
    }



}
