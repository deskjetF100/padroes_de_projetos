import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProcessarBoleto {

    //Esta é a classe estratégica segundo o padrão strategy;

    protected LeituraRetorno leituraRetorno;

    public ProcessarBoleto(LeituraRetorno tipoRetornoBanco){
        leituraRetorno = tipoRetornoBanco;
    }

    public final void processar(String caminhoArquivo){
        System.out.println("Boletos");
        System.out.println("-----------------------------------------------------------------");
        List<Boleto>listaBoletosProcessados;
        try{
            BufferedReader reader = Files.newBufferedReader(Paths.get(caminhoArquivo));
            String line;
            listaBoletosProcessados = new ArrayList<>();
            while((line = reader.readLine()) != null){
                String[] vetor = line.split(";");
                listaBoletosProcessados.add(leituraRetorno.processarLinhaArquivo(vetor));
            }
            for(Boleto boleto : listaBoletosProcessados){
                System.out.println(boleto);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
