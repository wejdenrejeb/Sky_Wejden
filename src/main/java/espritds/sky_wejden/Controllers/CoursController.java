package espritds.sky_wejden.Controllers;


import espritds.sky_wejden.Entiries.Cours;
import espritds.sky_wejden.Services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cours")
public class CoursController {
    @Autowired
    ICoursService iCoursService;
    @GetMapping
    public List<Cours> getAll(){
        return iCoursService.retrieveAllCours();
    }

    @GetMapping("{numCours}")
    public Cours retrieveCours (@PathVariable Long numCours){
        return iCoursService.retrieveCours(numCours);
    }


    //localhost:9090/addSkieur
    @PostMapping
    public Cours addCours(@RequestBody Cours cours){
        return iCoursService.addCours(cours);
    }

    @PutMapping
    public Cours updateCours(@RequestBody Cours cours){
        return iCoursService.updateCours(cours);}


}
