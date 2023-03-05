package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.controller.ApartamentoController;
import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.model.LocatarioModel;
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
    private ApartamentoService apartamentoService;

    @Override
    public List<ApartamentoModel> apartamentosDisponiveisAll() {
        List<ApartamentoModel> listaApartamentos = new ArrayList<ApartamentoModel>();
        List<ApartamentoModel> todosApartamentos = apartamentoService.findAll();
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
        List<ApartamentoModel> todosApartamentos = apartamentoService.findAll();
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
        List<ApartamentoModel> todosApartamentos = apartamentoService.findAll();
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
        List<ApartamentoModel> todosApartamentos = apartamentoService.findAll();
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
    public List<ApartamentoModel> apartamentoContratoAtivoPorLocatario(Long id) {
        return null;
    }

    @Override
    public LocatarioModel retornarLocatarioApartamento(Long id) {
        return null;
    }

    @Override
    public Integer contratosAtivosAll() {
        return null;
    }

    @Override
    public Integer contratosAtivoPorEdificio(Long id) {
        return null;
    }

    @Override
    public Integer contratosAtivosPorLocatario(Long id) {
        return null;
    }
}
