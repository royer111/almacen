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



}
