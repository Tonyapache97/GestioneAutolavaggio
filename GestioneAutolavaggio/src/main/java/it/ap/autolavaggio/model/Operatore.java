package it.ap.autolavaggio.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Operatore {
	
	
	@Column()
	private String nomeOperatore;
	@Column()
	private String cognomeOperatore;
	@Column()
	@Id
	private String cfOperatore;
	
	public String getNomeOperatore() {
		return nomeOperatore;
	}
	public void setNomeOperatore(String nomeOperatore) {
		this.nomeOperatore = nomeOperatore;
	}
	public String getCognomeOperatore() {
		return cognomeOperatore;
	}
	public void setCognomeOperatore(String cognomeOperatore) {
		this.cognomeOperatore = cognomeOperatore;
	}
	public String getCfOperatore() {
		return cfOperatore;
	}
	public void setCfOperatore(String cfOperatore) {
		this.cfOperatore = cfOperatore;
	}
	
	
	
	

}