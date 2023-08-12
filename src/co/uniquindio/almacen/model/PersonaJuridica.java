package co.uniquindio.almacen.model;

public class PersonaJuridica extends Persona{
	private String nit;

	public PersonaJuridica(String nombre, String apellidos, String direccion, String telefono, String nit) {
		super(nombre, apellidos, direccion, telefono);
			this.nit = nit;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}


}

