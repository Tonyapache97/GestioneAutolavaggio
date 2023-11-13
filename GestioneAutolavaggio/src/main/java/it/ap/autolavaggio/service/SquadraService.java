package it.ap.autolavaggio.service;

import org.springframework.stereotype.Service;


import it.ap.autolavaggio.Repository.SquadraRepository;
import it.ap.autolavaggio.model.Squadra;

import java.util.List;

@Service
public class SquadraService {

    private final SquadraRepository squadraRepository;

    public SquadraService(SquadraRepository squadraRepository) {
        this.squadraRepository = squadraRepository;
    }

    public List<Squadra> findAllSquadre() {
        return squadraRepository.findAll();
    }

    
}
