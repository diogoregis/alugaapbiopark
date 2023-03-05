package br.com.biopark.alugaap.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class AluguelModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aluguel_sequence")
    @SequenceGenerator(name="aluguel_sequence", sequenceName="alu_seq")
    private Long id;

    @ManyToOne
    private EdificioModel edificio;

    @ManyToOne
    private ApartamentoModel apartamento;

    @ManyToOne
    private LocatarioModel locatario;

    private LocalDate dataInicioContrato = LocalDate.now();
    private LocalDate dataEncerramentoContrato;
    private Double valorAluguel;
    private Boolean contratoAtivo = true;



}
