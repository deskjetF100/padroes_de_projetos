package com.example.singletoncomjavafx.main;

public class Config {
    private static final Config instance = new Config();

    private Config(){}
    private String formatoRelatorios = "pdf";
    private String tiposGraficos = "pizza";

    public static Config getInstance(){
        return instance;
    }

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    public String getTiposGraficos() {
        return tiposGraficos;
    }

    public void setTiposGraficos(String tiposGraficos) {
        this.tiposGraficos = tiposGraficos;
    }
}
