package sam.springframwork.sampetclinic.services.map;

import org.springframework.stereotype.Service;
import sam.springframwork.sampetclinic.model.Speciality;
import sam.springframwork.sampetclinic.services.SpecialityService;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
