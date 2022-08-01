package sam.springframwork.sampetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sam.springframwork.sampetclinic.model.*;
import sam.springframwork.sampetclinic.services.OwnerService;
import sam.springframwork.sampetclinic.services.PetTypeService;
import sam.springframwork.sampetclinic.services.SpecialityService;
import sam.springframwork.sampetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
            int count = petTypeService.findAll().size();
            if (count==0){
                    loadData();
            }

    }
        private void loadData() {
                PetType dog = new PetType();
                dog.setName("Dog");
                PetType savedDogPetType = petTypeService.save(dog);

                PetType cat = new PetType();
                dog.setName("Cat");
                PetType savedCatPetType = petTypeService.save(cat);

                Speciality radiology = new Speciality();
                radiology.setDescription("Radiology");
                Speciality savedRadiology = specialtyService.save(radiology);

                Speciality surgery = new Speciality();
                surgery.setDescription("Surgery");
                Speciality savedSurgery = specialtyService.save(surgery);

                Speciality dentistry = new Speciality();
                dentistry.setDescription("Dentistry");
                Speciality savedDentistry = specialtyService.save(dentistry);

                Owner owner1 = new Owner();
                owner1.setFirstName("Sampath");
                owner1.setLastName("Kumar");
                owner1.setAddress("599 9th A main");
                owner1.setCity("Bengalore");
                owner1.setTelephone("9844941156");

                Pet mikesPet = new Pet();
                mikesPet.setPetType(savedDogPetType);
                mikesPet.setOwner(owner1);
                mikesPet.setName("Nikki");
                mikesPet.setBirthDate(LocalDate.now());

                owner1.getPets().add(mikesPet);

                ownerService.save(owner1);

                Owner owner2 = new Owner();
                owner2.setFirstName("Sunil");
                owner2.setLastName("Kumar");
                owner2.setAddress("599 9th A main");
                owner2.setCity("Bengalore");
                owner2.setTelephone("9743668421");

                Pet newCat = new Pet();
                newCat.setPetType(savedCatPetType);
                newCat.setOwner(owner2);
                newCat.setName("meow");
                newCat.setBirthDate(LocalDate.now());

                owner2.getPets().add(newCat);

                ownerService.save(owner2);

                System.out.println("Loaded Owners............");

                Vet vet1 = new Vet();
                vet1.setFirstName("Peter");
                vet1.setLastName("England");
                vet1.getSpecialities().add(savedDentistry);

                vetService.save(vet1);

                Vet vet2 = new Vet();
                vet2.setFirstName("Ven");
                vet2.setLastName("Housen");
                vet2.getSpecialities().add(savedSurgery);
                vetService.save(vet2);

                System.out.println("Loaded Vets............");
        }
}
