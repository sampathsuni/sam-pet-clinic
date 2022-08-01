package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
