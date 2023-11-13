package it.ap.autolavaggio.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Possiede {
    @Id
    @ManyToOne
    @JoinColumn(name = "cf_cliente")
    private Cliente cliente;

    @Id
    @ManyToOne
    @JoinColumn(name = "n_telaio")
    private Veicolo veicolo;

    @Column(name = "data_registrazione")
    private Date dataRegistrazione;

    
}
