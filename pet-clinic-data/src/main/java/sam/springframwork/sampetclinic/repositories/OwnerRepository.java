package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
