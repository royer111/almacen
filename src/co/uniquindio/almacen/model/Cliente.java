package co.uniquindio.almacen.model;

public class Cliente extends Persona{

	private String direccion;
	private String telefono;

	public Cliente(String nombres, String apellidos, String identificacion, String direccion, String telefono) {
		super(nombres, apellidos, identificacion);
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




}
