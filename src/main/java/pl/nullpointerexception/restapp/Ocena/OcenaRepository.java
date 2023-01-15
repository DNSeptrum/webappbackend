package pl.nullpointerexception.restapp.Ocena;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public interface OcenaRepository extends CrudRepository<Ocena, Long> {
    public final List<Ocena> grades = new ArrayList<>();
    List<Ocena> findAll();
    List<Ocena> findAllByType(String type);
}
