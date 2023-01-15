package pl.nullpointerexception.restapp.Test;
import org.springframework.stereotype.Service;

@Service
public class TestDtoMapper {

    NewTestDto map(Test test) {
        NewTestDto dto= new NewTestDto();
        dto.setId(test.getId());
        dto.setName(test.getName());
        dto.setCreator(test.getCreator());
        dto.setDate(test.getDate());
        dto.setStartingDate(test.getStartingDate());
        dto.setTimePerQuestion(test.getTimePerQuestion());
        dto.setMaxPoint(test.getMaxPoint());
        return dto;
    }

    Test map(NewTestDto dto) {
        Test test = new Test();
        test.setId(dto.getId());
        test.setName(dto.getName());
        test.setCreator(dto.getCreator());
        test.setDate(dto.getDate());
        test.setStartingDate(dto.getStartingDate());
        test.setTimePerQuestion(dto.getTimePerQuestion());
        test.setMaxPoint(dto.getMaxPoint());

        return test;
    }
}
