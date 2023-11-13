package it.ap.autolavaggio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ap.autolavaggio.Repository.OperatoreRepository;
import it.ap.autolavaggio.model.Operatore;


@Service
public class OperatoreService {
	
	@Autowired
	private OperatoreRepository vrepo;
	
	public boolean insertOperatore(Operatore o) {
		Optional<Operatore> operatore= this.vrepo.findById(o.getCfOperatore());
		if (operatore.isPresent()) {
			return false;
			
		}  else {
			   this.vrepo.save(o);
			   return true;
		}
		
	}

}
