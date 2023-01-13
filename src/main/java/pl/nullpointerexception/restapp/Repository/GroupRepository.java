package pl.nullpointerexception.restapp.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import jakarta.persistence.EntityManager;
import java.util.Optional;
import pl.nullpointerexception.restapp.Model.Groupad;
@Repository
public class GroupRepository{

    private final EntityManager entityManager;

    public GroupRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Groupad group) {
        entityManager.persist(group);
    }
    public Optional<Groupad> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Groupad.class, id));
    }

    @Transactional
    public void deleteById(Long id) {
        findById(id).ifPresent(entityManager::remove);
    }
}
