package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import pl.nullpointerexception.restapp.Model.Ocena;

import java.util.List;

public interface OcenaRepository extends CrudRepository<Ocena, Long> {
    public final List<Ocena> grades = new ArrayList<>();
    List<Ocena> findAll();
    List<Ocena> findAllByType(String type);
}
