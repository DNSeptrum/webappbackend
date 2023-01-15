package pl.nullpointerexception.restapp.Group;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public
interface GroupRepository extends CrudRepository<Groupad, Long> {

    public final List<Groupad> groups = new ArrayList<>();

    List<Groupad> findAll();

    List<Groupad> findAllByname(String name);

    Groupad findById(int id);
}
