package espritds.sky_wejden.Services;



import espritds.sky_wejden.Entiries.Abonnement;

import java.util.List;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    void removeAbonnement (Long numAbonnement);
    Abonnement retrieveAbonnement (Long numAbonnement);
}
