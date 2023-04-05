package espritds.sky_wejden.Services;
import espritds.sky_wejden.Entiries.*;

import espritds.sky_wejden.Repositories.AbonnementRepository;
import espritds.sky_wejden.Repositories.PisteRepository;
import espritds.sky_wejden.Repositories.SkieurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService {



    private final SkieurRepository skieurRepository;


    private final PisteRepository pisteRepository;


    private final AbonnementRepository abonnementRepository;



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

            Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
            Assert.notNull(skieur, "skieur not found");
            Piste piste = pisteRepository.findById(numPiste).orElse(null);
            Assert.notNull(piste, "piste not found");

           //  if(skieur != null && piste != null )

                skieur.getPistes().add(piste);
           /*List<Piste> pistes = skieur.getPistes();
           pistes.add(piste);
           skieur.setPistes(pistes);*/
               return skieurRepository.save(skieur);

           // return  null;
        }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        {
            //RECUPERATION ID
            Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
            Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
            Assert.notNull(abonnement,"abonnement n existe pas ");
            //verrificationnon null
            //if(skieur!=null && abonnement!=null){
            //traitement
            // skieur.getPistes().add(piste);
            skieur.setAbonnement(abonnement);
            return  skieurRepository.save(skieur);
            //}
            //return null;
        }
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {

            return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);


            //tant que j ai besoin d une liste de skieur donc repo de skieur
    }






    @Override
    public List<Skieur> findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCouleur(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Couleur pistes_couleur) {
        return skieurRepository.findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCouleur(inscriptions_cour_typeCours,inscriptions_cour_support,pistes_couleur);
    }
















  /*
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


    /*
            //save
            return skieurRepository.save(skieur);


        }
        return null;
    }





    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        //RECUPERATION ID
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
        Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
//verrificationnon null
        if(skieur!=null && abonnement!=null){
//traitement
            // skieur.getPistes().add(piste);

            skieur.setAbonnement(abonnement);

            return  skieurRepository.save(skieur);

        }
        return null;}





     */



}
