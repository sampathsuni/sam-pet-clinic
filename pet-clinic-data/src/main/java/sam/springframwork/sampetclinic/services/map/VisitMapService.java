package sam.springframwork.sampetclinic.services.map;

import org.springframework.stereotype.Service;
import sam.springframwork.sampetclinic.model.Visit;
import sam.springframwork.sampetclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long>  implements VisitService{

    private final VisitService visitService;

    public VisitMapService(VisitService visitService) {
        this.visitService = visitService;
    }


    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet()==null||visit.getId()==null
                ||visit.getPet().getOwner()==null||visit.getPet().getOwner().getId()==null)
        {
            throw new RuntimeException("Invalid Visit");
        }
            return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }
}
