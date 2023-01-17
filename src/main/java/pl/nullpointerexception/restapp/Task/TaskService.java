package pl.nullpointerexception.restapp.Task;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskDtoMapper taskDtoMapper;

    public TaskService(TaskRepository taskRepository, TaskDtoMapper taskDtoMapper) {
        this.taskRepository = taskRepository;
        this.taskDtoMapper = taskDtoMapper;
    }


    Optional<NewTaskDto> getAnswerById(Long id) {
        return taskRepository.findById(id)
                .map(taskDtoMapper::map);
    }

    public NewTaskDto saveTask(NewTaskDto taskDto) {
        Task taskToSave = taskDtoMapper.map(taskDto);
        Task savedAnswer = taskRepository.save(taskToSave);
        return taskDtoMapper.map(savedAnswer);
    }
}