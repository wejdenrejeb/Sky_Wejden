package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoursRespository extends JpaRepository<Cours,Long> {


    @Query(value = "SELECT * " +
            "FROM cours c " +
            "ORDER BY (SELECT COUNT * FROM inscription i WHERE i.cour_num_cours = c.num_cours) " , nativeQuery = true)
    List<Cours> getAllOrderByInscriptonNumberSQL();


    @Query(value = "SELECT c FROM Cours c ORDER BY c.inscriptions.size")
    List<Cours> getAllOrderByInscriptonNumberJPQL();
}
