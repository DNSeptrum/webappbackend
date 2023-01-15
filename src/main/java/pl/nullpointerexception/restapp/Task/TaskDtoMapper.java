package pl.nullpointerexception.restapp.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskDtoMapper {

    NewTaskDto map(Task task) {
        NewTaskDto dto = new NewTaskDto();
        dto.setId(task.getId());
        dto.setName(task.getName());
        dto.setCreator(task.getCreator());
        dto.setDate(task.getDate());
        dto.setEndingDate(task.getEndingDate());
        dto.setMaxPoint(task.getMaxPoint());

        return dto;
    }

    Task map(NewTaskDto dto) {
        Task task = new Task();
        task.setId(dto.getId());
        task.setName(dto.getName());
        task.setCreator(task.getCreator());
        task.setDate(task.getDate());
        task.setEndingDate(task.getEndingDate());
        task.setMaxPoint(task.getMaxPoint());
        return task;
    }
}
