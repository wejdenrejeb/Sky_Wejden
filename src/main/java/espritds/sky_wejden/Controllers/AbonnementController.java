package espritds.sky_wejden.Controllers;

import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Services.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;
    //localhost:9090/retivveAllAbonnements
    @GetMapping
    public List<Abonnement> getall()
    {
        return iAbonnementService.retrieveAllAbonnements();
    }
    @PostMapping

    public Abonnement addA(@RequestBody Abonnement s)
    {
        return iAbonnementService.addAbonnement(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iAbonnementService.removeAbonnement(id);
    }
    @PutMapping
    public Abonnement UpdateA(@RequestBody  Abonnement s)
    {
        return iAbonnementService.updateAbonnement(s);
    }
    @GetMapping("{id}")
    public Abonnement FindS(@PathVariable Long numAbonnement)
    {
        return iAbonnementService.retrieveAbonnement(numAbonnement);
    }
}
