package co.uniquindio.almacen.model;

public class ProductoEnvasado extends Producto{
	private String fechaEnvasado;
	private String pesoEnvase;
	private PaisOrigen paisOrigen;

	public ProductoEnvasado(String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
			String fechaEnvasado, String pesoEnvase, PaisOrigen paisOrigen) {
		super(nombre, descripcion, valorUnitario, cantidaExistencia);
		this.fechaEnvasado = fechaEnvasado;
		this.pesoEnvase = pesoEnvase;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPesoEnvase() {
		return pesoEnvase;
	}

	public void setPesoEnvase(String pesoEnvase) {
		this.pesoEnvase = pesoEnvase;
	}

	public PaisOrigen getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(PaisOrigen paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



}
