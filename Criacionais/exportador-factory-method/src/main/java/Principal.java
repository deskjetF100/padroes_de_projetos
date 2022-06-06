import com.euwande.exportador.Coluna;
import com.euwande.exportador.ExportadorListaProduto;
import com.euwande.exportador.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe principal que executa a aplicação Exportador Factory Method.
 * @author Wandé Yan Pereira Martins Leite
 */
public class Principal {
    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", "LG", "132-A", 120, 2899.99));
        produtos.add(new Produto("Notebook", "Asus", "New age", 341, 4999.99));
        produtos.add(new Produto("Smartphone", "Samsung", "Galaxy S10", 214,1000.00));

        var exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        exportadorPadrao.addNewColuna(Principal::getPrecoComDesconto, "Preço com Desconto");
        System.out.println(exportadorPadrao.exportar(produtos));

        var exportadorMarkdown = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        exportadorMarkdown.addNewColuna(Principal::getPrecoComDesconto, "Preço com Desconto");
        System.out.println(exportadorMarkdown.exportar(produtos));

        var exportadorCSV = ExportadorListaProduto.newInstance("csv");
        System.out.println("Lista de Produtos em comma-separated values (CSV)\n");
        exportadorCSV.addNewColuna(Principal::getPrecoComDesconto, "Preço com Desconto");
        System.out.println(exportadorCSV.exportar(produtos));
    }

    private static double getPrecoComDesconto(Produto produto){
        return produto.getPreco() * 0.9;
    }
}
