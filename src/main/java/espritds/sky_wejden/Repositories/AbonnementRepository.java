package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Abonnement;
import espritds.sky_wejden.Entiries.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {

    List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
}
