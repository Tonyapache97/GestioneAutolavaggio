package it.ap.autolavaggio.service;



import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.ap.autolavaggio.Repository.VeicoloRepository;
import it.ap.autolavaggio.model.Veicolo;



@Service
public class VeicoloService {
	
	@Autowired
	private VeicoloRepository vrepo;
		
	
	public Integer insertVeicolo(Veicolo v) {
		Optional<Veicolo> veicolo= this.vrepo.findById(v.getnTelaio());
		if (veicolo.isPresent()) {
			return 0;
			
		}  else {
			   this.vrepo.save(v);
			   return 1;
		}
		
	}
	

	
}
