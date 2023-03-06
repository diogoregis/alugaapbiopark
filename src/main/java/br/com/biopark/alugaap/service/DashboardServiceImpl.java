package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.controller.ApartamentoController;
import br.com.biopark.alugaap.model.*;
import br.com.biopark.alugaap.repository.AluguelRepository;
import br.com.biopark.alugaap.repository.ApartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class DashboardServiceImpl implements DashboardService{



    private static final DashboardServiceImpl DASHBOARD_SERVICE = new DashboardServiceImpl();
    private DashboardServiceImpl(){};
    public static DashboardServiceImpl getInstance(){
        return DASHBOARD_SERVICE;
    }

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Autowired
    private AluguelRepository aluguelRepository;

    @Override
    public List<ApartamentoModel> apartamentosDisponiveisAll() {
        List<ApartamentoModel> listaApartamentos = new ArrayList<ApartamentoModel>();
        List<ApartamentoModel> todosApartamentos = apartamentoRepository.findAll();
        for (ApartamentoModel apartamento: todosApartamentos) {
            if(apartamento.getApartamentoDisponivel()){
                listaApartamentos.add(apartamento);
            }
        }
        return listaApartamentos;
    }

    @Override
    public List<ApartamentoModel> apartamentosDisponiveisEdificio(Long id) {
        List<ApartamentoModel> listaApartamentos = new ArrayList<ApartamentoModel>();
        List<ApartamentoModel> todosApartamentos = apartamentoRepository.findAll();
        for (ApartamentoModel apartamento: todosApartamentos) {
            if(apartamento.getApartamentoDisponivel() && Objects.equals(apartamento.getEdificio().getId(), id)){
                listaApartamentos.add(apartamento);
            }
        }
        return listaApartamentos;
    }

    @Override
    public List<ApartamentoModel> apartamentosOcupadosAll() {
        List<ApartamentoModel> listaApartamentos = new ArrayList<ApartamentoModel>();
        List<ApartamentoModel> todosApartamentos = apartamentoRepository.findAll();
        for (ApartamentoModel apartamento: todosApartamentos) {
            if(!apartamento.getApartamentoDisponivel()){
                listaApartamentos.add(apartamento);
            }
        }
        return listaApartamentos;
    }

    @Override
    public List<ApartamentoModel> apartamentosOcupadosEdificio(Long id) {
        List<ApartamentoModel> listaApartamentos = new ArrayList<ApartamentoModel>();
        List<ApartamentoModel> todosApartamentos = apartamentoRepository.findAll();
        for (ApartamentoModel apartamento: todosApartamentos) {
            if(Objects.equals(apartamento.getEdificio().getId(), id)) {
                if (!apartamento.getApartamentoDisponivel()) {
                    listaApartamentos.add(apartamento);
                }
            }
        }
        return listaApartamentos;
    }

    @Override
    public List<AluguelModel> contratosAtivsoPorLocatario(Long id) {
        List<AluguelModel> contratosLocatarios = new ArrayList<AluguelModel>();
        if(aluguelRepository.findAll() == null || aluguelRepository.findAll().isEmpty()){
            return null;
        }
        List<AluguelModel> listaAluguel = aluguelRepository.findAll();
        for(AluguelModel aluguel : listaAluguel){
            if(aluguel.getContratoAtivo()){
                if(Objects.equals(aluguel.getLocatario().getId(), id)){
                    contratosLocatarios.add(aluguel);
                }
            }
        }
        return contratosLocatarios;
    }

    @Override
    public LocatarioModel retornarLocatarioApartamento(Long id) {
        LocatarioModel locatario = null;
        if(aluguelRepository.findAll().isEmpty() || aluguelRepository.findAll() == null){
            return null;
        }
        List<AluguelModel> listaAluguel = aluguelRepository.findAll();
        for(AluguelModel aluguel : listaAluguel){
            if(Objects.equals(aluguel.getApartamento().getId(), id)){
                locatario = aluguel.getLocatario();
            }
        }
        return locatario;
    }

    @Override
    public ContratoModel valorTotalDeContratosAtivosAll() {
        ContratoModel contratos = new ContratoModel();
        if(aluguelRepository.findAll() == null || aluguelRepository.findAll().isEmpty()){
            return null;
        }
        int quantidade = 0;
        double valorTotal = 0.0;
        List<AluguelModel> listaAluguel = aluguelRepository.findAll();

        for(AluguelModel aluguel : listaAluguel){
            if(aluguel.getContratoAtivo()){
                quantidade++;
                valorTotal += aluguel.getValorAluguel();
            }
        }
        contratos.setValorTotalContratos(valorTotal);
        contratos.setQuantidadeTotalContratos(quantidade);

        return contratos;
    }

    @Override
    public ContratoModel valorTotalDeContratosAtivosPorEdificio(Long id) {
        ContratoModel contrato = new ContratoModel();
        if(aluguelRepository.findAll() == null || aluguelRepository.findAll().isEmpty()){
            return null;
        }
        int quantidade = 0;
        double valorTotal = 0.0;
        List<AluguelModel> listaAluguel = aluguelRepository.findAll();

        for(AluguelModel aluguel : listaAluguel){
            if(aluguel.getContratoAtivo()){
                if(Objects.equals(aluguel.getApartamento().getEdificio().getId(), id)){
                    quantidade++;
                    valorTotal += aluguel.getValorAluguel();
                }
            }
        }
        contrato.setValorTotalContratos(valorTotal);
        contrato.setQuantidadeTotalContratos(quantidade);

        return contrato;
    }

    @Override
    public ContratoModel valorTotalDeContratosAtivosPorLocatario(Long id) {
        ContratoModel contrato = new ContratoModel();
        if(aluguelRepository.findAll() == null || aluguelRepository.findAll().isEmpty()){
            return null;
        }
        int quantidade = 0;
        double valorTotal = 0.0;
        List<AluguelModel> listaAluguel = aluguelRepository.findAll();

        for(AluguelModel aluguel : listaAluguel){
            if(aluguel.getContratoAtivo()){
                if(Objects.equals(aluguel.getLocatario().getId(), id)){
                    quantidade++;
                    valorTotal += aluguel.getValorAluguel();
                }
            }
        }
        contrato.setValorTotalContratos(valorTotal);
        contrato.setQuantidadeTotalContratos(quantidade);

        return contrato;
    }
}
