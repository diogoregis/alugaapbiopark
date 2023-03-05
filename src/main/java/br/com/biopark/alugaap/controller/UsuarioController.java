package br.com.biopark.alugaap.controller;

import br.com.biopark.alugaap.model.UsuarioModel;
import br.com.biopark.alugaap.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public ResponseEntity<List<UsuarioModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UsuarioModel>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<UsuarioModel> create(@RequestBody UsuarioModel usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @PutMapping
    public ResponseEntity<UsuarioModel> update(@RequestBody UsuarioModel usuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.update(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        usuarioService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
