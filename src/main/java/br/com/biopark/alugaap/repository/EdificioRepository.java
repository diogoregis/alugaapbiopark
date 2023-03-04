package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.EdificioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<EdificioModel, Long> {
}
