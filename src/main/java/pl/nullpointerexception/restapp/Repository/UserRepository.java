package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Model.User;
public interface UserRepository extends CrudRepository<User, Long> {

    public final List<User> users = new ArrayList<>();

    List<User> findAll();

    List<User> findAllByname(String name);

    User findById(int id);


}