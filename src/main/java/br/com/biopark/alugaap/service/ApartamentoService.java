package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.ApartamentoModel;

import java.util.List;
import java.util.Optional;

public interface ApartamentoService {

    ApartamentoModel save(ApartamentoModel apartamento);

    List<ApartamentoModel> findAll();

    Optional<ApartamentoModel> findById(Long id);

    ApartamentoModel update(ApartamentoModel apartamento);

    void deleteById(Long id);

}
