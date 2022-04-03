import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class ProcessarBoleto {

    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public ProcessarBoleto() {
    }

    public final void processar(String caminhoArquivo) {
        System.out.println("Boletos");
        System.out.println("-----------------------------------------------------------------");
        List<Boleto> listaBoletosProcessados;
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(caminhoArquivo));
            listaBoletosProcessados = new ArrayList<>();
            String line;
            while((line = reader.readLine()) != null){
                String[] vetorDados = line.split(";");
                listaBoletosProcessados.add(processarLinhaArquivo(vetorDados));
            }
            for(Boleto boleto : listaBoletosProcessados){
                System.out.println(boleto);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    abstract Boleto processarLinhaArquivo(String[] vetor);
}
