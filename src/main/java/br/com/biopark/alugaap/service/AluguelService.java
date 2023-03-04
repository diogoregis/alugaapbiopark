package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.AluguelModel;

import java.util.List;
import java.util.Optional;

public interface AluguelService {

    AluguelModel save(AluguelModel aluguel);

    List<AluguelModel> findAll();

    Optional<AluguelModel> findById(Long id);

    AluguelModel update(AluguelModel aluguel);

    void deleteById(Long id);

}
