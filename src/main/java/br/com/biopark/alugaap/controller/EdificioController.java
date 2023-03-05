package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.EdificioModel;
import br.com.biopark.alugaap.service.EdificioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/edificios")
public class EdificioController {

    @Autowired
    private EdificioService edificioService;

    @GetMapping()
    public ResponseEntity<List<EdificioModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(edificioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<EdificioModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(edificioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<EdificioModel> create(@RequestBody EdificioModel edificio){
        return ResponseEntity.status(HttpStatus.CREATED).body(edificioService.save(edificio));
    }

    @PutMapping
    public ResponseEntity<EdificioModel> update(@RequestBody EdificioModel edificio){
        return ResponseEntity.status(HttpStatus.OK).body(edificioService.update(edificio));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        edificioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
