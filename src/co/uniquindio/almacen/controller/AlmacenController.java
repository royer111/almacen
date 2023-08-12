package co.uniquindio.almacen.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class AlmacenController implements Initializable{

	private Stage stage;

	public void setStage(Stage primaryStage) {
		this.stage = primaryStage;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> lista = FXCollections.observableArrayList("Cliente juridico", "Cliente natural");
		tipoCliente.setItems(lista);

	}

}
