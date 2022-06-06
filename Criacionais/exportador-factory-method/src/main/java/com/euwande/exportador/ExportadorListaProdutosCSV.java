package com.euwande.exportador;

import java.util.function.Function;

/**
 * @author Wandé Yan Pereira Martins Leite
 */

public class ExportadorListaProdutosCSV extends AbstractExportadorListaProduto{
    @Override
    public void addNewColuna(Function<Produto, Object> obterValorColuna, String titulo) {
        addColuna(new ColunaCSV(obterValorColuna, titulo));
    }

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "";
    }

    @Override
    public String fecharLinha() {
        return "\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "";
    }
}
