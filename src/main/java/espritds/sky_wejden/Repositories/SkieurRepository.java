package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Skieur;
import espritds.sky_wejden.Entiries.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {


    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1")
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);


}
