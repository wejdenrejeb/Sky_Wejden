package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Cours;
import espritds.sky_wejden.Repositories.CoursRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return coursRespository.findById(numCours).orElse(null);
    }
}
