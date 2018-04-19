package pl.developers.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.developers.mod.Developer;
import pl.developers.repository.DeveloperRepository;
import pl.developers.repository.InwestycjaRepository;

import java.util.Optional;

public class DeveloperController {

    @Autowired
    private DeveloperRepository developerRepository;
    private InwestycjaRepository inwestycjaRepository;

    public DeveloperController(DeveloperRepository developerRepository, InwestycjaRepository inwestycjaRepository) {
        this.developerRepository = developerRepository;
        this.inwestycjaRepository = inwestycjaRepository;
    }

    @GetMapping("/developers")
    public String developer (Model model, @RequestParam long id) {

        Optional<Developer> developerOptional = developerRepository.findById(id);

        if (developerOptional.isPresent()) {
            Developer developer = developerOptional.get();
            //Inwestycja newInwestycja = new Inwestycja();
            //    newInwestycja.setOferty(id_inwest);

            model.addAttribute("developer", developer);
            //    model.addAttribute("newInwestycja", newInwestycja);
        } else {
            return "redirect:/";
        }
        return "deweloper";

    }

}







