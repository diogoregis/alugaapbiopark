package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.LocatarioModel;
import br.com.biopark.alugaap.service.LocatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/locatarios")
public class LocatarioController {

    @Autowired
    private LocatarioService locatarioService;

    @GetMapping()
    public ResponseEntity<List<LocatarioModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(locatarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LocatarioModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(locatarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<LocatarioModel> create(@RequestBody LocatarioModel locatario){
        return ResponseEntity.status(HttpStatus.CREATED).body(locatarioService.save(locatario));
    }

    @PutMapping
    public ResponseEntity<LocatarioModel> update(@RequestBody LocatarioModel locatario){
        return ResponseEntity.status(HttpStatus.OK).body(locatarioService.update(locatario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        locatarioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
