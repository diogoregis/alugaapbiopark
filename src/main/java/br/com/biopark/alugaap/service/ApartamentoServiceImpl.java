package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartamentoServiceImpl implements ApartamentoService {

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Override
    public ApartamentoModel save(ApartamentoModel apartamento) {
        return apartamentoRepository.save(apartamento);
    }

    @Override
    public List<ApartamentoModel> findAll() {
        return apartamentoRepository.findAll();
    }

    @Override
    public Optional<ApartamentoModel> findById(Long id) {
        return apartamentoRepository.findById(id);
    }

    @Override
    public ApartamentoModel update(ApartamentoModel apartamento) {
        return apartamentoRepository.save(apartamento);
    }

    @Override
    public void deleteById(Long id) {
        apartamentoRepository.deleteById(id);
    }
}
