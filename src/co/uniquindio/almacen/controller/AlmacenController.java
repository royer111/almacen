package co.uniquindio.almacen.controller;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import co.uniquindio.almacen.model.PersonaClienteJuridico;
import co.uniquindio.almacen.model.PersonaClienteNatural;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

public class AlmacenController implements Initializable{

	ModelFactoryController mfm = ModelFactoryController.getInstance();
	private Stage stage;

	public void setStage(Stage primaryStage) {
		this.stage = primaryStage;
	}


	 @FXML
	    private Button btnAgregar;

	    @FXML
	    private Button btnGuardarProducto;

	    @FXML
	    private ComboBox<?> comboPaisOrigen;

	    @FXML
	    private ComboBox<String> comboTipoCliente;

	    @FXML
	    private ComboBox<String> comboTipoProducto;

	    @FXML
	    private TextField fieldApellidos;

	    @FXML
	    private TextField fieldCantidadExistencia;

	    @FXML
	    private TextField fieldCodigoAprobacion;

	    @FXML
	    private TextField fieldDescripcion;

	    @FXML
	    private TextField fieldDireccion;

	    @FXML
	    private TextField fieldEmail;

	    @FXML
	    private TextField fieldFechaEnvasado;

	    @FXML
	    private TextField fieldFechaVencimiento;

	    @FXML
	    private TextField fieldNacimiento;

	    @FXML
	    private TextField fieldNit;

	    @FXML
	    private TextField fieldNombre;

	    @FXML
	    private TextField fieldPesoEnvase;

	    @FXML
	    private TextField fieldProducto;

	    @FXML
	    private TextField fieldTelefono;

	    @FXML
	    private TextField fieldTemperaturaRecomendada;

	    @FXML

	    private TextField fieldValorUnitario;

	    @FXML
	    private TextField fieldIdentificacion;


	    @FXML
	    private Label txtApellidos;

	    @FXML
	    private Label txtDireccion;

	    @FXML
	    private Label txtEmail;

	    @FXML
	    private Label txtFechaNacimiento;

	    @FXML
	    private Label txtNit;

	    @FXML
	    private Label txtNombre;

	    @FXML
	    private Label txtTelefono;


	    @FXML
	    void esconderCamposClientesEvent(ActionEvent event) {
	    	if(comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente natural")){
	    		fieldNacimiento.setVisible(true);
				fieldEmail.setVisible(true);
				txtFechaNacimiento.setVisible(true);
				txtEmail.setVisible(true);
				txtNit.setVisible(false);
				fieldNit.setVisible(false);

	    	}
	    	else if(comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente juridico")){
	    		fieldNit.setVisible(true);
				txtNit.setVisible(true);
				fieldNacimiento.setVisible(false);
				fieldEmail.setVisible(false);
				txtFechaNacimiento.setVisible(false);
				txtEmail.setVisible(false);

	    	}
	    }

		List<PersonaClienteNatural> listaPersonasNaturales = new ArrayList<>();
		List<PersonaClienteJuridico> listaPersonasJuridicos = new ArrayList<>();

	    @FXML
	    void agregarEvent(ActionEvent event) {
	    	String nombre = fieldNombre.getText();
	    	String apellidos = fieldApellidos.getText();
	    	String direccion = fieldDireccion.getText();
	    	String telefono = fieldTelefono.getText();
	    	String nacimiento = fieldNacimiento.getText();
	    	String email = fieldEmail.getText();
	    	String id = fieldIdentificacion.getText();
	    	PersonaClienteNatural personaNatural = null;
	    	PersonaClienteJuridico personaJuridica = null;
	    	String nit = fieldNit.getText();
	    	if(comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente natural")){
	    		personaNatural = mfm.crearPersonaNatural( nombre,  apellidos,  id,  direccion,
	    				 telefono,  email,  nacimiento);
	    		listaPersonasNaturales.add(personaNatural);
	    		fieldNombre.setText("");
	    		fieldApellidos.setText("");
	    		fieldIdentificacion.setText("");
	    		fieldDireccion.setText("");
	    		fieldTelefono.setText("");
	    		fieldNacimiento.setText("");
	    		fieldEmail.setText("");
	    		JOptionPane.showMessageDialog(null, personaNatural.getNombres() + personaNatural.getApellidos() + personaNatural.getIdentificacion());

	    	}
	    	else if (comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente juridico")){
	    		personaJuridica = mfm.crearPersonaJuridico(nombre, apellidos, id, direccion, telefono, nit);
	    	    fieldNombre.setText("");
	    		fieldApellidos.setText("");
	    		fieldDireccion.setText("");
	    		fieldTelefono.setText("");
	    		fieldNit.setText("");
	    		fieldIdentificacion.setText("");
	    		listaPersonasJuridicos.add(personaJuridica);
	    		JOptionPane.showMessageDialog(null, personaJuridica.getNombres() + personaJuridica.getApellidos() + personaJuridica.getIdentificacion());

	    	}


	    }

	    @FXML
	    void guardarEvent(ActionEvent event) {
	    	String producto = fieldProducto.getText();
	    	double valroUnitario = Double.parseDouble(fieldValorUnitario.getText());

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			ObservableList<String> lista = FXCollections.observableArrayList("Cliente juridico", "Cliente natural");
			comboTipoCliente.setItems(lista);
			fieldNit.setVisible(false);
			fieldNacimiento.setVisible(false);
			fieldEmail.setVisible(false);
			txtFechaNacimiento.setVisible(false);
			txtEmail.setVisible(false);
			txtNit.setVisible(false);

		}

}
