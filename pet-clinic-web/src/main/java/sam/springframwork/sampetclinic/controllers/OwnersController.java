package sam.springframwork.sampetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sam.springframwork.sampetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","/index","/index.html","/find"})
    public String ownersList(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

//

}
