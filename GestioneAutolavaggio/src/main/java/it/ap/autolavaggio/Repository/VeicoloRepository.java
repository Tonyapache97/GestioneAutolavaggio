package it.ap.autolavaggio.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ap.autolavaggio.model.Veicolo;

@Repository
public interface VeicoloRepository extends JpaRepository<Veicolo, String>{
	Optional<Veicolo> findBynTelaio(String nTelaio);



}
