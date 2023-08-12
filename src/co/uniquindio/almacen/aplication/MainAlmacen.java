package co.uniquindio.almacen.aplication;

import co.uniquindio.almacen.controller.AlmacenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAlmacen extends Application{
	@Override
	public void start(Stage primaryStage)   {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/concesionario/views/LogConcesionario.fxml"));
			Parent root = loader.load();
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
			AlmacenController almacenController = loader.getController();
			almacenController.setStage(primaryStage);
	        primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main (String args[])   {
		launch(args);
	}
}
