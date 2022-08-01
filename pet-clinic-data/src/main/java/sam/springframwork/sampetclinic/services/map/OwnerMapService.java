package sam.springframwork.sampetclinic.services.map;

import org.springframework.stereotype.Service;
import sam.springframwork.sampetclinic.model.Owner;
import sam.springframwork.sampetclinic.model.Pet;
import sam.springframwork.sampetclinic.services.OwnerService;
import sam.springframwork.sampetclinic.services.PetService;
import sam.springframwork.sampetclinic.services.PetTypeService;

import java.util.Set;
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }


    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        // if owner exist
        if(object != null){
            // and owners pet exist
            if (object.getPets() != null){
                //then to all owners pets
                object.getPets().forEach(pet -> {
                    //if pet type exist
                    if (pet.getPetType() != null){
                        //if pet type id is null
                        if(pet.getPetType().getId() == null){
                            //then save the pet in pet service
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw new RuntimeException("Pet type is required");
                    }
                    //if pet id is null
                    if (pet.getId()==null){
                        // save the pet in pet service
                        Pet savedPet= petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
