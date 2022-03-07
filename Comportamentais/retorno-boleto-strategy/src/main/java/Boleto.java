import java.time.LocalDate;
import java.time.LocalDateTime;

public class Boleto {
    int id;
    String codBanco;
    LocalDate dataVencimento;
    LocalDateTime dataPagamento;
    String cpfCliente;
    double valor;
    double multa;
    double juros;
    String agencia;
    String contaBancaria;

    public Boleto(int id, String codBanco, LocalDate dataVencimento, LocalDateTime dataPagamento, String cpfCliente, double valor, double multa, double juros, String agencia, String contaBancaria) {
        this.id = id;
        this.codBanco = codBanco;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.cpfCliente = cpfCliente;
        this.valor = valor;
        this.multa = multa;
        this.juros = juros;
        this.agencia = agencia;
        this.contaBancaria = contaBancaria;
    }

    public Boleto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        String str = "ID: "+id+", Código Banco: "+codBanco;
        String ag = "";
        String cb = "";
        if(agencia != null && !agencia.isEmpty() && contaBancaria != null && contaBancaria != null && !contaBancaria.isEmpty()){
            ag = ", Agência:"+ agencia;
            cb = ", Conta Bancaria: "+contaBancaria;
        }
        str += ag+cb+", Data Vencimento: "+ dataVencimento+", Data Pagamento: "+dataPagamento+", CPF Cliente: "+cpfCliente+", Valor: "+valor+
        ", Multa: "+multa+", Juros: "+juros;
//        return "Boleto{" +
//                "id=" + id +
//                ", codBanco='" + codBanco + '\'' +
//                ", dataVencimento=" + dataVencimento +
//                ", dataPagamento=" + dataPagamento +
//                ", cpfCliente='" + cpfCliente + '\'' +
//                ", valor=" + valor +
//                ", multa=" + multa +
//                ", juros=" + juros +
//                ", agencia='" + agencia + '\'' +
//                ", contaBancaria='" + contaBancaria + '\'' +
//                '}';
        return str;
    }
}
