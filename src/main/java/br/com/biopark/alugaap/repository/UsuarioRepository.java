package br.com.biopark.alugaap.repository;

import br.com.biopark.alugaap.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
