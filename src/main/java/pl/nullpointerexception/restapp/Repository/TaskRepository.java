package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Model.Task;
import pl.nullpointerexception.restapp.Model.Test;

public interface TaskRepository extends CrudRepository<Task, Long>{

    public final List<Task> tasks = new ArrayList<>();

    List<Task> findAll();

    List<Task> findAllByname(String name);

    Task findById(int id);

}
