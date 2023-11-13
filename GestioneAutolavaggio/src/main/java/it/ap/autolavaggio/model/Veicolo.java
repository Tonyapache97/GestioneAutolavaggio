package it.ap.autolavaggio.model;



import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Veicolo {
	
	@Id
	@Column(name="telaio")
	private String nTelaio;
	
	@Column()
	private String targa;
	
	@OneToMany(mappedBy = "veicolo")
    private Set<Possiede> proprietari;
	
	
	
	
	
	public String getnTelaio() {
		return nTelaio;
	}
	public void setnTelaio(String nTelaio) {
		this.nTelaio = nTelaio;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}

}
