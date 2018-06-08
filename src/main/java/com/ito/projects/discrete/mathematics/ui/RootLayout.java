package com.ito.projects.discrete.mathematics.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class RootLayout {

    private Stage primaryStage;

    private Scene scene;

    private BorderPane borderPane;

    private RootLayout(@NotNull Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RootLayout.class.getResource("RootLayout.fxml"));
        borderPane = (BorderPane) loader.load();

        this.primaryStage = primaryStage;

        scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setNavbar(Node navbar) {
        borderPane.setTop(navbar);
    }

    public static RootLayout getRootLayout(Stage primaryStage) throws IOException {
        return new RootLayout(primaryStage);
    }

    public Scene getScene() {
        return scene;
    }
}
