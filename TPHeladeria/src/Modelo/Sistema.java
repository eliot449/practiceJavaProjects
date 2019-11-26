package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private static Sistema sist = null;
	List<Cliente> listaClientes= new ArrayList<>();
	List<Helado> listaHelados= new ArrayList<>();
	
	
	private Sistema() {
		
	}
	
	public static Sistema getSistema() {
		if(sist==null) {
			sist= new Sistema();
		}
		return sist;
	}
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public List<Helado> getListaHelados() {
		return listaHelados;
	}

	public void agregarCliente(Cliente c) {
		listaClientes.add(c);
	}
	
	public void agregarHelado(Helado h) {
		listaHelados.add(h);
	}

	public void vender(Cliente c, Helado h) {
		c.setHeladosComprados(h);
	}

}
