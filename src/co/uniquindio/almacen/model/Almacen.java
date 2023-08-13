package co.uniquindio.almacen.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Almacen {

	List<Persona> listaPersonas = new ArrayList<>();
	List<PersonaNatural> listaPersonasNaturales = new ArrayList<>();
	List<PersonaJuridica> listaPersonasJuridicas = new ArrayList<>();
	List<Producto> listaProductos = new ArrayList<>();


	public boolean buscarPersona (String telefono){
		boolean condicion = false;
		for (Persona persona : listaPersonas) {
			if(persona.getTelefono().equals(telefono)){
				condicion = true;
			}
		}
		return condicion;
	}

	public PersonaNatural agregarPersonasNaturales (String email, Date fechaNacimiento, String nombre, String apellidos, String direccion, String telefono){
		PersonaNatural persona1 = null;
		for (PersonaNatural personaNatural : listaPersonasNaturales) {
			if (buscarPersona(telefono)){
				persona1 = personaNatural;
				listaPersonasNaturales.add(personaNatural);
			}
			else{
				persona1 = new PersonaNatural(email, fechaNacimiento, nombre, apellidos, direccion, telefono);
			    listaPersonasNaturales.add(persona1);
			}
		}
		return persona1;
	}



}
