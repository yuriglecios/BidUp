package br.com.bidup.repository;

import br.com.bidup.model.Contratos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratosRepository extends JpaRepository<Contratos, Long> {
    Contratos findByIdCompra(String idCompra);
}
