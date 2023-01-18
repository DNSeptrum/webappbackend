import org.junit.Assert;
import org.junit.Test;

import pl.nullpointerexception.restapp.user.*;

import java.util.List;
import java.util.Optional;

public class TestTest {
    private final Calculator calculator = new Calculator();


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


 /*@Test
    public void shouldsaveUserById() {

         NewUserDto userDaot;


        NewUserDto userDto= new NewUserDto("test","test1","test3","admin","teacher",1,false);
        User expectedUser = new User("test","test1","test3","admin","teacher",1,false);
       userDaot = userService.saveUser(userDto);

        expectedUser.setId(1L);

        Assert.assertEquals(expectedUser,userDaot );
    }

  @Test(expected = RuntimeException.class)
       public void ThrowException() {}



        // given
      //  double a = 3;
      //  double b = 0;

        // when
     //   calculator.divide(a, b);



    @Test
    public void CorrectAdd() {
        // given

        // then
        Assert.assertEquals(0,  0);
    }

  /*  @Test
    public void shouldCorrectSubtract() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.subtract(a, b);

        // then
        Assert.assertEquals(1, result, 0.001);
    }
*/
  /*  @Test
    public void shouldCorrectDiv() {
        // given
        double a = 4;
        double b = 2;

        // when
        double result = calculator.divide(a, b);

        // then
        Assert.assertEquals(2, result, 0.001);
    }
*//*
    @Test
    public void shouldsaveUserById2() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.multiply(a, b);

        // then
        Assert.assertEquals(6, result, 0.001);
    }



   /* @Test
    public void CorrectAdd2() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.add(a, b);

        // then
        Assert.assertEquals(5, result, 0.001);
    }*//*
   @Test(expected = RuntimeException.class)
   public void ThrowException2() {
       // given
       double a = 3;
       double b = 0;

       // when
       calculator.divide(a, b);

   }*/
}
