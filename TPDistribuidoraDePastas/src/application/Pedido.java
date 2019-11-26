package application;

import javax.swing.JOptionPane;

public class Pedido {

	private int acumPedido=0;
	private Productos [] listaProductos = new Productos[15];

	public void agregarPedido(Productos prod) {
		if(acumPedido<15) {
		listaProductos[acumPedido]=prod;
		acumPedido++;
		}
	}
	
	public double calcularTotal() {

		double total=0;
			for(int i=0;i<listaProductos.length;i++) {
				if (listaProductos[i]!=null){
				total+=listaProductos[i].getPrecio();
				}
			}return total;
		}


		public void mostrarProductosConsola() {
			for(int i=0;i<listaProductos.length;i++) {
				if (listaProductos[i]!=null){
				System.out.println(listaProductos[i]);;
				}
			}
		}
		
		public boolean listaProductosLLena() {
			if (listaProductos[14]==null){
				return false;
			}else {
				return true;
			}
		}
		
}
