package pl.nullpointerexception.restapp.user;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {


    private final UserRepository userRepository;

    private final UserDtoMapper userDtoMapper;

    public UserService(UserRepository userRepository, UserDtoMapper userDtoMapper) {
        this.userRepository = userRepository;
        this.userDtoMapper = userDtoMapper;
    }

    public Optional<NewUserDto> getUserById(Long id) {
        return userRepository.findById(id)
                .map(userDtoMapper::map);
    }

    NewUserDto saveUser(NewUserDto UserDto) {
        User user = userDtoMapper.map(UserDto);
        User savedUser = userRepository.save(user);
        return userDtoMapper.map(savedUser);
    }
}
