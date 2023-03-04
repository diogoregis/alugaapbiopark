package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    UsuarioModel save(UsuarioModel usuario);

    List<UsuarioModel> findAll();

    Optional<UsuarioModel> findById(Long id);

    UsuarioModel update(UsuarioModel usuario);

    void deleteById(Long id);

}
