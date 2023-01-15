package pl.nullpointerexception.restapp.Answer;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;


public interface AnswerRepository extends CrudRepository<Answer, Long> {
    public final List<Answer> answers = new ArrayList<>();
    List<Answer> findAll();

    List<Answer> findAllByAnswer(String answer);

}