import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeituraRetorno {

    /*
        Interface responsável por definir as assinaturas dos métodos comuns entre as classes que
        processam os dados dos arquivosBancarios;
    */

    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    Boleto processarLinhaArquivo(String[] vetor);
}
