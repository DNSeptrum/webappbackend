package pl.nullpointerexception.restapp.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import pl.nullpointerexception.restapp.Repository.UserRepository;
import java.util.List;
import java.util.Optional;
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
