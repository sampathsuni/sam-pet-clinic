package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
