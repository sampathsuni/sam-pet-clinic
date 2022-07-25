package sam.springframwork.sampetclinic.services.map;

import sam.springframwork.sampetclinic.model.Owner;
import sam.springframwork.sampetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }


    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Long id,Owner object){
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        this.deleteById(id);
    }


}
