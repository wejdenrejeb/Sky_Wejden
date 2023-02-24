package espritds.sky_wejden.Services;



import espritds.sky_wejden.Entiries.Inscription;

import java.util.List;

public interface IInscriptionService {

    List<Inscription> retrieveAllInscriptions();
    Inscription addInscription(Inscription inscription);

    Inscription updateInscription(Inscription inscription);

    void removeInscription (Long numInscription);
    Inscription retrieveInscription (Long numInscription);
}
