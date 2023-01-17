package pl.nullpointerexception.restapp.Group;

import org.springframework.stereotype.Service;

@Service
public class GroupDtoMapper {


    public NewGroupDto map(Groupad group) {
        NewGroupDto dto= new NewGroupDto();
        dto.setId(group.getId());
        dto.setName(group.getName());
        dto.setCreator(group.getCreator());
        dto.setDate(group.getDate());
        dto.setTests(group.getTests());
        dto.setTasks(group.getTasks());
        dto.setUsers(group.getUsers());
        return dto;
    }

    Groupad map(NewGroupDto dto) {
        Groupad group = new Groupad();
        group.setId(dto.getId());
        group.setName(dto.getName());
        group.setCreator(dto.getCreator());
        group.setDate(dto.getDate());
        group.setTests(dto.getTests());
        group.setTasks(dto.getTasks());
        group.setUsers(dto.getUsers());

        return group;
    }
}