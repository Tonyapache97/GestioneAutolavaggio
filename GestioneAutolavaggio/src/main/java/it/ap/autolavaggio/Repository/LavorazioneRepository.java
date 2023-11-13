package it.ap.autolavaggio.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ap.autolavaggio.model.Lavorazione;

@Repository
public interface LavorazioneRepository extends JpaRepository<Lavorazione, String>{
	Optional<Lavorazione> findByCodLavorazione(String codLavorazione);
	
}
