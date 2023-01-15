package pl.nullpointerexception.restapp.Task;

import org.springframework.web.bind.annotation.*;
import pl.nullpointerexception.restapp.user.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @GetMapping
    List<Task> getProducts(@RequestParam(required = false) String name) {
        if (name == null) {
            return (List<Task>) taskRepository.findAll();
        } else {
            return taskRepository.findAllByname(name);
        }
    }

    @GetMapping("/{id}")
    Optional<Task> getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id);
    }
}