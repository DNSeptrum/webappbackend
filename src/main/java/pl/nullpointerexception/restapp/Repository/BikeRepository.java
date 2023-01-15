package pl.nullpointerexception.restapp.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

import pl.nullpointerexception.restapp.Model.Bike;
@Repository
public
interface BikeRepository extends CrudRepository<Bike, Long> {


    Optional<Bike> findBySerialNoIgnoreCase(String serialNo);
    int countAllByBorrowerIdIsNotNull();
    List<Bike> findAllByBorrowerIdIsNullOrderByDayPrice();

}
