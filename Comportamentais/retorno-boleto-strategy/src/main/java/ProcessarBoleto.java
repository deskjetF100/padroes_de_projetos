import java.util.List;

public class ProcessarBoleto {

    //Esta é a classe estratégica segundo o padrão strategy;

    private LeituraRetorno leituraRetorno;

    public ProcessarBoleto(LeituraRetorno tipoRetornoBanco){
        leituraRetorno = tipoRetornoBanco;
    }
    public final void processar(String dados){
        System.out.println("Boletos");
        System.out.println("-----------------------------------------------------------------");
        List<Boleto> listaBoletos = leituraRetorno.lerArquivo(dados);
        for(Boleto boleto : listaBoletos){
            System.out.println(boleto);
        }
    }
}
