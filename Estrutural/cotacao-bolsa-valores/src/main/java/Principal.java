//Quandl
import com.jimmoores.quandl.*;
import com.jimmoores.quandl.classic.ClassicQuandlSession;

//YahooFinance
import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;
import io.github.mainstringargs.alphavantagescraper.output.quote.StockQuotesResponse;
import io.github.mainstringargs.alphavantagescraper.output.quote.data.StockQuote;
import io.github.mainstringargs.yahooFinance.*;
import io.github.mainstringargs.yahooFinance.domain.FinancialData;

//AlphaVantage


import java.time.format.DateTimeFormatter;

/**
 * Classe principal que mostra como obter a cotação de empresas da bolsa de valores
 * utilizando 3 serviços diferentes: Yahoo Finance, AlphaVantage e Quandl.
 * Os métodos implementados tem o código para utilizar as bibliotecas
 * que implementam o acesso a tais serviços.
 * Mas como podem ver, o código dos 3 métodos é totalmente diferente um do outro.
 * Ou seja, a forma de usar cada uma das bibliotecas é diferente.
 * Por isso, é preciso criar um adapter para padronizar a utilização das bibliotecas
 * e permitir trocar uma pela outra sem alterar o código do projeto.
 *
 * <p>
 * Observe que os métodos {@link #cotacaoUsandoYahooFinance(String)},
 * {@link #cotacaoUsandoAlphaVantage(String)} e
 * {@link #cotacaoUsandoQuandl(String)} não estão retornando nada, pois
 * isto é apenas um exemplo.
 * Se formos usar esta implementação em uma aplicação com interface gráfica (e não console),
 * o usuário não vai ver os prints inseridos.
 * Por isso neste caso, os método pra serem úteis para qualquer tipo de app (web, mobile, desktop, console, etc),
 * precisam retornar algum dado. Se tivermos uma app web, por exemplo, podemos então pegar estes dados e exibir
 * em uma página HTML.
 * Como você irá remodelar o código para aplicar o projeto, você precisa fazer estas alterações.
 * </p>
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println();

        /**
         * Acessa a cotação de uma determinada empresa utilizando o serviço do <a href="https://finance.yahoo.com">Yahoo Finance</a>
         * por meio da biblioteca <a href="https://github.com/mainstringargs/yahoo-finance-scraper">Yahoo Finance Scrapper</a>.
         * @param codigoEmpresa
         * @see <a href="http://meumobi.github.io/stocks%20apis/2016/03/13/get-realtime-stock-quotes-yahoo-finance-api.html">Get realtime stock quotes yahoo finance API</a>
         */
        //No Yahoo Finance, as empresas brasileiras terminam com ".sa"
        ServicoCotacao servico = new YahooAdapter();
        var cotacao = servico.getCotacao("MGLU3.sa"); //MGLU.sa = Magazine Luiza (.se é um sufixo para identificar embresas brasileira)
        System.out.println(cotacao.toString());

        /**
         * Acessa a cotação de uma determinada empresa utilizando o serviço do <a href="https://www.quandl.com">Quandl</a>
         * por meio da biblioteca <a href="http://quandl4j.org">quandl4j</a>.
         * @param codigoEmpresa
         */
        servico = new QuandlAdapter();
        var cotacao2 = servico.getCotacao("WIKI/AAPL"); //AAPL = Apple
        System.out.println(cotacao2.toString());
        /**
         * Acessa a cotação de uma determinada empresa utilizando o serviço do <a href="https://www.alphavantage.co">AlphaVantage</a>
         * por meio da biblioteca <a href="https://github.com/mainstringargs/alpha-vantage-scraper">AlphaVantage Scrapper</a>.
         * @param codigoEmpresa
         */

        servico = new AlphaAdapter();
        var cotacao3 = servico.getCotacao("INTL");
        System.out.println(cotacao3.toString());
    }




}
