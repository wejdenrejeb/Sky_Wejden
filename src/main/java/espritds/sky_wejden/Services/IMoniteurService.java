package espritds.sky_wejden.Services;




import espritds.sky_wejden.Entiries.Moniteur;

import java.util.List;

public interface IMoniteurService {

    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);

    Moniteur updateMoniteur(Moniteur moniteur);

    void removeMoniteur (Long numMoniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    Moniteur assignMoniteurToCours(Long numMoniteur, Long numCours);
}
