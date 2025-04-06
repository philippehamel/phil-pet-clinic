package phil.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import phil.springframework.petclinic.services.VetService;

@RequestMapping({"/vets", "/vets.html"})
@Controller
public class VetController {
    private final VetService VetService;

    public VetController(VetService vetService) {
        VetService = vetService;
    }

    @RequestMapping({"/index","/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", VetService.findAll());
        return "vets/index";
    }

    @RequestMapping("")
    public String oupsHandler() {
        return "notimplemented";
    }

}
