package it.ap.autolavaggio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ap.autolavaggio.model.Squadra;

@Repository
public interface SquadraRepository extends JpaRepository<Squadra, Integer> {
    
}
