package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Inscription;
import espritds.sky_wejden.Repositories.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServiceImp implements IInscriptionService{

    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void removeInscription(Long numInscription) {

        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }
}
