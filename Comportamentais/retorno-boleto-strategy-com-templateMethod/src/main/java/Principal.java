import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {

        /*definindo qual classe eu desejo que processe os dados para obter o retorno ideal... para obter retorno dos
        dados processados do outro banco basta descomentar uma linha e comentar a outra;
         */
//        ProcessarBoleto processarBoleto = new ProcessarBoleto(new LeituraRetornoBancoBradesco());
        ProcessarBoleto processarBoleto = new ProcessarBoleto(new LeituraRetornoBancoBrasil());

        //pegando o caminho do arquivo para ser lido pelo método processar na classe ProcessarBoleto;
        try {
         /*caso altere a classe responsável por processar os dados no objeto processarBoleto, altere também o nome do
         arquivo referente ao seu respectivo banco (para facilitar basta também descomentar e comentar as linhas
         corretas);
          */
            URL resource = Principal.class.getResource("arquivoBancoBrasil.txt");
            Objects.requireNonNull(resource, "Não foi possivel acessar o arquivo no caminho informado.");
            URI uri = resource.toURI();
//            URI uri = Principal.class.getResource("arquivoBancoBradesco.txt").toURI();
            String caminhoArquivo = Paths.get(uri).toString();
            System.out.println("Caminho do Arquivo--> "+caminhoArquivo);

            //passando o caminho do arquivo com os dados a ser processados;
            processarBoleto.processar(caminhoArquivo);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\nProcesso Finalizado!");

    }
}