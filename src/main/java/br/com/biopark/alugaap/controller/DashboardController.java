package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.model.LocatarioModel;
import br.com.biopark.alugaap.service.DashboardService;
import br.com.biopark.alugaap.service.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/dashboard")
public class DashboardController {


    @Autowired
    private DashboardService dashboard;

    @GetMapping()
    public ResponseEntity<List<ApartamentoModel>> apartamentosDisponiveisAll(){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.apartamentosDisponiveisAll());
    };

    /*List<ApartamentoModel> apartamentosDisponiveisEdificio(EdificioModel edificio);

    List<ApartamentoModel> apartamentosOcupadosAll();

    List<ApartamentoModel> apartamentosOcupadosEdificio(EdificioModel edificio);

    List<ApartamentoModel> apartamentoContratoAtivoPorLocatario(LocadorModel locatario);

    LocatarioModel retornarLocatarioApartamento(ApartamentoModel apartamento);

    Integer contratosAtivosAll();

    Integer contratosAtivoPorEdificio(EdificioModel edificio);

    Integer contratosAtivosPorLocatario(LocatarioModel locatario);*/


}
