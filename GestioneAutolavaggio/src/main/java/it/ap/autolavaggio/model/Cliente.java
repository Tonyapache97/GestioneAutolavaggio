package it.ap.autolavaggio.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;


@Entity
public class Cliente {
	
	private String nomeCliente;
	@Column()
	private String cognomeCliente;
	@Id
	@Column()
	private String cfCliente;
	
	@OneToMany(mappedBy = "cliente")
    private Set<Possiede> veicoliPosseduti;
	
	
	public String getCognomeCliente() {
		return cognomeCliente;
	}
	public void setCognomeCliente(String cognomeCliente) {
		this.cognomeCliente = cognomeCliente;
	}
	public String getCfCliente() {
		return cfCliente;
	}
	public void setCfCliente(String cfCliente) {
		this.cfCliente = cfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	

}
