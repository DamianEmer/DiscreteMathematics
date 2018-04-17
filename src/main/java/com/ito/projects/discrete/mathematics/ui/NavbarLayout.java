package com.ito.projects.discrete.mathematics.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NavbarLayout {

    private Stage primaryStage;

    private AnchorPane anchorPane;

    private NavbarLayout(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RootLayout.class.getResource("NavbarLayout.fxml"));
        anchorPane = (AnchorPane) loader.load();

        primaryStage.setScene(new Scene(anchorPane));
        primaryStage.show();
    }

    public static NavbarLayout getNavbarLayout(Stage primaryStage) throws IOException {
        return new NavbarLayout(primaryStage);
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }
}
