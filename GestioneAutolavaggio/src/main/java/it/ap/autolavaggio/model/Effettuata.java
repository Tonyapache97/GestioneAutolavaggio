package it.ap.autolavaggio.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Effettuata {
	
	@Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "nTelaio")
    private Veicolo veicolo;

    @ManyToOne
    @JoinColumn(name = "codLavorazione")
    private Lavorazione lavorazione;

    @ManyToOne
    @JoinColumn(name = "codSquadra")
    private Squadra squadra;

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Veicolo getVeicolo() {
		return veicolo;
	}
	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}
	public Lavorazione getLavorazione() {
		return lavorazione;
	}
	public void setLavorazione(Lavorazione lavorazione) {
		this.lavorazione = lavorazione;
	}
	public Squadra getSquadra() {
		return squadra;
	}
	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}
	public Date getDataOrdine() {
		return dataOrdine;
	}
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	public Float getCostoEffettivo() {
		return costoEffettivo;
	}
	public void setCostoEffettivo(Float costoEffettivo) {
		this.costoEffettivo = costoEffettivo;
	}
	private Date dataOrdine;
    private Float costoEffettivo;
	
	
	
	
}