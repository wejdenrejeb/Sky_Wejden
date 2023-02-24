package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Cours;


import java.util.List;

public interface ICoursService {

    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);

    Cours updateCours(Cours cours);

    void removeCours (Long numCours);
    Cours retrieveCours (Long numCours);
}
