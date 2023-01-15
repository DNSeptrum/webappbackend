package pl.nullpointerexception.restapp.PaczkazTestami;


import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import pl.nullpointerexception.restapp.PaczkazTestami.Bike;

import java.util.Optional;

@Repository
class BikeRepository {
    private final EntityManager entityManager;

    public BikeRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Bike bike) {
        entityManager.persist(bike);
    }

    public Optional<Bike> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Bike.class, id));
    }

    public void deleteById(Long id) {
        findById(id).ifPresent(entityManager::remove);
    }
}