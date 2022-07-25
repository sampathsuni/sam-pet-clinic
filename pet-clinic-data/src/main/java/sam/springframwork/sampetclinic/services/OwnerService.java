package sam.springframwork.sampetclinic.services;

import sam.springframwork.sampetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
