package it.ap.autolavaggio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ap.autolavaggio.Repository.LavorazioneRepository;
import it.ap.autolavaggio.model.Lavorazione;

@Service

public class LavorazioneService {
	
	@Autowired
	private LavorazioneRepository lrepo;
	
	
	public Lavorazione getLavorazione(String cod){
		Optional<Lavorazione> l = this.lrepo.findById(cod);
		if (l.isPresent()) {
			return l.get();
		}
		return null;
	}
	
	


}
