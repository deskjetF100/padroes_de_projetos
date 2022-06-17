
import com.wandeyan.modelo.Produto;
import com.wandeyan.modelo.Vendedor;

import java.time.LocalDate;

/**
 * Classe principal que inicializa o sistema
 * e mostra como instanciar {@link Produto}s usando
 * o padrão Builder implementado pela inner class {@link Produto.Builder}.
 *
 * @author WANDE YAN PEREIRA MARTINS LEITE
 */
public class Principal {
    public static void main(String[] args) {
        Produto produto = Produto.newBuilder().setTitulo("Tv de led").
                setDescricao("tv muito boa").
                setPreco(2000).
                setMarca("LG").
                setModelo("Full power").
                setDataCadastro(LocalDate.now()).
                setDataUltimaAtualizacao(LocalDate.now()).
                setCategoria("Eletronico").
                setVendedor(new Vendedor()).build();
        System.out.println(produto.toString());
    }
}
