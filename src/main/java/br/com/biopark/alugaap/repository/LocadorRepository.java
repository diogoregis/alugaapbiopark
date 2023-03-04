package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.LocadorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocadorRepository extends JpaRepository<LocadorModel, Long> {
}
