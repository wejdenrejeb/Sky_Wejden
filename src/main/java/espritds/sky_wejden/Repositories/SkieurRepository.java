package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {



    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);

    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1 and s.ville = ?2")
    List<Skieur> findByAbonnementTypeAbonJPQL(TypeAbonnement typeAbonnement,String ville);

    @Query("select s from Skieur s where s.abonnement.typeAbon = :typeAbonnement and s.ville = :ville")
    List<Skieur> findByAbonnementTypeAbonJPQL2(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville);

    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "JOIN abonnement a " +
            "ON s.abonnement_num_abon = a.num_abon " +
            "WHERE a.type_abon = :typeAbonnement "+
            "AND s.ville = :ville ",nativeQuery = true)
    List<Skieur> findByAbonnementTypeAbonAndVilleSQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville);




    List<Skieur> findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCouleur(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Couleur pistes_couleur);




}
