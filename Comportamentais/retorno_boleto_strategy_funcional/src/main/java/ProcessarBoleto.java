import java.util.List;
import java.util.function.Function;

public class ProcessarBoleto {

    //Esta é a classe estratégica segundo o padrão strategy;

    //Declarando um variável para armazenar uma função
    private Function<String, List<Boleto>> leituraRetorno;

    //Recebendo o comportamento/método desejado para processar os dados do arquivo informado na classe principal "processador.processar(nomeArquivo) -> Classe Princiral linha 39"
    public ProcessarBoleto(Function<String, List<Boleto>> tipoRetornoBanco){
        leituraRetorno = tipoRetornoBanco;
    }

    //Método para redefinir o comportamento de leitura de arquivos de diferentes bancos mesmo em tempo de execução
    public void setLeituraRetorno(Function<String, List<Boleto>> tipoRetornoBanco){
        leituraRetorno = tipoRetornoBanco;
    }

    public final void processar(String dados){
        System.out.println("Boletos");
        System.out.println("-----------------------------------------------------------------");
        List<Boleto> listaBoletos = leituraRetorno.apply(dados);
        for(Boleto boleto : listaBoletos){
            System.out.println(boleto);
        }
    }
}
