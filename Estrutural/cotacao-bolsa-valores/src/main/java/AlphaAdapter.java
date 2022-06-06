import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;

import java.time.format.DateTimeFormatter;

public class AlphaAdapter implements ServicoCotacao{
    @Override
    public Cotacao getCotacao(String codEmpresa) {
         /*
        Verifica se existe uma variável de ambiente para a chave da API do serviço Alpha Vantage.
        Você pode se cadastrar e obter uma chave em http://www.alphavantage.co
        */
        final String s = System.getenv("ALPHAVANTAGE_APIKEY");
        final String apiKey = s == null ? "50M3AP1K3Y" : s;
        final int timeout = 3000;
        var apiConnector = new AlphaVantageConnector(apiKey, timeout);

        //Permite obter a cotação (quotes) de ações (stocks).
        var stockQuotes = new StockQuotes(apiConnector);

        try {
            var response = stockQuotes.quote(codEmpresa);
            var stock = response.getStockQuote();
            var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            var cotacao = new Cotacao(codEmpresa, stock.getPrice());
            cotacao.setData(stock.getLatestTradingDay());
            return cotacao;
        } catch (AlphaVantageException e) {
            System.out.println("Erro ao solicitar cotação da empresa " + codEmpresa + ": " + e.getMessage());
        }
        return new Cotacao();
    }
}
