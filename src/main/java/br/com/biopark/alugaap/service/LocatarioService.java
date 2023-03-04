package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.LocatarioModel;

import java.util.List;
import java.util.Optional;

public interface LocatarioService {

    LocatarioModel save(LocatarioModel locatario);

    List<LocatarioModel> findAll();

    Optional<LocatarioModel> findById(Long id);

    LocatarioModel update(LocatarioModel locatario);

    void deleteById(Long id);

}
