import org.junit.Assert;
import org.junit.Test;
import pl.nullpointerexception.restapp.Question.Question;
import pl.nullpointerexception.restapp.Question.QuestionRepository;
import pl.nullpointerexception.restapp.user.*;

import java.util.List;
import java.util.Optional;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    private final QuestionRepository questionRepository = new QuestionRepository() {
        @Override
        public List<Question> findAll() {
            return null;
        }

        @Override
        public List<Question> findAllByText(String text) {
            return null;
        }

        @Override
        public Question findById(int id) {
            return null;
        }

        @Override
        public <S extends Question> S save(S entity) {
            return null;
        }

        @Override
        public <S extends Question> Iterable<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<Question> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<Question> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Question entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends Question> entities) {

        }

        @Override
        public void deleteAll() {

        }
    };
    private final UserRepository userRepository = new UserRepository() {
        @Override
        public List<User> findAll() {
            return null;
        }

        @Override
        public User findAllByname(String name) {
            return null;
        }

        @Override
        public User findById(int id) {
            return null;
        }

        @Override
        public <S extends User> S save(S entity) {
            return null;
        }

        @Override
        public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<User> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<User> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(User entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends User> entities) {

        }

        @Override
        public void deleteAll() {

        }
    };
    private final UserDtoMapper userDtoMapper = new UserDtoMapper();
private final UserService userService = new UserService(userRepository,userDtoMapper);



    //  private final QuestionService questionService = new QuestionService();
    @Test
    public void shouldReturnUserWhileGetById() {
        // given
         Optional<NewUserDto> userDao;

      //  userService.userDao.GetUserByID(0L);
        User user = new User("naz","user1","D","admin","teacher",5,false);
        User expectedUser = new User("naz2","user1","D","admin","teacher",5,false);

        expectedUser.setId(1L);
       // userDao.setID(1L);
        userDao = userService.getUserById(1L);
        Assert.assertEquals(Optional.of(expectedUser),userDao );
    }

    @Test
    public void shouldCorrectAddTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.add(a, b);

        // then
        Assert.assertEquals(5, result, 0.001);
    }

    @Test
    public void shouldCorrectSubtractTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.subtract(a, b);

        // then
        Assert.assertEquals(1, result, 0.001);
    }

    @Test
    public void shouldCorrectDivideTwoNumbers() {
        // given
        double a = 4;
        double b = 2;

        // when
        double result = calculator.divide(a, b);

        // then
        Assert.assertEquals(2, result, 0.001);
    }

    @Test
    public void shouldCorrectMultiplyTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.multiply(a, b);

        // then
        Assert.assertEquals(6, result, 0.001);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenDividerIsZero() {
        // given
        double a = 3;
        double b = 0;

        // when
        calculator.divide(a, b);

    }
}
