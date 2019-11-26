package Modelo;

public class Alumno {

 private String nombre, apellido;
 private int legajo;
 
 
public Alumno(String nombre, String apellido, int legajo) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.legajo = legajo;
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


public int getLegajo() {
	return legajo;
}


public void setLegajo(int legajo) {
	this.legajo = legajo;
}


@Override
public String toString() {
	return "Alumno: [nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + "]";
}
 
public String mostrarDatos() {
	return "Legajo: "+legajo+ " Apellido: "+apellido;
}
 
 
}
