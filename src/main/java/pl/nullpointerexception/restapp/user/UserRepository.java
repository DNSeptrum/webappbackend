package pl.nullpointerexception.restapp.user;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    public final List<User> users = new ArrayList<>();

    List<User> findAll();

    List<User> findAllByname(String name);

    User findById(int id);


}