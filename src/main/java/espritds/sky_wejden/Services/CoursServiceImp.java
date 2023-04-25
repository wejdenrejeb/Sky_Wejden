package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Cours;
import espritds.sky_wejden.Repositories.CoursRespository;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class CoursServiceImp implements ICoursService{

    @Autowired
    CoursRespository coursRespository;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRespository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRespository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRespository.save(cours);
    }

    @Override
    public void removeCours(Long numCours) {
        coursRespository.deleteById(numCours);

    }

    @Override
    public Cours retrieveCours(Long numCours) {
        log.info("in removeCours");
        return coursRespository.findById(numCours).orElse(null);
    }


    @Scheduled(fixedDelay = 60000)
    @Scheduled(fixedRate= 60000)
    @Scheduled (cron = "0 0 0 * * MON-FRI")
    @Override
    public void testScheduler() {

        log.info("hi");
        System.out.println();


    }

    //1 min = 60000 ms
}
