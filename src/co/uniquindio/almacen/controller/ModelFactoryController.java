package co.uniquindio.almacen.controller;

import java.util.Date;
import java.util.List;

import co.uniquindio.almacen.model.Almacen;
import co.uniquindio.almacen.model.PaisOrigen;
import co.uniquindio.almacen.model.PersonaClienteJuridico;
import co.uniquindio.almacen.model.PersonaClienteNatural;
import co.uniquindio.almacen.model.Producto;
import co.uniquindio.almacen.model.ProductoEnvasado;
import co.uniquindio.almacen.model.ProductoPerecedero;
import co.uniquindio.almacen.model.ProductoRefrigerado;

public class ModelFactoryController {
	  Almacen almacen = null;



	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		System.out.println("invocación clase singleton");
		inicializarDatos();
	}


	private void inicializarDatos() {
		almacen = new Almacen();

}




	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}




	public PersonaClienteNatural crearPersonaNatural (String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String email, String fechaNacimiento){
		PersonaClienteNatural cliente = (almacen.agregarPersonasNaturales( nombres,  apellidos,  identificacion,  direccion,
				 telefono,  email,  fechaNacimiento));
		return cliente;
	}

	public PersonaClienteJuridico crearPersonaJuridico (String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String nit){
		PersonaClienteJuridico cliente = (almacen.agregarPersonasJuridicas( nombres,  apellidos,  identificacion,  direccion,
  				 telefono, nit));
		return cliente;
	}

	public ProductoEnvasado crearProductoEnvasado(String producto, String descripcion, double valorUnitario,
			int cantidadExistencia, String fechaEnvasado, String pesoEnvase, PaisOrigen pais) {
		ProductoEnvasado productoEnvasado = almacen.crearProductoEvasado(producto, descripcion, valorUnitario, cantidadExistencia, fechaEnvasado, pesoEnvase, pais);
		return productoEnvasado;
	}

	public ProductoPerecedero crearProductoPerecedero(String producto, String descripcion, double valorUnitario,
			int cantidadExistencia, String fechaVencimiento) {

		ProductoPerecedero productoPerecedero = almacen.crearProductoPerecedero(producto, descripcion, valorUnitario, cantidadExistencia, fechaVencimiento);
		return productoPerecedero;
	}

	public ProductoRefrigerado crearProductoRefrigerado(String producto, String descripcion, double valorUnitario,
			int cantidadExistencia, String codigoAprobacion, String temperatura) {
		ProductoRefrigerado productoRefrigerado = almacen.crearProductoRefirgerado(producto, descripcion, valorUnitario, cantidadExistencia, codigoAprobacion, temperatura);

		return productoRefrigerado;
	}

/**

	public boolean eliminarCliente(String cedula) {
		boolean eliminado = empresa.eliminarClienteNatural(cedula);
		return eliminado;
	}

	public void actualizarCliente(String nombre, String cedula, String apellidos, int estrato) {
		empresa.actualizarClienteNatural(nombre, cedula, apellidos, estrato);

	}

	public ClienteJuridico crearClienteJuridico (String nit, String nombre, String telefono, String tipoEmpresa){
		ClienteJuridico cliente = (empresa.agregarClienteJuridico(nit, nombre, telefono, tipoEmpresa));
		return cliente;
	}


	public boolean eliminarClienteJuridico (String nit) {
		boolean eliminado = empresa.eliminarClienteJuridico(nit);
		return eliminado;
	}

	public void actualizarClienteJuridico (String nit, String nombre, String telefono, String tipoEmpresa) {
		empresa.actualizarClienteJuridico(nit, nombre, telefono, tipoEmpresa);

	}


	public Factura crearFactura (String codigoFactura, String fechaFacturacion, float totalPagar , String nombre){
		Factura factura = (empresa.agregarFactura( codigoFactura, fechaFacturacion, totalPagar, nombre));
		return factura;
	}

*/



}
