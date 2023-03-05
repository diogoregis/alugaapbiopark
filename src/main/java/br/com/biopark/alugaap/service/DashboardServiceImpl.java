package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.model.LocatarioModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardServiceImpl implements DashboardService{



    private static final DashboardServiceImpl DASHBOARD_SERVICE = new DashboardServiceImpl();
    private DashboardServiceImpl(){};
    public static DashboardServiceImpl getInstance(){
        return DASHBOARD_SERVICE;
    }


    @Override
    public List<ApartamentoModel> apartamentosDisponiveisAll() {

        return null;
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
