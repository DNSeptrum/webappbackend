package pl.nullpointerexception.restapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

import pl.nullpointerexception.restapp.Model.Test;


public interface TestRepository extends CrudRepository<Test, Long> {


    public final List<Test> tests = new ArrayList<>();

    List<Test> findAll();

    List<Test> findAllByname(String name);

    Test findById(int id);


}