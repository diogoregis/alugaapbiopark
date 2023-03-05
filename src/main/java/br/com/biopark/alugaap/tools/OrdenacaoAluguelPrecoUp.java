package br.com.biopark.alugaap.tools;

import br.com.biopark.alugaap.model.AluguelModel;

import java.util.Comparator;

public class OrdenacaoAluguelPrecoUp implements Comparator<AluguelModel> {

    @Override
    public int compare(AluguelModel o1, AluguelModel o2) {
        return o1.getValorAluguel().compareTo(o2.getValorAluguel());
    }
}
