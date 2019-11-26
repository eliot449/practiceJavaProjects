package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	
	private String nombre, apellido, mail;
	private int dni;
	List<Helado> heladosComprados = new ArrayList<>();
	
	
	public Cliente(String nombre, String apellido, String mail, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public List<Helado> getHeladosComprados() {
		return heladosComprados;
	}


	public void setHeladosComprados(Helado h) {
		heladosComprados.add(h);
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", dni=" + dni+ "]";
	}
	
	
	public String mostrarDatos() {
		return "Cliente: "+nombre+ " "+apellido+ "/ DNI: "+dni;

	}
	
	
}
