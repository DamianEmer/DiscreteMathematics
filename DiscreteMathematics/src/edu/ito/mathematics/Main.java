package edu.ito.mathematics;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private static BorderPane mainLayout;
	private static BorderPane contentLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Matematicas Discretas");
		showMainView();
	}

	// Carga de la vista principal
	private void showMainView() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/MainView.fxml"));
			mainLayout = loader.load();// Cargando diseño al panel principal
			// Panel de vistas
			FXMLLoader loaderContent = new FXMLLoader(Main.class.getResource("view/contentView.fxml"));
			contentLayout = loaderContent.load();
			mainLayout.setCenter(contentLayout);// Se carga panel al panel principal de la apliacion
			Scene scene = new Scene(mainLayout);// Cargando panel principal a la escena
			scene.getStylesheets().add(getClass().getResource("view/MainStyle.css").toExternalForm());// Añadiendo hoja
																										// de
																										// estilo
			primaryStage.setScene(scene);// Se carga escene en el escenario primario
			primaryStage.show();// Se muestra el escenerio (Ventana)
		} catch (IOException e) {
			e.printStackTrace();// Tratamiendo del metodo load()
		}
	}

	// Metodo encargado de cargar la nueva vista (Temario)
	public static void changueTemary() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/TemaryView.fxml"));// Carga diseño fxml
			BorderPane content = loader.load();// Carga del diseño en el panel que trabajaremos
			contentLayout.setCenter(content);// incluimos el panel en el panel de vistas
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// Metodo que regresa a la vista principal
	public static void backHome() {
		try {
			FXMLLoader loaderContent = new FXMLLoader(Main.class.getResource("view/contentView.fxml"));
			contentLayout = loaderContent.load();
			mainLayout.setCenter(contentLayout);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
