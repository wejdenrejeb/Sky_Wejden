package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Cours;
import espritds.sky_wejden.Entiries.Moniteur;
import espritds.sky_wejden.Entiries.Piste;
import espritds.sky_wejden.Entiries.Skieur;
import espritds.sky_wejden.Repositories.CoursRespository;
import espritds.sky_wejden.Repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class MoniteurServiceImp implements IMoniteurService {


    @Autowired
    MoniteurRepository moniteurRepository;

    @Autowired
    CoursRespository coursRespository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {

        moniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public Moniteur assignMoniteurToCours(Long numMoniteur, Long numCours) {
        Moniteur moniteur = moniteurRepository.findById(numMoniteur).orElse(null);
        Assert.notNull(moniteur, "skieur not found");
        Cours cours = coursRespository.findById(numCours).orElse(null);
        Assert.notNull(cours, "piste not found");

        //  if(skieur != null && piste != null )

        moniteur.getNumMoniteur();
           /*List<Piste> pistes = skieur.getPistes();
           pistes.add(piste);
           skieur.setPistes(pistes);*/
        return moniteurRepository.save(moniteur);

        // return  null;
    }
}
