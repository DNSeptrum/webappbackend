package pl.nullpointerexception.restapp.user;
import org.springframework.stereotype.Service;

@Service
public class UserDtoMapper {

    NewUserDto map(User user) {
        NewUserDto dto = new NewUserDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setSurname(user.getSurname());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());
        dto.setLastGradeID(user.getLastGradeID());
        dto.setLoggedIn(user.isLoggedIn());
        dto.setGrades(user.getGrades());

        return dto;
    }

    User map(NewUserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setSurname(dto.getSurname());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        user.setLastGradeID(dto.getLastGradeID());
        user.setLoggedIn(dto.isLoggedIn());
        user.setGrades(dto.getGrades());
        return user;
    }
}