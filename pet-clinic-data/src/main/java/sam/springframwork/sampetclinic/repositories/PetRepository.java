package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
