package sam.springframwork.sampetclinic.services.map;

import org.springframework.stereotype.Service;
import sam.springframwork.sampetclinic.model.Speciality;
import sam.springframwork.sampetclinic.model.Vet;
import sam.springframwork.sampetclinic.services.SpecialtyService;
import sam.springframwork.sampetclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }


    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach(speciality ->{
                if (speciality.getId()==null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
