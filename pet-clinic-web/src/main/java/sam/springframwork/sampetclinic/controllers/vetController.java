package sam.springframwork.sampetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class vetController {

    @RequestMapping({"vets/index","vets/index.html","vets"})
    public String listVets(){
        return "vets/index";
    }

}