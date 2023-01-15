package pl.nullpointerexception.restapp.Task;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Task.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

    public final List<Task> tasks = new ArrayList<>();

    List<Task> findAll();

    List<Task> findAllByname(String name);

    Task findById(int id);

}
