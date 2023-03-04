package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.ApartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentoRepository extends JpaRepository<ApartamentoModel, Long> {
}
