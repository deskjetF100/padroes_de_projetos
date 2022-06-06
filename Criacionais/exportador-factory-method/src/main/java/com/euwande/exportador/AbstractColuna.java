package com.euwande.exportador;

import java.util.function.Function;

        /**
        * @author Wandé Yan Pereira Martins Leite
        */

public abstract class AbstractColuna implements Coluna {
    private Function<Produto, Object> obterValorColuna;
    private String titulo;
    private boolean isLasCol;

    public AbstractColuna(Function<Produto, Object> obterValorColuna, String titulo) {
        this.obterValorColuna = obterValorColuna;
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo() {
        this.titulo = titulo;
    }

    @Override
    public String exportadorCabecalho() {
        return abrir() + titulo + fechar();
    }

    @Override
    public String exportadorDados(Produto produto) {
        Object retorno = obterValorColuna.apply(produto);
        return abrir() + retorno.toString() + fechar();
    }

    @Override
    public boolean isLastCol() {
        return isLasCol;
    }

    @Override
    public void setIsLastCol(boolean isLastCol) {
        this.isLasCol = isLastCol;
    }
}
