package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.repository.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdificioServiceImpl implements EdificioService {

    @Autowired
    private EdificioRepository edificioRepository;

    @Override
    public EdificioModel save(EdificioModel edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public List<EdificioModel> findAll() {
        return edificioRepository.findAll();
    }

    @Override
    public Optional<EdificioModel> findById(Long id) {
        return edificioRepository.findById(id);
    }

    @Override
    public EdificioModel update(EdificioModel edificio) {
        return edificioRepository.save(edificio);
    }

    @Override
    public void deleteById(Long id) {
        edificioRepository.deleteById(id);
    }
}
