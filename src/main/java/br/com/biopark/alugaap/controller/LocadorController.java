package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.LocadorModel;
import br.com.biopark.alugaap.service.LocadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/locadores")
public class LocadorController {

    @Autowired
    private LocadorService locadorService;

    @GetMapping()
    public ResponseEntity<List<LocadorModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(locadorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LocadorModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(locadorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<LocadorModel> create(@RequestBody LocadorModel locador){
        return ResponseEntity.status(HttpStatus.CREATED).body(locadorService.save(locador));
    }

    @PutMapping
    public ResponseEntity<LocadorModel> update(@RequestBody LocadorModel locador){
        return ResponseEntity.status(HttpStatus.OK).body(locadorService.update(locador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        locadorService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
