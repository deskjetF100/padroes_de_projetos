import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //neste caso é criado um scanner para solicitar ao usuário qual comportamento desejado para processar os dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, informe o Banco:");
        System.out.println("1 - Banco do Brasil");
        System.out.println("2 - Banco Bradesco");
        int opcao;
        opcao = leitor.nextInt();

        String nomeArquivo = "";
        ProcessarBoleto processador = new ProcessarBoleto(null);
        if (opcao == 1){
            processador.setLeituraRetorno(LeituraRetorno::lerArquivoBancoBrasil);
            nomeArquivo = "arquivoBancoBrasil.txt";
        }else if (opcao == 2){
            processador.setLeituraRetorno(LeituraRetorno::lerArquivoBancoBradesco);
            nomeArquivo = "arquivoBancoBradesco.txt";
        }else{
            System.out.println("Opção inválida! programa encerrado.");
            System.exit(0);
        }

        String caminhoArquivo = "";
        try {
            URI uri = Principal.class.getResource(nomeArquivo).toURI();
            caminhoArquivo = Paths.get(uri).toString();
            System.out.println("Caminho do Arquivo--> "+caminhoArquivo);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        processador.processar(caminhoArquivo);

        System.out.println("\nProcesso Finalizado!");

    }
}