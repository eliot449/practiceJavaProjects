package Modelo;

public class Helado {

	private int id;
	private String sabor;
	private double precio;
	
	
	public Helado(int id, String sabor, double precio) {
		super();
		this.id = id;
		this.sabor = sabor;
		this.precio = precio;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Helado [id=" + id + ", sabor=" + sabor + ", precio=" + precio + "]";
	}
	
	public String mostrarDatos() {
		return "Sabor: "+sabor+ ". Precio: "+precio;
	}
	
}
