package espritds.sky_wejden.Controllers;


import espritds.sky_wejden.Entiries.Moniteur;
import espritds.sky_wejden.Services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Moniteur")
public class MoniteurController {
    @Autowired
    IMoniteurService iMoniteurService;
    @GetMapping
    public List<Moniteur> getall()
    {
        return iMoniteurService.retrieveAllMoniteurs();
    }
    @PostMapping

    public Moniteur addS(@RequestBody Moniteur s)
    {
        return iMoniteurService.addMoniteur(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iMoniteurService.removeMoniteur(id);
    }
    @PutMapping
    public Moniteur UpdateS(@RequestBody  Moniteur s)
    {
        return  iMoniteurService.updateMoniteur(s);
    }
    @GetMapping("{id}")
    public Moniteur FindS(@PathVariable Long id)
    {

        return iMoniteurService.retrieveMoniteur(id);
    }
}
