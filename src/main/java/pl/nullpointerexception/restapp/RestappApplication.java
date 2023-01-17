package pl.nullpointerexception.restapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.nullpointerexception.restapp.Group.Groupad;
import pl.nullpointerexception.restapp.Group.GroupRepository;

import pl.nullpointerexception.restapp.user.UserRepository;
import pl.nullpointerexception.restapp.user.User;

import pl.nullpointerexception.restapp.Test.Test;
import pl.nullpointerexception.restapp.Test.TestRepository;

import pl.nullpointerexception.restapp.Task.Task;
import pl.nullpointerexception.restapp.Task.TaskRepository;

import pl.nullpointerexception.restapp.Question.Question;
import pl.nullpointerexception.restapp.Question.QuestionRepository;

import pl.nullpointerexception.restapp.Ocena.Ocena;
import pl.nullpointerexception.restapp.Ocena.OcenaRepository;

import pl.nullpointerexception.restapp.Answer.Answer;
import pl.nullpointerexception.restapp.Answer.AnswerRepository;



import java.sql.Date;

@SpringBootApplication
public class RestappApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(RestappApplication.class, args);
        java.sql.Date sqlDate = new java.sql.Date(1540264000000L);


       // NewBikeDto bike1 = new NewBikeDto(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
      //  BikeService bikeService = context.getBean(BikeService.class);
      //  bikeService.add(bike1);
      //  Bike payment = bikeService.ChangeModel(1L, "test", "test");
      //  System.out.println("Należność do zapłaty za wypożyczenie: " + payment);
       // bikeService.returnBike(1L);


        UserRepository userRepository = context.getBean(UserRepository.class);
        OcenaRepository ocenaRepository = context.getBean(OcenaRepository.class);
        TestRepository testRepository = context.getBean(TestRepository.class);
        TaskRepository taskRepository = context.getBean(TaskRepository.class);
        AnswerRepository answerRepository = context.getBean(AnswerRepository.class);
        QuestionRepository questionRepository = context.getBean(QuestionRepository.class);
        GroupRepository groupRepository = context.getBean(GroupRepository.class);

      //   saveData5(questionRepository);
      //  saveData2(questionRepository, testRepository,answerRepository);
       // saveData3(taskRepository, groupRepository);

       // saveData4(taskRepository,groupRepository,userRepository,testRepository);

      //  User user1 = new User("Testocen", "admin1", "DN@gmail.com",true, det1);
       // userRepository.save(user1);

        //zapisujemy informacje o użytkowniku i jego szczegółach
      //  Ocena ocena = new Ocena("ocena1",10, "zadtest1", sqlDate, "50%");
       // Ocena ocena2 = new Ocena("ocena2",11, "zadtest2", sqlDate, "50%");
      //  Ocena ocena3 = new Ocena("ocena3",11, "zadtest2", sqlDate, "50%");

      //  ocenaRepository.save(ocena);
      //  ocenaRepository.save(ocena2);
      //  ocenaRepository.save(ocena3);
     //   user1.addOcena(ocena2);
     //   user1.addOcena(ocena);
      //  user1.addOcena(ocena3);



        //odczytujemy informacje o użytkowniku
       // Optional<User> firstUser = userRepository.findById(1L);
       // System.out.println("Informacje o pierwszym użytkowniku:");
      //  firstUser.ifPresent(System.out::println);
      //  System.out.println("Szczegóły pierwszego użytkownika:");
       // firstUser.map(User::getUserDetails).ifPresent(System.out::println);



        // SpringApplication.run(RestappApplication.class, args);
    ///   bike
        // ConfigurableApplicationContext context = SpringApplication.run(RestappApplication.class, args);
        // BikeRepository bookRepository = context.getBean(BikeRepository.class);
       // BikeService sbikeService = context.getBean(BikeService.class);



    ///  Group
        //ConfigurableApplicationContext Gro = SpringApplication.run(RestappApplication.class, args);
        // GroupRepository groupRepository = Gro.getBean(GroupRepository.class);
        //GroupService groupService = Gro.getBean(GroupService.class);


   /// tworzenie obiektó
       // StudentDto stu1 = new StudentDto( "dawid", "DN@gmail.com", "admin");
      //  BikeDto bike2 = new BikeDto( "test2", "MK2020X9876", 25, 80);
     //   BikeDto bike3 = new BikeDto( "test3", "TXS229M1234", 30, 120);
     //   BikeDto bike4 = new BikeDto( "test4", "SXRS26ASDF", 40, 150);


     ///dodawanie obiektów
      //  studentService.add(stu1);
     //   bikeService.add(bike2);
     //   bikeService.add(bike3);
     //   bikeService.add(bike4);
        //wypożyczenie
      //  double payment = bikeService.rentForDay("TXS229M1234", "ABC1234");
        //dostępne rowery
      //  System.out.println("Wypożyczono rower za kwotę: " + payment);
     //   int borrowedBikes = bikeService.countBorrowedBikes();
     //   System.out.println("Liczba wypożyczonych rowerów: " + borrowedBikes);
     //   System.out.println("Dostępne rowery (cena rosnąco): ");
      //  bikeService.findAllAvailableBikes().forEach(System.out::println);


      //  Groupad group1 = new Groupad(17l,"grup8","blabla",6D);
      //  GroupRepository groupRepository = context.getBean(GroupRepository.class);
     //   groupRepository.save(group1);
      //  Bike bike1 = new Bike(12L, "test", "testa", 30, 100);
    //    BikeRepository bikeRepository = context.getBean(BikeRepository.class);
      //  bikeRepository.save(bike1);
     //   System.out.println("Zapisano w bazie bike1");
      //  bikeRepository.findById(12L).ifPresent(System.out::println);
      //  bikeRepository.deleteById(2l);

    }

    private static void saveData(OcenaRepository ocenaRepository, UserRepository userRepository){

        java.sql.Date sqlDate = new java.sql.Date(1540264000000L);

        Ocena ocena = new Ocena("ocena1",10, 2, sqlDate, "50%");
        Ocena ocena2 = new Ocena("ocena2",11, 3, sqlDate, "50%");
        Ocena ocena3 = new Ocena("ocena3",11, 4, sqlDate, "50%");
        ocenaRepository.save(ocena);
        ocenaRepository.save(ocena2);
        ocenaRepository.save(ocena3);
        User user1 = new User("email1", "admin1", "naz1","has", "teacher",4,false);
        user1.addOcena(ocena2);
        user1.addOcena(ocena);
        user1.addOcena(ocena3);
        userRepository.save(user1);
    }
    private static void saveData2(QuestionRepository ocenaRepository, TestRepository testRepository,AnswerRepository answerRepository){

        Date sqlDate = new Date(1540264000000L);
        Answer answer = new Answer("an5");
        Answer answer2 = new Answer("an6");
        Answer answer3 = new Answer("an7");
        answerRepository.save(answer);
        answerRepository.save(answer2);
        answerRepository.save(answer3);
        Question ocena = new Question("pyt",10);
        Question ocena2 = new Question("pyt2",5);
        Question ocena3 = new Question("pyt3",2);
        //dodawanie odpowiedzi
        ocena.addAnswer(answer);
        ocena.addAnswer(answer2);
       // ocena2.addQuestion(answer2);
       // ocena2.addQuestion(answer3);
         ocena3.addAnswer(answer3);

        ocenaRepository.save(ocena);
        ocenaRepository.save(ocena2);
        ocenaRepository.save(ocena3);

        Test user1 = new Test("test21",5, sqlDate, sqlDate,10, 50);
        //dodawnaie pytań
        user1.addQuestion(ocena2);
        user1.addQuestion(ocena);
       user1.addQuestion(ocena3);

       testRepository.save(user1);
    }
    private static void saveData3(TaskRepository taskRepository, GroupRepository groupRepository){

        java.sql.Date sqlDate = new java.sql.Date(1540264000000L);

        Task ocena = new Task("ocena1",10, sqlDate, sqlDate, 10);
        Task ocena2 = new Task("ocena2",11, sqlDate, sqlDate, 12);
        Task ocena3 = new Task("ocena3",11, sqlDate, sqlDate, 14);
        taskRepository.save(ocena);
        taskRepository.save(ocena2);
        taskRepository.save(ocena3);
        Groupad user1 = new Groupad("email1", 6, sqlDate);
        user1.addTask(ocena2);
        user1.addTask(ocena);
        user1.addTask(ocena3);
        groupRepository.save(user1);
    }
    private static void saveData4(TaskRepository taskRepository, GroupRepository groupRepository,UserRepository userRepository,TestRepository testRepository){

        java.sql.Date sqlDate = new java.sql.Date(1540264000000L);
        Test test1 = new Test ("test1",4,sqlDate,sqlDate,5,4);
        Test test2 = new Test ("test2",4,sqlDate,sqlDate,5,4);
        testRepository.save(test1);
        testRepository.save(test2);
        Task ocena = new Task("ocena1",10, sqlDate, sqlDate, 10);
        Task ocena2 = new Task("ocena2",11, sqlDate, sqlDate, 12);
        Task ocena3 = new Task("ocena3",11, sqlDate, sqlDate, 14);
        taskRepository.save(ocena);
        taskRepository.save(ocena2);
        taskRepository.save(ocena3);
        User user1 = new User("naz","user1","D","admin","teacher",5,false);
        User user2 = new User("naz","user2","W","admin","student",7,true);
        userRepository.save(user1);
        userRepository.save(user2);
        Groupad group1 = new Groupad("email1", 6, sqlDate);

        group1.addTest(test1);
        group1.addTest(test2);
        group1 .addTask(ocena2);
        group1 .addTask(ocena);
        group1 .addTask(ocena3);

        group1.addUser(user1);
        group1.addUser(user2);

        groupRepository.save(group1 );
    }
    private static void saveData5(QuestionRepository questionRepository){

        java.sql.Date sqlDate = new java.sql.Date(1540264000000L);

        Answer ocena = new Answer("odp11");
        Answer ocena2 = new Answer("odp2");
        Answer ocena3 = new Answer("odp3");

        Question user1 = new Question("pytanie1",3);
        user1.addAnswer(ocena2);
        user1.addAnswer(ocena);
        user1.addAnswer(ocena3);
        questionRepository.save(user1);
    }
}

