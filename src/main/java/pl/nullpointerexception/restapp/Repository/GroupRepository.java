package pl.nullpointerexception.restapp.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import pl.nullpointerexception.restapp.Model.Groupad;
import pl.nullpointerexception.restapp.Model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public
interface GroupRepository extends CrudRepository<Groupad, Long> {

    public final List<User> groups = new ArrayList<>();

    List<Groupad> findAll();

    List<Groupad> findAllByname(String name);

    Groupad findById(int id);
}
