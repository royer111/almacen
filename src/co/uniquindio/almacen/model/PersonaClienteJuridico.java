package co.uniquindio.almacen.model;

public class PersonaClienteJuridico extends Cliente{
	private String nit;



	public PersonaClienteJuridico(String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String nit) {
		super(nombres, apellidos, identificacion, direccion, telefono);
		this.nit = nit;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}


}

