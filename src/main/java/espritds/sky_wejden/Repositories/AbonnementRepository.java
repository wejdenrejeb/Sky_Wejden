package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Entiries.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

   // List<Abonnement> findByTypeAbon (TypeAbonnement typeAbonnement);

    Set<Abonnement> findByTypeAbon (TypeAbonnement type);

    List<Abonnement> findByDateDebutAndDateFin(LocalDate DateDebut, LocalDate DateFin);
}
