package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.AluguelModel;
import br.com.biopark.alugaap.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/alugueis")
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;

    @GetMapping()
    public ResponseEntity<List<AluguelModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(aluguelService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AluguelModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(aluguelService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AluguelModel> create(@RequestBody AluguelModel aluguel){
        return ResponseEntity.status(HttpStatus.CREATED).body(aluguelService.save(aluguel));
    }

    @PutMapping
    public ResponseEntity<AluguelModel> update(@RequestBody AluguelModel aluguel){
        return ResponseEntity.status(HttpStatus.OK).body(aluguelService.update(aluguel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        aluguelService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
