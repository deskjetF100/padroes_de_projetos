package com.euwande.exportador;

/**
 * @author WANDÉ YAN PEREIRA MARTINS LEITE
 */

public class ExportadorListaProdutosCSV extends AbstractExportadorListaProduto{
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

    @Override
    public String abrirColuna(String valor) {
        //sempre dentro de aspas duplas, porque no formato csv, valores dentro de aspas duplas podem conter espaços em branco e continuar representando apenas um unico valor;
        return "\""+valor+"\"";
    }

    int count = 0;
    @Override
    public String fecharColuna() {
        if(count ==(TITULOS_COLUNAS.size() - 1)) {
            count=0;
            return "";
        } else{
            count++;
            return ",";
        }
    }
}
