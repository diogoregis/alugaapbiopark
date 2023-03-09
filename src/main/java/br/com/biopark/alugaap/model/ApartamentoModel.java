package br.com.biopark.alugaap.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class ApartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private EdificioModel edificio;

    @ManyToOne
    private LocadorModel locador;

    private Boolean apartamentoDisponivel = true;

}
