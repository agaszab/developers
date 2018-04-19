package pl.developers.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.developers.mod.Developer;
import pl.developers.repository.DeveloperRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private DeveloperRepository developerRepository;

    public HomeController (DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @GetMapping("/")
    public String list(Model model) {
        List<Developer> developers = developerRepository.findAll();
        model.addAttribute("developers", developers);
        return "index";
    }



}
