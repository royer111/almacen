package co.uniquindio.almacen.model;

public class ProductoPerecedero extends Producto{
	private String fechaVencimiento;

	public ProductoPerecedero(String nombre, String descripcion, double valorUnitario, int cantidaExistencia,
			String fechaVencimiento) {
		super(nombre, descripcion, valorUnitario, cantidaExistencia);
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



}
