package espritds.sky_wejden.Services;

import espritds.sky_wejden.Entiries.Piste;
import espritds.sky_wejden.Entiries.Skieur;

import java.util.List;
import java.util.Optional;

public interface IPisteService {

    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Optional<Piste> retrievePiste (Long numPiste);
    void removePiste(Long numPiste);
}
