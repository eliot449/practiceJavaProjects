package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	List <Alumno> lista = new ArrayList<>();

	public Instituto() {
		Alumno a1 =new Alumno ("Fati", "Rojas", 655051);
		Alumno a2 =new Alumno ("Eduardo", "Liscano", 4410);
		Alumno a3 =new Alumno ("Noe", "Laino", 789520);	
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

	}
	
	

	public List<Alumno> getLista() {
		return lista;
	}

	
	
	
	
}
