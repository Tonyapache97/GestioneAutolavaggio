package it.ap.autolavaggio.model;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Squadra {
	
	    @Id
	    @Column(name = "codSquadra")
	    private Integer codSquadra;

	    @Column(name = "nAddetti")
	    private Integer numeroAddetti;

	    
	    @OneToMany(mappedBy = "squadra")
	    private List<Effettuata> lavorazioniEffettuate;

	    // Standard getters and setters
	    public Integer getCodSquadra() {
	        return codSquadra;
	    }

	    public void setCodSquadra(Integer codSquadra) {
	        this.codSquadra = codSquadra;
	    }

	    public Integer getNumeroAddetti() {
	        return numeroAddetti;
	    }

	    public void setNumeroAddetti(Integer numeroAddetti) {
	        this.numeroAddetti = numeroAddetti;
	    }

	    public List<Effettuata> getLavorazioniEffettuate() {
	        return lavorazioniEffettuate;
	    }

	    public void setLavorazioniEffettuate(List<Effettuata> lavorazioniEffettuate) {
	        this.lavorazioniEffettuate = lavorazioniEffettuate;
	    }
	    
	    
	}

