package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.LocatarioModel;
import br.com.biopark.alugaap.repository.LocatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocatarioServiceImpl implements LocatarioService {

    @Autowired
    private LocatarioRepository locatarioRepository;

    @Override
    public LocatarioModel save(LocatarioModel locatario) {
        return locatarioRepository.save(locatario);
    }

    @Override
    public List<LocatarioModel> findAll() {
        return locatarioRepository.findAll();
    }

    @Override
    public Optional<LocatarioModel> findById(Long id) {
        return locatarioRepository.findById(id);
    }

    @Override
    public LocatarioModel update(LocatarioModel locatario) {
        return locatarioRepository.save(locatario);
    }

    @Override
    public void deleteById(Long id) {
        locatarioRepository.deleteById(id);
    }
}
