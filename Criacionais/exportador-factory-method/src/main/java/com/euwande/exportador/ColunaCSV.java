package com.euwande.exportador;

import java.util.function.Function;

/**
 * @author Wandé Yan Pereira Martins Leite
 */

public class ColunaCSV extends AbstractColuna{
    public ColunaCSV(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "";
    }

    @Override
    public String fechar() {
        return isLastCol() ? "" : ",";
    }
}
