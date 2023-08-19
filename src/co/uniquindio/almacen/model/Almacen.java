package co.uniquindio.almacen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


public class Almacen {

	List<Cliente> listaPersonas = new ArrayList<>();
	List<PersonaClienteNatural> listaPersonasNaturales = new ArrayList<>();
	List<PersonaClienteJuridico> listaPersonasJuridicas = new ArrayList<>();
	List<Producto> listaProductos = new ArrayList<>();


	public Almacen() {
		super();
	}



	public List<Cliente> getListaPersonas() {
		return listaPersonas;
	}



	public void setListaPersonas(List<Cliente> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}



	public List<PersonaClienteNatural> getListaPersonasNaturales() {
		return listaPersonasNaturales;
	}



	public void setListaPersonasNaturales(List<PersonaClienteNatural> listaPersonasNaturales) {
		this.listaPersonasNaturales = listaPersonasNaturales;
	}



	public List<PersonaClienteJuridico> getListaPersonasJuridicas() {
		return listaPersonasJuridicas;
	}



	public void setListaPersonasJuridicas(List<PersonaClienteJuridico> listaPersonasJuridicas) {
		this.listaPersonasJuridicas = listaPersonasJuridicas;
	}



	public List<Producto> getListaProductos() {
		return listaProductos;
	}



	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}



	public boolean buscarPersona (String telefono){
		boolean condicion = false;
		for (Cliente persona : listaPersonas) {
			if(persona.getTelefono().equals(telefono)){
		 		condicion = true;
			}
		}
		return condicion;
	}

	public PersonaClienteNatural agregarPersonasNaturales (String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String email, String fechaNacimiento){
			PersonaClienteNatural persona1 = new PersonaClienteNatural( nombres,  apellidos,  identificacion,  direccion,
   				 telefono,  email,  fechaNacimiento);
			listaPersonasNaturales.add(persona1);
			JOptionPane.showMessageDialog(null, "Cliente creado");


		return persona1;
	}

	public PersonaClienteJuridico agregarPersonasJuridicas (String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String nit){
			PersonaClienteJuridico persona1 = new PersonaClienteJuridico( nombres,  apellidos,  identificacion,  direccion,
   				 telefono, nit);
			listaPersonasJuridicas.add(persona1);
			JOptionPane.showMessageDialog(null, "Cliente creado");


		return persona1;
	}

	public ProductoEnvasado crearProductoEvasado (String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
			String fechaEnvasado, String pesoEnvase, PaisOrigen paisOrigen){
		    ProductoEnvasado producto = new ProductoEnvasado(nombre, descripcion, valorUnitario, cantidaExistencia, fechaEnvasado, pesoEnvase, paisOrigen);
		    listaProductos.add(producto);
		    return producto;
	}

	public ProductoPerecedero crearProductoPerecedero (String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
			String fechaVencimiento){
		ProductoPerecedero producto = new ProductoPerecedero(nombre, descripcion, valorUnitario, cantidaExistencia, fechaVencimiento);
		listaProductos.add(producto);
		return producto;
	}

	public ProductoRefrigerado crearProductoRefirgerado (String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
		String codigoAprobacion, String temperaturaRecomendada){
		ProductoRefrigerado producto = new ProductoRefrigerado(nombre, descripcion, valorUnitario, cantidaExistencia, codigoAprobacion, temperaturaRecomendada);
		listaProductos.add(producto);
		return producto;
	}


}
