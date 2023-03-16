package espritds.sky_wejden.Services;



import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Entiries.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    void removeAbonnement (Long numAbonnement);
    Abonnement retrieveAbonnement (Long numAbonnement);

    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,

                                                  LocalDate endDate);
}
