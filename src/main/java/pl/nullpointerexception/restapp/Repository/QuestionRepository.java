package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Model.Question;
import pl.nullpointerexception.restapp.Model.Test;
import pl.nullpointerexception.restapp.Model.User;

public interface QuestionRepository extends CrudRepository<Question, Long>{


    public final List<Question> tests = new ArrayList<>();

    List<Question> findAll();

    List<Question> findAllByText(String text);

    Question findById(int id);

}
