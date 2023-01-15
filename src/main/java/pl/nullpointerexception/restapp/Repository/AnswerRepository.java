package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import pl.nullpointerexception.restapp.Model.Answer;

import java.util.List;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
    public final List<Answer> grades = new ArrayList<>();
    List<Answer> findAll();
   // List<Answer> findAllByanswer(String answer);
}