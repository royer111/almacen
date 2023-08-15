package co.uniquindio.almacen.model;
public class PersonaClienteNatural extends Cliente{
	private String email;
	private String fechaNacimiento;

	public PersonaClienteNatural(String nombres, String apellidos, String identificacion, String direccion,
			String telefono, String email, String fechaNacimiento) {
		super(nombres, apellidos, identificacion, direccion, telefono);
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



}
