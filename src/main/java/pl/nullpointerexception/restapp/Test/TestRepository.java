package pl.nullpointerexception.restapp.Test;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface TestRepository extends CrudRepository<Test, Long> {


    public final List<Test> tests = new ArrayList<>();

    List<Test> findAll();

    List<Test> findAllByname(String name);

    Test findById(int id);


}