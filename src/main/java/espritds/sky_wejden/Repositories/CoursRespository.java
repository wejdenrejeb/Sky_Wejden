package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursRespository extends JpaRepository<Cours,Long> {


    @Query(value = "SELECT * " +
            "FROM cours c " +
            "ORDER BY (SELECT COUNT * FROM inscription i WHERE i.cour_num_cours = c.num_cours) " , nativeQuery = true)
    List<Cours> getAllOrderByInscriptonNumberSQL();


    @Query(value = "SELECT c FROM Cours c ORDER BY c.inscriptions.size")
    List<Cours> getAllOrderByInscriptonNumberJPQL();



    @Query(value = "SELECT *" +
            "FROM skieur s " +
            "JOIN inscription i " +
            "ON s.num_skieur = i.skieur_num_skieur" +
            "JOIN cours c " +
            "ON c.num_cours = i.cour_num_cours" +
            "JOIN moniteur_cours mc" +
            "ON mc.cours_num_cours= c.num_cours" +
            "JOIN moniteur m ON m.num_moniteur=mc.moniteur_num_moniteur" +
            "WHERE c.support = :support" +
            "AND m.nomm=:nom", nativeQuery = true)
    List<Cours> getSKieurByMoniteurAndSupportSQL(@Param("support") String support, @Param("nom") String nom);





    //select i.skieur from inscription

    @Query(value = "SELECT s from Skieur s " +
            "JOIN  Inscription i ON i.skieur=s  " +
            "JOIN Moniteur m ON i.cour member of m.cours " +
            "WHERE m.nomM=:nom AND  i.cour.support=:support")
    List<Cours> getSKieurByMoniteurAndSupportJPQL(@Param("support") String support, @Param("nom") String nom);




}
