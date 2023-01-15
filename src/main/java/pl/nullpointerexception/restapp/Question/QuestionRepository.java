package pl.nullpointerexception.restapp.Question;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Question.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{


    public final List<Question> tests = new ArrayList<>();

    List<Question> findAll();

    List<Question> findAllByText(String text);

    Question findById(int id);

}
