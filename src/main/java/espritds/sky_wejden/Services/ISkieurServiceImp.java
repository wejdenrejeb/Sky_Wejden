package espritds.sky_wejden.Services;
import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Entiries.Piste;
import espritds.sky_wejden.Entiries.Skieur;

import espritds.sky_wejden.Repositories.AbonnementRepository;
import espritds.sky_wejden.Repositories.PisteRepository;
import espritds.sky_wejden.Repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ISkieurServiceImp implements ISkieurService {


    @Autowired
    SkieurRepository skieurRepository;

    @Autowired
    PisteRepository pisteRepository;

    @Autowired
    AbonnementRepository abonnementRepository;


    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    //save(skieur : onjet json mafihech l id)

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }
    //save(skieur : onjet json fih l id)

    @Override
    public void removeSkieur(Long numSkieur) {

        skieurRepository.deleteAll();

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //recuperation des objets

        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        //verification
        if (skieur != null && piste != null) {
            //traitement : affectation
            skieur.getPistes().add(piste); //pour ne pas ecraser les anciens objets (setpiste va ecraser les donnees l 9dom

            /*
            ou bien

            List<Piste> pistes = skieur.getPistes();
             pistes.add(piste);
            skieur.setPistes(pistes);

             */

            //save
            return skieurRepository.save(skieur);


        }
        return null;
    }


    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbonnement) {

        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Abonnement abonnement = abonnementRepository.findById(numAbonnement).orElse(null);

        if (skieur != null && abonnement != null) {

            skieur.setAbonnement(abonnement);
            return skieurRepository.save(skieur);


        }


        return null;


    }





}