package sam.springframwork.sampetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class ownersController {
    @RequestMapping({"/","/index","/index.html",""})
    public String ownersList(){
        return "owners/index";
    }

}
