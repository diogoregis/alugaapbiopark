package br.com.biopark.alugaap.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class LocadorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeLocador;

}
