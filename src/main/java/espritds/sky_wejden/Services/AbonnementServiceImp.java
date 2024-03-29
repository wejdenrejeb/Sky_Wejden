package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Entiries.Skieur;
import espritds.sky_wejden.Entiries.TypeAbonnement;
import espritds.sky_wejden.Repositories.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class AbonnementServiceImp implements IAbonnementService{

    @Autowired
    AbonnementRepository abonnementRepository;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void removeAbonnement(Long numAbonnement) {
        abonnementRepository.deleteById(numAbonnement);

    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepository.findById(numAbonnement).orElse(null);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbon(type);
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementRepository.findByDateDebutAndDateFin(startDate,endDate);
    }
}
