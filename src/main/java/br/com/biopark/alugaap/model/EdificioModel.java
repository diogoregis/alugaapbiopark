package br.com.biopark.alugaap.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EdificioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String descricaoEdificio;
}