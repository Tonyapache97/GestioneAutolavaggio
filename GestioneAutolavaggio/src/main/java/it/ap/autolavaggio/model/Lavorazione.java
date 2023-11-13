package it.ap.autolavaggio.model;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Lavorazione {
	
	
	@Column()
	private String nomeLavorazione;
	@Column()
	private Integer costoLavorazione;
	@Column()
	@Id
	private String codLavorazione;
	
	@OneToMany(mappedBy = "lavorazione")
	private List<Effettuata> lavorazioniEffettuate;

	
	
	public String getNomeLavorazione() {
		return nomeLavorazione;
	}
	public void setNomeLavorazione(String nomeLavorazione) {
		this.nomeLavorazione = nomeLavorazione;
	}
	public int getCostoLavorazione() {
		return costoLavorazione;
	}
	public void setCostoLavorazione(int costoLavorazione) {
		this.costoLavorazione = costoLavorazione;
	}
	public String getCodLavorazione() {
		return codLavorazione;
	}
	public void setCodLavorazione(String codLavorazione) {
		this.codLavorazione = codLavorazione;
	}
	
	
	
	
	
	

}