package com.wandeyan.modelo;

import java.time.LocalDate;

public class Produto {

    private Produto(String titulo, String descricao, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria, Vendedor vendedor) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setDataCadastro(dataCadastro);
        this.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        this.setCategoria(categoria);
        this.setVendedor(vendedor);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", dataCadastro=" + dataCadastro +
                ", dataUltimaAtualizacao=" + dataUltimaAtualizacao +
                ", urlFoto='" + urlFoto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", vendedor=" + vendedor +
                ", peso=" + peso +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }

    public Produto(long id, String titulo, String descricao, String marca, String modelo, int estoque, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String urlFoto, String categoria, Vendedor vendedor, double peso, double altura, double largura, double profundidade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.urlFoto = urlFoto;
        this.categoria = categoria;
        this.vendedor = vendedor;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    long id;
    String titulo;
    String descricao;
    String marca;
    String modelo;
    int estoque;
    double preco;
    LocalDate dataCadastro;
    LocalDate dataUltimaAtualizacao;
    String urlFoto;
    String categoria;
    Vendedor vendedor;
    double peso;
    double altura;
    double largura;
    double profundidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O campo Titulo é obrigatorio");
        }
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("O campo Descrição é obrigatorio");
        }
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (marca == null && modelo != null) {
            throw new IllegalArgumentException("Para inserir o modelo é preciso inserir uma marca primeiro.");
        }
        this.modelo = modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O campo preço é obrigatorio e deve ser maior que 0");
        }
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        if (dataCadastro == null) {
            throw new IllegalArgumentException("O campo Data Cadastro é obrigatorio");
        }
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        if (dataUltimaAtualizacao == null) {
            throw new IllegalArgumentException("O campo Data Ultima Atualização é obrigatorio");
        }
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isEmpty()) {
            throw new IllegalArgumentException("O campo categoria é obrigatorio");
        }
        this.categoria = categoria;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        if (vendedor == null) {
            throw new IllegalArgumentException("O campo Vendedor é obrigatorio");
        }
        this.vendedor = vendedor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        long id;
        String titulo;
        String descricao;
        String marca;
        String modelo;
        int estoque;
        double preco;
        LocalDate dataCadastro;
        LocalDate dataUltimaAtualizacao;
        String urlFoto;
        String categoria;
        Vendedor vendedor;
        double peso;
        double altura;
        double largura;
        double profundidade;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setEstoque(int estoque) {
            this.estoque = estoque;
            return this;
        }

        public Builder setPreco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder setDataCadastro(LocalDate dataCadastro) {
            this.dataCadastro = dataCadastro;
            return this;
        }

        public Builder setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
            this.dataUltimaAtualizacao = dataUltimaAtualizacao;
            return this;
        }

        public Builder setUrlFoto(String urlFoto) {
            this.urlFoto = urlFoto;
            return this;
        }

        public Builder setCategoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public Builder setVendedor(Vendedor vendedor) {
            this.vendedor = vendedor;
            return this;
        }

        public Builder setPeso(double peso) {
            this.peso = peso;
            return this;
        }

        public Builder setAltura(double altura) {
            this.altura = altura;
            return this;
        }

        public Builder setLargura(double largura) {
            this.largura = largura;
            return this;
        }

        public Builder setProfundidade(double profundidade) {
            this.profundidade = profundidade;
            return this;
        }

        public Produto build() {
            Produto produto = new Produto(titulo, descricao, preco, dataCadastro, dataUltimaAtualizacao, categoria, vendedor);
            produto.setId(id);
            produto.setMarca(marca);
            produto.setModelo(modelo);
            produto.setEstoque(estoque);
            produto.setUrlFoto(urlFoto);
            produto.setPeso(peso);
            produto.setAltura(altura);
            produto.setLargura(largura);
            produto.setProfundidade(profundidade);
            return produto;
        }
    }
}
