package br.com.biopark.alugaap.service;

import br.com.biopark.alugaap.model.*;

import java.util.List;

public interface DashboardService {

    List<ApartamentoModel> apartamentosDisponiveisAll();

    List<ApartamentoModel> apartamentosDisponiveisEdificio(Long id);

    List<ApartamentoModel> apartamentosOcupadosAll();

    List<ApartamentoModel> apartamentosOcupadosEdificio(Long id);

    List<AluguelModel> contratosAtivsoPorLocatario(Long id);

    LocatarioModel retornarLocatarioApartamento(Long id);

    ContratoModel contratosAtivosAll();

    List<ContratoModel> contratosAtivoPorEdificio(Long id);

    List<ContratoModel> contratosAtivosPorLocatario(Long id);

}
