package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
