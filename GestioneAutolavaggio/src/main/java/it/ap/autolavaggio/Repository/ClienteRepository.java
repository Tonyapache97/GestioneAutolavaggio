package it.ap.autolavaggio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.ap.autolavaggio.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
