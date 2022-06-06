package com.euwande.exportador;

import java.util.function.Function;

/**
 * @author Wandé Yan Pereira Martins Leite
 */

public class ColunaHTML extends AbstractColuna {
    ColunaHTML(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }

}
