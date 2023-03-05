package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.repository.LocadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocadorServiceImpl implements LocadorService {

    @Autowired
    private LocadorRepository locadorRepository;

    @Override
    public LocadorModel save(LocadorModel locador) {
        return locadorRepository.save(locador);
    }

    @Override
    public List<LocadorModel> findAll() {
        return locadorRepository.findAll();
    }

    @Override
    public Optional<LocadorModel> findById(Long id) {
        return locadorRepository.findById(id);
    }

    @Override
    public LocadorModel update(LocadorModel locador) {
        return locadorRepository.save(locador);
    }

    @Override
    public void deleteById(Long id) {
        locadorRepository.deleteById(id);
    }
}