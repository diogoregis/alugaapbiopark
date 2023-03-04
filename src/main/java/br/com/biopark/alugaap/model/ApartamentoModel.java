package br.com.biopark.alugaap.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ApartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private EdificioModel idEdificio;

    @ManyToOne
    private LocadorModel idLocador;

    private Boolean apartamentoDisponivel;

}
