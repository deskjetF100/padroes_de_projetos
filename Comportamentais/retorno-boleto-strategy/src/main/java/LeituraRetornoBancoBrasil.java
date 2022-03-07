import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBancoBrasil implements LeituraRetorno{
    //classe que lê e retorna os dados processados do banco do brasil;
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
                boleto.setDataVencimento(LocalDate.parse(vetor[2], FORMATO_DATA));
                boleto.setDataPagamento(LocalDate.parse(vetor[3], FORMATO_DATA).atTime(0,0,0));
                boleto.setCpfCliente(vetor[4]);
                boleto.setValor(Double.parseDouble(vetor[5]));
                boleto.setMulta(Double.parseDouble(vetor[6]));
                boleto.setJuros(Double.parseDouble(vetor[7]));

                listaBoletosProcessados.add(boleto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Dados do Banco do Brasil processados!");
        return listaBoletosProcessados;
    }
}
