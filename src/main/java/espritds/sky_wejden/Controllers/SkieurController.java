package espritds.sky_wejden.Controllers;


import espritds.sky_wejden.Entiries.Skieur;
import espritds.sky_wejden.Entiries.TypeAbonnement;
import espritds.sky_wejden.Services.ISkieurService;
import espritds.sky_wejden.Services.ISkieurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
public class SkieurController {

    @Autowired
    ISkieurService iSkieurService;


    //localhost:9090/retrieveAllSkieurs
    @GetMapping
    public List<Skieur> getAll(){
        return iSkieurService.retrieveAllSkieurs();
    }

    @GetMapping("{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return iSkieurService.retrieveSkieur(numSkieur);
    }


    //localhost:9090/addSkieur
    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur s){
        return iSkieurService.addSkieur(s);
    }

    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur s){
        return iSkieurService.updateSkieur(s);}



    @DeleteMapping("{numSkieur}")
    public void removeSkieur (@PathVariable Long numSkieur){
        iSkieurService.removeSkieur(numSkieur);
    }


    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur,numPiste);
    }


    @GetMapping ("/retrieveSkiersBySubscriptionType/{type}")
    public List<Skieur> retrieveSkiersBySubscriptionType (@PathVariable TypeAbonnement typeAbonnement){
        return iSkieurService.retrieveSkiersBySubscriptionType(typeAbonnement);
    }



    @PutMapping("{numSkieur}/{numAbon}")

    public Skieur AssignSkierToSubscription(@PathVariable long numSkieur, @PathVariable long numAbon) {

        return iSkieurService.AssignSkierToSubscription(numSkieur, numAbon);
    }

   /*
    @PutMapping("{numSkieur}/{numInscription}")

    public Skieur AssignSkierToInscription(@PathVariable long numSkieur, @PathVariable long numInscription) {

        return iSkieurService.AssignSkierToSubscription(numSkieur, numInscription);
    }

    */







    //@RequestBody cad tel9ah el body mte3 el req kima queryparam



}
