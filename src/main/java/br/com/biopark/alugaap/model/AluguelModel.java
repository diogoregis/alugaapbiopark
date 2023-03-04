package br.com.biopark.alugaap.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class AluguelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private EdificioModel edificio;

    @ManyToOne
    private ApartamentoModel apartamento;

    @ManyToOne
    private LocatarioModel locatario;

    private Double valorAluguel;
    private Boolean contratoAtivo;

}
