package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.ApartamentoModel;
import br.com.biopark.alugaap.service.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/apartamentos")
public class ApartamentoController {

    @Autowired
    private ApartamentoService apartamentoService;

    @GetMapping()
    public ResponseEntity<List<ApartamentoModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(apartamentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ApartamentoModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(apartamentoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ApartamentoModel> create(@RequestBody ApartamentoModel apartamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(apartamentoService.save(apartamento));
    }

    @PutMapping
    public ResponseEntity<ApartamentoModel> update(@RequestBody ApartamentoModel apartamento){
        return ResponseEntity.status(HttpStatus.OK).body(apartamentoService.update(apartamento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        apartamentoService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
