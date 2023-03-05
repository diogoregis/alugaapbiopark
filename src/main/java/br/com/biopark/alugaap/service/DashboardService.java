package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.model.LocatarioModel;

import java.util.List;

public interface DashboardService {

    List<ApartamentoModel> apartamentosDisponiveisAll();

    List<ApartamentoModel> apartamentosDisponiveisEdificio(EdificioModel edificio);

    List<ApartamentoModel> apartamentosOcupadosAll();

    List<ApartamentoModel> apartamentosOcupadosEdificio(EdificioModel edificio);

    List<ApartamentoModel> apartamentoContratoAtivoPorLocatario(LocadorModel locatario);

    LocatarioModel retornarLocatarioApartamento(ApartamentoModel apartamento);

    Integer contratosAtivosAll();

    Integer contratosAtivoPorEdificio(EdificioModel edificio);

    Integer contratosAtivosPorLocatario(LocatarioModel locatario);

}
