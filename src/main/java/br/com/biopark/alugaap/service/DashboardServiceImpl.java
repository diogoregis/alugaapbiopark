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
    public List<ApartamentoModel> apartamentosDisponiveisEdificio(EdificioModel edificio) {
        return null;
    }

    @Override
    public List<ApartamentoModel> apartamentosOcupadosAll() {
        return null;
    }

    @Override
    public List<ApartamentoModel> apartamentosOcupadosEdificio(EdificioModel edificio) {
        return null;
    }

    @Override
    public List<ApartamentoModel> apartamentoContratoAtivoPorLocatario(LocadorModel locatario) {
        return null;
    }

    @Override
    public LocatarioModel retornarLocatarioApartamento(ApartamentoModel apartamento) {
        return null;
    }

    @Override
    public Integer contratosAtivosAll() {
        return null;
    }

    @Override
    public Integer contratosAtivoPorEdificio(EdificioModel edificio) {
        return null;
    }

    @Override
    public Integer contratosAtivosPorLocatario(LocatarioModel locatario) {
        return null;
    }
}
