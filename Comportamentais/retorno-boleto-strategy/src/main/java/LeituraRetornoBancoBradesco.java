import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBancoBradesco implements LeituraRetorno{
    //classe que lê e retorna os dados processados do banco bradesco;
    @Override
    public List<Boleto> lerArquivo(String caminhoArquivo) {
        List<Boleto> listaBoletosProcessados = null;
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(caminhoArquivo));
            String line;
            listaBoletosProcessados = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] vetor = line.split(";");
                Boleto boleto = new Boleto();
                boleto.setId(Integer.parseInt(vetor[0]));
                boleto.setCodBanco(vetor[1]);
                boleto.setAgencia(vetor[2]);
                boleto.setContaBancaria(vetor[3]);
                boleto.setDataVencimento(LocalDate.parse(vetor[4], FORMATO_DATA));
                boleto.setDataPagamento(LocalDateTime.parse(vetor[5], FORMATO_DATA_HORA));
                boleto.setCpfCliente(vetor[6]);
                boleto.setValor(Double.parseDouble(vetor[7]));
                boleto.setMulta(Double.parseDouble(vetor[8]));
                boleto.setJuros(Double.parseDouble(vetor[9]));

                listaBoletosProcessados.add(boleto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Dados do Banco do Bradesco processados!");
        return listaBoletosProcessados;
    }
}
