package pl.nullpointerexception.restapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.nullpointerexception.restapp.Model.Student;
import pl.nullpointerexception.restapp.Model.Groupad;
import pl.nullpointerexception.restapp.Model.Bike;
import pl.nullpointerexception.restapp.Repository.StudentRepository;
import pl.nullpointerexception.restapp.Repository.GroupRepository;
import pl.nullpointerexception.restapp.Repository.BikeRepository;
@SpringBootApplication
public class RestappApplication {

    public static void main(String[] args) {

       // SpringApplication.run(RestappApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(RestappApplication.class, args);
        Groupad group1 = new Groupad(6L,"grupa6","blabla",6D);
        GroupRepository groupRepository = context.getBean(GroupRepository.class);
        groupRepository.save(group1);
      //  Bike bike1 = new Bike(12L, "test", "testa", 30, 100);
        BikeRepository bikeRepository = context.getBean(BikeRepository.class);
      //  bikeRepository.save(bike1);
        System.out.println("Zapisano w bazie bike1");
        bikeRepository.findById(12L).ifPresent(System.out::println);
        bikeRepository.deleteById(12L);

    }

}
