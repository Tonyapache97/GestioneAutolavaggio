package it.ap.autolavaggio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.ap.autolavaggio.model.Operatore;
import it.ap.autolavaggio.model.Veicolo;
import it.ap.autolavaggio.service.OperatoreService;
import it.ap.autolavaggio.service.VeicoloService;




@Controller
public class MainController {
	
	@Autowired
	private VeicoloService Service; 
	
	
@PostMapping(value = "/insert_veicolo")
public String insertVeicolo(@ModelAttribute Veicolo v) {
	this.Service.insertVeicolo(v);
	return "result";
}

@GetMapping(path="/index")
public String home()
{ 
	return "index";
}


@Autowired
private OperatoreService operatoreService;

@PostMapping(value = "/insert_operatore")
public String insertOperatore(@ModelAttribute Operatore o) {
	this.operatoreService.insertOperatore(o);
	return "result";
}
	
	
	

}
