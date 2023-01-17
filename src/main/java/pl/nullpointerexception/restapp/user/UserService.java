package pl.nullpointerexception.restapp.user;

import java.util.Optional;

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
}
