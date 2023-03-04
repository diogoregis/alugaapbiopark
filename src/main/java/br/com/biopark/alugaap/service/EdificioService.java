package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.EdificioModel;

import java.util.List;
import java.util.Optional;

public interface EdificioService {

    EdificioModel save(EdificioModel edificio);

    List<EdificioModel> findAll();

    Optional<EdificioModel> findById(Long id);

    EdificioModel update(EdificioModel edificio);

    void deleteById(Long id);

}
