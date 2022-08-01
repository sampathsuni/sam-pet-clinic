package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Vet;

import java.util.Optional;

public interface VetRepository extends CrudRepository<Vet, Long> {
    Optional<Object> findAllById(Long aLong);
}
