package com.example.singletoncomjavafx.view;

import com.example.singletoncomjavafx.HelloApplication;
import com.example.singletoncomjavafx.main.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class ConfigScene extends AbstractScene {
    private final Config config = Config.getInstance();
    public ConfigScene(HelloApplication helloApplication) {
        super(helloApplication);

        var label1 = new Label("Formato de Relatório: ");
        var fieldFormatoRelatorio = new TextField(config.getFormatoRelatorios());
        var label2 = new Label("Tipo de Gráfico: ");
        var fieldTipoGrafico = new TextField(config.getTiposGraficos());
        var btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatoRelatorio, label2, fieldTipoGrafico, btnOk));

        btnOk.setOnAction(evento -> {
            config.setFormatoRelatorios(fieldFormatoRelatorio.getText());
            config.setTiposGraficos(fieldTipoGrafico.getText());
            helloApplication.setScene(new MainScene(helloApplication));
        });
    }
}
