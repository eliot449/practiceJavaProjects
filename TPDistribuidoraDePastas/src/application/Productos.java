package application;

public class Productos {
	
	private String producto;
	private double precio;
	private String unidad;
	private String descripcion;




	public Productos (String producto, double precio, String unidad, String descripcion) {
	this.producto=producto;
	this.unidad=unidad;
	this.precio=precio;
	this.descripcion=descripcion;
	}

	public String getProducto() {
	return producto;
	}

	public double getPrecio() {
	return precio;
	}

	public String getUnidad() {
	return unidad;
	}

	public String getDescripción() {
	return descripcion;
	}
	
	public String toString() {
		return "Producto: "+producto+" Precio: "+precio+" Unidad: "+unidad;
		}
}
