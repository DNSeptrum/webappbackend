package pl.nullpointerexception.restapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import pl.nullpointerexception.restapp.user.UserRepository;

@SpringBootTest
class RestappApplicationTests {

    @Test
    void contextLoads() {
        ;


      //      ConfigurableApplicationContext context = SpringApplication.run(RestappApplicationTests.class);
     //   UserRepository userRepository = context.getBean(UserRepository.class);
     //   UserTest userTest = context.getBean(UserTest.class);
     //   //userTest.shouldReturnUserWhileGetById();
     //   userTest.shouldReturnEmptyOptionalWhileGetById();
    }

}

