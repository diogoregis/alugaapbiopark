package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.LocadorModel;

import java.util.List;
import java.util.Optional;

public interface LocadorService {

    LocadorModel save(LocadorModel locador);

    List<LocadorModel> findAll();

    Optional<LocadorModel> findById(Long id);

    LocadorModel update(LocadorModel locador);

    void deleteById(Long id);

}
