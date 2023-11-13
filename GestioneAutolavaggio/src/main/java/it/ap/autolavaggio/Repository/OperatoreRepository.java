package it.ap.autolavaggio.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ap.autolavaggio.model.Operatore;



@Repository
public interface OperatoreRepository extends JpaRepository<Operatore, String>{
	Optional<Operatore> findByCfOperatore(String cfOperatore);
	
}
