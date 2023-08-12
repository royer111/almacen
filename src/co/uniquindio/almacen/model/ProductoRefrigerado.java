package co.uniquindio.almacen.model;

public class ProductoRefrigerado extends Producto{

	private String codigoAprobacion;
	private String temperaturaRecomendada;
	public ProductoRefrigerado(String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
			String codigoAprobacion, String temperaturaRecomendada) {
		super(nombre, descripcion, valorUnitario, cantidaExistencia);
		this.codigoAprobacion = codigoAprobacion;
		this.temperaturaRecomendada = temperaturaRecomendada;
	}
	public String getCodigoAprobacion() {
		return codigoAprobacion;
	}
	public void setCodigoAprobacion(String codigoAprobacion) {
		this.codigoAprobacion = codigoAprobacion;
	}
	public String getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}


}
