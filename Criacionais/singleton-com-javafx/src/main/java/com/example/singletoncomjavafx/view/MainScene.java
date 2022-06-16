package com.example.singletoncomjavafx.view;

import com.example.singletoncomjavafx.HelloApplication;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

public class MainScene extends AbstractScene {
    public MainScene(HelloApplication helloApplication) {
        super(helloApplication);
        var btnRelatorio = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorio, btnConfig));

        btnRelatorio.setOnAction(evento -> helloApplication.setScene(new RelatoriosScene(helloApplication)));
        btnConfig.setOnAction(evento -> helloApplication.setScene(new ConfigScene(helloApplication)));
    }
}
