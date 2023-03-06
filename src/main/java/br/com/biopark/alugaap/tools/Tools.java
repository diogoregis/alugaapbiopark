package br.com.biopark.alugaap.tools;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Tools {

    static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
    public static String precoFormata(double preco){
        return Tools.nf.format(preco);
    }

}
