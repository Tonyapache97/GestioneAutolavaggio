package it.ap.autolavaggio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ap.autolavaggio.Repository.ClienteRepository;
import it.ap.autolavaggio.model.Cliente;

@Service

public class ClienteService {
	
	@Autowired
	private ClienteRepository crepo;
	
	
	public Cliente getCliente(String cf){
		Optional<Cliente> c = this.crepo.findById(cf);
		if (c.isPresent()) {
			return c.get();
		}
		return null;
	}
	
	
	public boolean insertCliente(Cliente c) {
         
	    try {
	    	this.crepo.save(c);
	    	return true;
	    }
	     catch( Exception e) {
	     return false;
	    }

}
}
