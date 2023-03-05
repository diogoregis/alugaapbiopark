package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.model.LocatarioModel;

import java.util.List;

public interface DashboardService {

    List<ApartamentoModel> apartamentosDisponiveisAll();

    List<ApartamentoModel> apartamentosDisponiveisEdificio(Long id);

    List<ApartamentoModel> apartamentosOcupadosAll();

    List<ApartamentoModel> apartamentosOcupadosEdificio(Long id);

    List<ApartamentoModel> apartamentoContratoAtivoPorLocatario(Long id);

    LocatarioModel retornarLocatarioApartamento(Long id);

    Integer contratosAtivosAll();

    Integer contratosAtivoPorEdificio(Long id);

    Integer contratosAtivosPorLocatario(Long id);

}
