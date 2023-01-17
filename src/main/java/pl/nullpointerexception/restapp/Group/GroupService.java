package pl.nullpointerexception.restapp.Group;

import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class GroupService {

    private final GroupRepository groupRepository;
    private final GroupDtoMapper groupDtoMapper;

    public GroupService(GroupRepository groupRepository, GroupDtoMapper groupDtoMapper) {
        this.groupRepository = groupRepository;
        this.groupDtoMapper = groupDtoMapper;
    }


    Optional<NewGroupDto> getGroupById(Long id) {
        return  groupRepository.findById(id)
                .map(groupDtoMapper::map);
    }

    public NewGroupDto saveGroup(NewGroupDto groupDto) {
        Groupad groupToSave = groupDtoMapper.map(groupDto);
        Groupad savedgroup =  groupRepository.save(groupToSave);
        return groupDtoMapper.map(savedgroup);
    }
}