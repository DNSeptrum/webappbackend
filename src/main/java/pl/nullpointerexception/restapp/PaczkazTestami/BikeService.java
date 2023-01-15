package pl.nullpointerexception.restapp.PaczkazTestami;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public
class BikeService {

    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Transactional
    public void add(NewBikeDto newBike) {
        Bike bike = new Bike(newBike.getId(),
                newBike.getModel(),
                newBike.getSerialNo(),
                newBike.getHourPrice(),
                newBike.getDayPrice());
        bikeRepository.save(bike);
    }

    @Transactional
    public void deleteById(Long bikeId) {
        bikeRepository.deleteById(bikeId);
    }

    @Transactional
    public double rentForHours(Long bikeId, int hours, String borrowerId) {
        LocalDateTime dateOfReturn = LocalDateTime.now().plusHours(hours);
        double hourPrice = updateBike(bikeId, dateOfReturn, borrowerId).getHourPrice();
        return hourPrice * hours;
    }

    @Transactional
    public double rentForDay(Long bikeId, String borrowerId) {
        LocalDateTime dateOfReturn = LocalDateTime.now().withHour(23).withMinute(59);
        return updateBike(bikeId, dateOfReturn, borrowerId).getDayPrice();
    }

    @Transactional
    public void returnBike(Long bikeId) {
        updateBike(bikeId, null, null);
    }

    private Bike updateBike(Long bikeId, LocalDateTime dateOfReturn, String borrowerId) {
        Bike bike = bikeRepository
                .findById(bikeId)
                .orElseThrow(BikeNotFoundException::new);
        bike.setDateOfReturn(dateOfReturn);
        bike.setBorrowerId(borrowerId);
        return bike;
    }
    @Transactional
    public Bike ChangeModel(Long bikeId, String borrowerId, String model) {
        //model = "vcodel";
        return updateBike2(bikeId, model, borrowerId);
    }
    private Bike updateBike2(Long bikeId, String model, String borrowerId) {
        Bike bike = bikeRepository
                .findById(bikeId)
                .orElseThrow(BikeNotFoundException::new);
        bike.setModel(model);
        bike.setBorrowerId(borrowerId);
        return bike;
    }



}