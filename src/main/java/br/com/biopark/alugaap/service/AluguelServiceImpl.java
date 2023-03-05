package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.AluguelModel;
import br.com.biopark.alugaap.repository.AluguelRepository;
import br.com.biopark.alugaap.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Override
    public AluguelModel save(AluguelModel aluguel) {
        AluguelModel contrato = aluguel;
        contrato.getApartamento().setApartamentoDisponivel(false);
        apartamentoRepository.save(contrato.getApartamento());
        return aluguelRepository.save(contrato);
    }

    @Override
    public List<AluguelModel> findAll() {
        return aluguelRepository.findAll();
    }

    @Override
    public Optional<AluguelModel> findById(Long id) {
        return aluguelRepository.findById(id);
    }

    @Override
    public AluguelModel update(AluguelModel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    @Override
    public void deleteById(Long id) {
        AluguelModel aluguel = aluguelRepository.findById(id).get();
        aluguel.getApartamento().setApartamentoDisponivel(true);
        aluguel.setContratoAtivo(false);
        aluguel.setDataEncerramentoContrato(LocalDate.now());
        aluguelRepository.save(aluguel);
    }
}