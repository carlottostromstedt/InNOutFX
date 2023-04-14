package com.example.innoutfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InNOutApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InNOutApplication.class.getResource("view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        scene.getStylesheets().add("application.css");
        stage.setTitle("Carls Burger Joint");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}