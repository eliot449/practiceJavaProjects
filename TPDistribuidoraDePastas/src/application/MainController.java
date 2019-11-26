package application;




import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

	
	
	public class MainController {
	
		Pedido pedido = new Pedido();

		private int cantArticulos=0;
		private String nombre;
		private boolean procederPedido = false;
		private String mail;
		private double calcularTotal=pedido.calcularTotal();
		private String calcularTotalString = String.format("%.2f", calcularTotal);
		@FXML
		private TextField nombreText = new TextField();
		@FXML 
		private TextField mailText = new TextField();
		@FXML 
		private Label lblTurno = new Label();
		@FXML
		private Label lblDatosPedido = new Label();
		@FXML
		private Label lblcantArticulos = new Label();
	



		public void leerNombre() {
			if(nombreText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese el nombre"); //Esto es para mostrar un cuadro de diálogo.
			}else {
				nombre=nombreText.getText();
			}
		}
	
		public void leerMail() {
			if(mailText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese el mail"); //Esto es para mostrar un cuadro de diálogo.
			}else {
				mail=mailText.getText();
			}
		}
		
		
		/*Creé este método para que en caso de que ambos campos estén vacíos, 
		se muestre un solo MessageDialog que pida ambos datos.*/
		public void leerDatos() {
			if (nombreText.getText().isEmpty()==false && mailText.getText().isEmpty()==false) {
				procederPedido=true;
			}
			
			if (nombreText.getText().isEmpty() && mailText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ingrese el nombre y el mail"); 
			}else {
				leerNombre();
				leerMail();
			}
		} 
		
	
		public void pedir0(ActionEvent Event) {
			Productos produc0 = new Productos("Fideos", 124.65, "100gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc0);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Fideos  a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
				}
		}
	
		public void pedir1(ActionEvent Event) {
			Productos produc1 = new Productos("Fideos rellenos", 150.33, "100gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc1);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Fideos rellenos a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else{
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
				}
		}
		public void pedir2(ActionEvent Event) {
			Productos produc2 = new Productos("Ñoquis", 130.24, "100gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc2);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Ñoquis a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
				}
		}
		
		
		public void pedir3(ActionEvent Event) {
			Productos produc3 = new Productos("Ravioles", 165.55, "100gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc3);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Ravioles a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else{
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
				}
		}
	
		public void pedir4(ActionEvent Event) {
			Productos produc4 = new Productos("Sorrentinos", 170.16, "100gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc4);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Sorrentinos a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 	
				}
		}
	
		public void pedir5(ActionEvent Event) {
			Productos produc5 = new Productos("Canelones", 172.78, "3 unidades", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc5);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Canelones a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
			}
		}
		
		public void pedir6(ActionEvent Event) {
			Productos produc6 = new Productos("Queso", 50, "200gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc6);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Queso a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 	
				}
		}
		
		public void pedir7(ActionEvent Event) {
			Productos produc7 = new Productos("Pan", 45.98, "2", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc7);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Pan a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 	
				}
		}
	
		public void pedir8(ActionEvent Event) {
			Productos produc8 = new Productos("Salsa", 78.05, "200gr", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {	
					pedido.agregarPedido(produc8);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Salsa a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 	
				}
		}
		
		public void pedir9(ActionEvent Event) {
			Productos produc9 = new Productos("Bebida", 76, "1.5 litros", "Descripción: ");
				if (pedido.listaProductosLLena()==false) {
					pedido.agregarPedido(produc9);
					calcularTotal=pedido.calcularTotal();
					calcularTotalString = String.format("%.2f", calcularTotal);
					lblDatosPedido.setText("Has agregado Bebida a tu pedido. Total de compra: "+calcularTotalString);
					cantArticulos++;
					lblcantArticulos.setText("Cantidad de artículos: "+cantArticulos);
				}else {
					JOptionPane.showMessageDialog(null, "Ha alcanzado el máximo de artículos por pedido"); 
				}
		}
		
		
		public void mostrarDatos() {
			//Esto es para mostrar el turno
			int turno=1;
			lblTurno.setText("1");	
			turno++;
			
			//Esto es para mostrar solo dos decimales del total
			double calcularTotal=pedido.calcularTotal();
			String calcularTotalString = String.format("%.2f", calcularTotal);
			
			//Esto es para mostrar los datos en la ventana
			lblDatosPedido.setText("Cliente: "+nombre+" — Mail: "+mail+" — Total a pagar: "+calcularTotalString);
			
			//Esto es para mostrar los datos en la consola
			System.out.println();
			System.out.println("Lista de productos del pedido: ");
			pedido.mostrarProductosConsola();
			System.out.println();
			System.out.println("Cantidad de artículos: "+cantArticulos);
			System.out.println("Total a pagar: "+calcularTotalString);
			}
		
	
	
		public void hacerPedido(ActionEvent Event) {
		leerDatos();
		 if (procederPedido==true){ //Esto indica que el pedido se podrá realizar solo si los datos de nombre y correo fueron agregados
			 if(pedido.calcularTotal()==0) {//Esto indica que el pedido se procesará si fue agregado al menos un producto
					JOptionPane.showMessageDialog(null, "No ha agregado artículos a su compra"); 
			 }else {
					mostrarDatos();
			 }
	
		 }
		}
	
	
	
}
