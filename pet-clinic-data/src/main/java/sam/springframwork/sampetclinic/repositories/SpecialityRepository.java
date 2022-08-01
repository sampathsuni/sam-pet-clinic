package sam.springframwork.sampetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sam.springframwork.sampetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
