package sam.springframwork.sampetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"","/","index","/index"})
    public String index(){
        return "index";
    }
}
