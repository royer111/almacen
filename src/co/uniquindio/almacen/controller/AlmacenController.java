package co.uniquindio.almacen.controller;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import co.uniquindio.almacen.model.PaisOrigen;
import co.uniquindio.almacen.model.Persona;
import co.uniquindio.almacen.model.PersonaClienteJuridico;
import co.uniquindio.almacen.model.PersonaClienteNatural;
import co.uniquindio.almacen.model.Producto;
import co.uniquindio.almacen.model.ProductoEnvasado;
import co.uniquindio.almacen.model.ProductoPerecedero;
import co.uniquindio.almacen.model.ProductoRefrigerado;
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
	    private ComboBox<String> comboPaisOrigen;

	    @FXML
	    private ComboBox<String> comboTipoCliente;

	    @FXML
	    private ComboBox<String> comboTipoProducto;

	    @FXML
	    private TableColumn<Persona, String> columnaApellidos;


	    @FXML
	    private TableColumn<Persona, String> columnaIdentificacion;

	    @FXML
	    private TableColumn<Persona, String> columnaNit;

	    @FXML
	    private TableColumn<Persona, String> columnaNombre;

	    @FXML
	    private TableColumn<Persona, String> columnaTelefono;

	    @FXML
	    private TableColumn<Producto, Integer> columnaCantidadExistencia;

	    @FXML
	    private TableColumn<Producto, Double> columnaValorUnitario;

	    @FXML
	    private TableColumn<Producto, String> columnaProducto;

	    @FXML
	    private TableView<Persona> tableClientes;


	    @FXML
	    private TableView<Producto> tablaProductos;

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
	    		fieldEmail.setDisable(false);
	    		fieldNacimiento.setDisable(false);;
	    		fieldNit.setDisable(true);

	    	}
	    	else if(comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente juridico")){
	    		fieldEmail.setDisable(true);
	    		fieldNacimiento.setDisable(true);
	    		fieldNit.setDisable(false);
	    	}
	    }

		List<PersonaClienteNatural> listaPersonasNaturales = new ArrayList<>();
		List<PersonaClienteJuridico> listaPersonasJuridicos = new ArrayList<>();
		ObservableList<Persona> listadoPersonas = FXCollections.observableArrayList();


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
	    		listadoPersonas.add(personaNatural);
	    		tableClientes.setItems(listadoPersonas);
	    		fieldNombre.setText("");
	    		fieldApellidos.setText("");
	    		fieldIdentificacion.setText("");
	    		fieldDireccion.setText("");
	    		fieldTelefono.setText("");
	    		fieldNacimiento.setText("");
	    		fieldEmail.setText("");
	    		tableClientes.refresh();
	    		JOptionPane.showMessageDialog(null, personaNatural.getNombres() + personaNatural.getApellidos() + personaNatural.getIdentificacion());

	    	}
	    	else if (comboTipoCliente.getSelectionModel().getSelectedItem().equals("Cliente juridico")){
	    		personaJuridica = mfm.crearPersonaJuridico(nombre, apellidos, id, direccion, telefono, nit);
	    	    listadoPersonas.add(personaJuridica);
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


	    public PaisOrigen elegirPais (){
	    	PaisOrigen paisOrigen = null;
	    	if(comboPaisOrigen.getSelectionModel().getSelectedItem().equals("Colombia")){
	    		paisOrigen = PaisOrigen.COLOMBIA;
	    	}

	    	else if(comboPaisOrigen.getSelectionModel().getSelectedItem().equals("Chile")){
	    		paisOrigen = PaisOrigen.CHILE;
	    	}

	    	else if(comboPaisOrigen.getSelectionModel().getSelectedItem().equals("Peru")){
	    		paisOrigen = PaisOrigen.PERU;
	    	}
	    	else if(comboPaisOrigen.getSelectionModel().getSelectedItem().equals("Ecuador")){
	    		paisOrigen = PaisOrigen.ECUADOR;
	    	}

	    	else if(comboPaisOrigen.getSelectionModel().getSelectedItem().equals("Argentina")){
	    		paisOrigen = PaisOrigen.ARGENTINA;
	    	}
	    	return paisOrigen;
	    }

		ObservableList<Producto> listadoProductos = FXCollections.observableArrayList();

	    @FXML
	    void guardarEvent(ActionEvent event) {
	    	PaisOrigen pais = elegirPais();
	    	String producto = fieldProducto.getText();
	    	double valorUnitario = Double.parseDouble(fieldValorUnitario.getText());
	    	int cantidadExistencia = Integer.parseInt(fieldCantidadExistencia.getText());
	    	String descripcion = fieldDescripcion.getText();
	    	String codigoAprobacion = fieldCodigoAprobacion.getText();
	    	String temperatura = fieldTemperaturaRecomendada.getText();
	    	String fechaEnvasado = fieldFechaEnvasado.getText();
	    	String fechaVencimiento = fieldFechaVencimiento.getText();
	    	String pesoEnvase = fieldPesoEnvase.getText();
	    	ProductoEnvasado productoEnvasado = null;
	    	ProductoPerecedero productoPerecedero = null;
	    	ProductoRefrigerado productoRefrigerado = null;
	    	if(comboTipoProducto.getSelectionModel().getSelectedItem().equals("Envasado")){
	    		productoEnvasado = mfm.crearProductoEnvasado(producto, descripcion, valorUnitario, cantidadExistencia, fechaEnvasado, pesoEnvase, pais);
	    		listadoProductos.add(productoEnvasado);
	    	}

	    	else if (comboTipoProducto.getSelectionModel().getSelectedItem().equals("Perecedero"))
	    	{
	    		productoPerecedero = mfm.crearProductoPerecedero(producto, descripcion, valorUnitario, cantidadExistencia, fechaVencimiento);
	    		listadoProductos.add(productoPerecedero);
	    	}
	    	else if (comboTipoProducto.getSelectionModel().getSelectedItem().equals("Refrigerado")){
	    		productoRefrigerado = mfm.crearProductoRefrigerado (producto, descripcion, valorUnitario, cantidadExistencia, codigoAprobacion, temperatura);
	    		listadoProductos.add(productoRefrigerado);
	    	}

	    	tablaProductos.setItems(listadoProductos);
	    	tablaProductos.refresh();

	    }

	    @FXML
	    void habilitarProductosEvent(ActionEvent event) {
	    	if(comboTipoProducto.getSelectionModel().getSelectedItem().equals("Envasado")){
	    		fieldFechaEnvasado.setDisable(false);
	    		fieldPesoEnvase.setDisable(false);
	    		comboPaisOrigen.setDisable(false);
	    		fieldFechaVencimiento.setDisable(true);
	    		fieldCodigoAprobacion.setDisable(true);
	    		fieldTemperaturaRecomendada.setDisable(true);

	    	}
	    	else if (comboTipoProducto.getSelectionModel().getSelectedItem().equals("Perecedero")){
	    		fieldFechaVencimiento.setDisable(false);
	    		fieldFechaEnvasado.setDisable(true);
	    		fieldPesoEnvase.setDisable(true);
	    		comboPaisOrigen.setDisable(true);
	    		comboPaisOrigen.setDisable(true);

	    	}

	    	else if (comboTipoProducto.getSelectionModel().getSelectedItem().equals("Refrigerado")){
	    		fieldFechaVencimiento.setDisable(true);
	    		fieldFechaEnvasado.setDisable(true);
	    		fieldPesoEnvase.setDisable(true);
	    		comboPaisOrigen.setDisable(true);
	    		fieldCodigoAprobacion.setDisable(false);
	    		fieldTemperaturaRecomendada.setDisable(false);
	    		comboPaisOrigen.setDisable(true);

	    	}
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			ObservableList<String> lista = FXCollections.observableArrayList("Cliente juridico", "Cliente natural");
			ObservableList<String> listaPaises = FXCollections.observableArrayList("Colombia", "Argentina", "Chile", "Ecuador", "Peru");
			ObservableList<String> listaProductos = FXCollections.observableArrayList("Envasado", "Perecedero", "Refrigerado");
			this.columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombres"));
			this.columnaApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
			this.columnaIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
			this.columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
			this.columnaNit.setCellValueFactory(new PropertyValueFactory<>("nit"));
			this.columnaProducto.setCellValueFactory(new PropertyValueFactory<>("nombre"));
			this.columnaValorUnitario.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
			this.columnaCantidadExistencia.setCellValueFactory(new PropertyValueFactory<>("cantidaExistencia"));
			comboTipoCliente.setItems(lista);
			comboPaisOrigen.setItems(listaPaises);
			comboTipoProducto.setItems(listaProductos);
			fieldNacimiento.setDisable(true);;
			fieldEmail.setDisable(true);
			fieldNit.setDisable(true);
			fieldFechaEnvasado.setDisable(true);
    		fieldPesoEnvase.setDisable(true);
    		comboPaisOrigen.setDisable(true);
    		fieldFechaVencimiento.setDisable(true);
    		fieldCodigoAprobacion.setDisable(true);
    		fieldTemperaturaRecomendada.setDisable(true);


		}

}
