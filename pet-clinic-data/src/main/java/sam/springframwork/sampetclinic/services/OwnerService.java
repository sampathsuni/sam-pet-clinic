package sam.springframwork.sampetclinic.services;

import sam.springframwork.sampetclinic.model.Owner;

import java.util.Set;

public interface OwnerService  {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
