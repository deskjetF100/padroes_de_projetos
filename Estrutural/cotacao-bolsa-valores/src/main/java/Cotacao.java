import java.time.LocalDate;

public class Cotacao{
    String codEmpresa;
    LocalDate data = LocalDate.now();
    double preco;
    String moeda = "R$";

    public Cotacao() {
        this.codEmpresa = "";
    }
    public Cotacao(String codEmpresa, double preco) {
        this.codEmpresa = codEmpresa;
        this.preco = preco;
    }


    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    @Override
    public String toString() {
        return "Cotacao{" +
                "codEmpresa='" + codEmpresa + '\'' +
                ", data=" + data +
                ", preco=" + preco +
                ", moeda='" + moeda + '\'' +
                '}';
    }
}
