package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.*;

import java.util.List;

public interface DashboardService {

    List<ApartamentoModel> apartamentosDisponiveisAll();

    List<ApartamentoModel> apartamentosDisponiveisEdificio(Long id);

    List<ApartamentoModel> apartamentosOcupadosAll();

    List<ApartamentoModel> apartamentosOcupadosEdificio(Long id);

    List<LocatarioModel> contratosAtivsoPorLocatario();

    LocatarioModel retornarLocatarioApartamento(Long id);

    ContratoModel valorTotalDeContratosAtivosAll();

    ContratoModel valorTotalDeContratosAtivosPorEdificio(Long id);

    ContratoModel valorTotalDeContratosAtivosPorLocatario(Long id);

}
