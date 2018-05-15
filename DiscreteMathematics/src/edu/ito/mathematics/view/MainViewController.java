package edu.ito.mathematics.view;

import edu.ito.mathematics.Main;
import javafx.fxml.FXML;

public class MainViewController {

	private Main main;// Referencia a la clase Main

	// Metodos que se accionaran en caso de eventos

	@FXML
	private void goTemary() {
		main.changueTemary();// se llama al metodo cambiarTemario de la clase principal
	}

	@FXML
	private void goHome() {
		Main.backHome();
	}

}
