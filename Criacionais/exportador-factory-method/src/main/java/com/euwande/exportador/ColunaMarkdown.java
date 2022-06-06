package com.euwande.exportador;

import java.util.function.Function;

/**
 * @author Wandé Yan Pereira Martins Leite
 */

class ColunaMarkdown extends AbstractColuna{
    public ColunaMarkdown(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return " | ";
    }

    @Override
    public String fechar() {
        return "";
    }
}
