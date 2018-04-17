package com.ito.projects.discrete.mathematics;

import com.ito.projects.discrete.mathematics.ui.NavbarLayout;
import com.ito.projects.discrete.mathematics.ui.RootLayout;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Tutorial de Sistemas Numericos");

        try {
            RootLayout.getRootLayout(primaryStage).setNavbar(NavbarLayout.getNavbarLayout(primaryStage).getAnchorPane());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String a[]) {
        launch(a);
    }
}
