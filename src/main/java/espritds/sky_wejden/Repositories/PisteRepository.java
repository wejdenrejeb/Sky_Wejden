package espritds.sky_wejden.Repositories;

import espritds.sky_wejden.Entiries.Piste;
import espritds.sky_wejden.Entiries.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepository extends JpaRepository<Piste,Long> {
}
