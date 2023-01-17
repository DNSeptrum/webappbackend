package pl.nullpointerexception.restapp.Task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;
    private final TaskService taskService;

    public TaskController(TaskRepository taskRepository, TaskService taskService) {
        this.taskRepository = taskRepository;
        this.taskService = taskService;
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

    @PostMapping
    ResponseEntity<NewTaskDto> saveTask(@RequestBody NewTaskDto task) {
        NewTaskDto savedCompany = taskService.saveTask(task);
        URI savedCompanyUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCompany.getId())
                .toUri();
        return ResponseEntity.created(savedCompanyUri).body(savedCompany);
    }
}