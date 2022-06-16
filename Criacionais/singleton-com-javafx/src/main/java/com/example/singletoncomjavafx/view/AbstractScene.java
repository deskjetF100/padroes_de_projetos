package com.example.singletoncomjavafx.view;

import com.example.singletoncomjavafx.HelloApplication;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

public abstract class AbstractScene extends Scene {

    public AbstractScene(HelloApplication helloApplication) {
        super(new TilePane(), 640, 480);
    }
}
