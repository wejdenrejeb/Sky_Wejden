package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Moniteur;
import espritds.sky_wejden.Repositories.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImp implements IMoniteurService {


    @Autowired
    MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {

        moniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
