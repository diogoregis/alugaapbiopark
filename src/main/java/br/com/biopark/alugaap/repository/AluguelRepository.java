package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.AluguelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<AluguelModel, Long> {
}
