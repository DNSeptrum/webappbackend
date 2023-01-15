/*package pl.nullpointerexception.restapp.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import pl.nullpointerexception.restapp.Model.User;
import pl.nullpointerexception.restapp.Repository.OcenaRepository;
import pl.nullpointerexception.restapp.Model.Ocena;

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
            return (List<Ocena>) OcenaRepository.findAll();
        } else {
            return OcenaRepository.findAllByType(type);
        }
    }

  //  @GetMapping("/{id}")
  //  List<Ocena> getOcenaByuser(@PathVariable int user_id) {
  ///      return OcenaRepository.getOcenaByuser_Id(user_id);
  //  }
}
*/