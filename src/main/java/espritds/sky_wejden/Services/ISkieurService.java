package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.*;

import java.util.List;

public interface ISkieurService {

    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    List<Skieur> findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCouleur(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Couleur pistes_couleur);

   Skieur addSkierAndAssignToCourse(Skieur skieur);





}
