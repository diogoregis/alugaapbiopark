package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.*;
import br.com.biopark.alugaap.service.DashboardService;
import br.com.biopark.alugaap.service.DashboardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ApartamentoModel>> apartamentosDisponiveisEdificio(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.apartamentosDisponiveisEdificio(id));
    }

    @GetMapping("/ocupados")
    public ResponseEntity<List<ApartamentoModel>> apartamentosOcupadosAll(){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.apartamentosOcupadosAll());
    }

    @GetMapping("/ocupados/{id}")
    public ResponseEntity<List<ApartamentoModel>> apartamentosOcupadosEdificio(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.apartamentosOcupadosEdificio(id));
    }

    @GetMapping("/ocupados/locatario")
    public ResponseEntity<List<AluguelModel>> contratosAtivsoPorLocatario(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.contratosAtivsoPorLocatario(id));
    }

    @GetMapping("/ocupados/locatario/{id}")
    public ResponseEntity<LocatarioModel> retornarLocatarioApartamento(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(dashboard.retornarLocatarioApartamento(id));
    }

    /*Integer contratosAtivosAll();

    Integer contratosAtivoPorEdificio(EdificioModel edificio);

    Integer contratosAtivosPorLocatario(LocatarioModel locatario);*/


}
