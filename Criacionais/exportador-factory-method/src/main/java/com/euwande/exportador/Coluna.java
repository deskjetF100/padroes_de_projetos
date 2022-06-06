package com.euwande.exportador;

/**
 * @author Wandé Yan Pereira Martins Leite
 */

public interface Coluna {
    String getTitulo();
    void setTitulo();
    String abrir();
    String fechar();
    String exportadorCabecalho();
    String exportadorDados(Produto produto);

    boolean isLastCol();

    void setIsLastCol(boolean isLastCol);
}
