package co.uniquindio.almacen.model;

public class Producto {

	private String nombre;
	private String descripcion;
	private double valorUnitario;
	private int cantidaExistencia;
	public Producto(String nombre, String descripcion, double valorUnitario, int cantidaExistencia) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.cantidaExistencia = cantidaExistencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getCantidaExistencia() {
		return cantidaExistencia;
	}
	public void setCantidaExistencia(int cantidaExistencia) {
		this.cantidaExistencia = cantidaExistencia;
	}


}
