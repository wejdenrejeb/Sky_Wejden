package espritds.sky_wejden.Controllers;

import espritds.sky_wejden.Entiries.Inscription;
import espritds.sky_wejden.Services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Inscriptions")
public class InscriptionController {
    @Autowired
    IInscriptionService iInscriptionService;
    @GetMapping
    public List<Inscription> getAll(){
        return iInscriptionService.retrieveAllInscriptions();
    }

    @GetMapping("{numInscription}")
    public Inscription retrieveInscription (@PathVariable Long numInscription){
        return iInscriptionService.retrieveInscription(numInscription);
    }


    //localhost:9090/addSkieur
    @PostMapping
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iInscriptionService.addInscription(inscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iInscriptionService.updateInscription(inscription);}
}
