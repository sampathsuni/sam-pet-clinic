package sam.springframwork.sampetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sam.springframwork.sampetclinic.model.Owner;
import sam.springframwork.sampetclinic.model.Vet;
import sam.springframwork.sampetclinic.services.OwnerService;
import sam.springframwork.sampetclinic.services.VetService;
import sam.springframwork.sampetclinic.services.map.OwnerServiceMap;
import sam.springframwork.sampetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
            Owner owner1 = new Owner();
            owner1.setId(1L);
            owner1.setFirstName("Sampath");
            owner1.setLastName("Kumar");

            ownerService.save(owner1);

            Owner owner2 = new Owner();
            owner2.setId(2L);
            owner2.setFirstName("Sunil");
            owner2.setLastName("Kumar");

            ownerService.save(owner2);

            System.out.println("Loaded Owners............");

            Vet vet1 = new Vet();
            vet1.setId(1L);
            vet1.setLastName("Peter");
            vet1.setLastName("England");

            vetService.save(vet1);

            Vet vet2 = new Vet();
            vet2.setId(1L);
            vet2.setLastName("Ven");
            vet2.setLastName("Housen");

            vetService.save(vet2);

            System.out.println("Loaded Vets............");

    }
}
