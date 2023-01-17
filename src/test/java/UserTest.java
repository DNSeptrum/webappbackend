import org.testng.Assert;
import org.testng.annotations.Test;
import pl.nullpointerexception.restapp.user.User;
import pl.nullpointerexception.restapp.user.UserRepository;

import java.util.Optional;


public class UserTest {

    private final UserRepository userRepository;

    public UserTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void shouldReturnUserWhileGetById() {
        // given
       // NewUserDto userDao = new NewUserDto();
        User user = new User("naz","user1","D","admin","teacher",5,false);
        User expectedUser = new User("naz","user1","D","admin","teacher",5,false);

        expectedUser.setId(0L);
        // when
       // userDao.create(user);
        User resultUser = userRepository.findAllByname("user1");
        // then
        Assert.assertEquals(Optional.of(expectedUser),resultUser );
    }
    @Test
    public void shouldReturnEmptyOptionalWhileGetById() {
        // given
      //  NewUserDto userDao = new NewUserDto();
        // when
        Optional<User> resultUser = userRepository.findById(102L);
        // then
        Assert.assertEquals(Optional.empty(), resultUser);
    }
}