package sam.springframwork.sampetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sam.springframwork.sampetclinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"vets/index","vets/index.html","vets"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }

}
