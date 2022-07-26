package sam.springframwork.sampetclinic.services;

import org.springframework.stereotype.Service;
import sam.springframwork.sampetclinic.model.Owner;


@Service
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
