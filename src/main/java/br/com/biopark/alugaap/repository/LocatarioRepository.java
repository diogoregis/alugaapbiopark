package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.LocatarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocatarioRepository extends JpaRepository<LocatarioModel, Long> {
}
