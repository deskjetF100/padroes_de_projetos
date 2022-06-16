package com.example.singletoncomjavafx.view;

import com.example.singletoncomjavafx.HelloApplication;
import com.example.singletoncomjavafx.main.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class RelatoriosScene extends AbstractScene {

    private final Config config = Config.getInstance();
    public RelatoriosScene(HelloApplication helloApplication) {
        super(helloApplication);
        var label1 = new Label("Formato de Relatórios= "+ config.getFormatoRelatorios());
        var label2 = new Label("Tipo dos Gráficos= "+ config.getTiposGraficos());
        var btnVoltar = new Button("Voltar");
        setRoot(new VBox(label1, label2, btnVoltar));

        btnVoltar.setOnAction(evento -> helloApplication.setScene(new MainScene(helloApplication)));
    }
}
