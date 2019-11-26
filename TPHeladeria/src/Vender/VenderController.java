package Vender;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Modelo.Cliente;
import Modelo.Helado;
import Modelo.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VenderController implements Initializable {

	private Sistema sistema;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		sistema = Sistema.getSistema();
		
		for(Cliente aux : sistema.getListaClientes()) {
			listaClientes.getItems().add(aux.mostrarDatos());
		}
		
		for(Helado aux : sistema.getListaHelados()) {
			listaHelados.getItems().add(aux.mostrarDatos());
		}
		
		
	}

	@FXML
	private AnchorPane ap = new AnchorPane();
	@FXML
	private ComboBox<String> listaClientes;
	@FXML
	private ComboBox<String> listaHelados;



	
	public void irAPantallaPrincipal (ActionEvent event) {
		Stage st =  (Stage) ap.getScene().getWindow();
		try {
			cambiarVentana("../PantallaPrincipal/PantallaPrincipal.fxml", " ", st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void comprobacionSeleccionVenta() {//Este método es necesario ejecutarlo antes de la venta
		if(listaClientes.getSelectionModel().isEmpty()&&listaHelados.getSelectionModel().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe seleccionar ambos campos"); //Esto es para mostrar un cuadro de diálogo.
		}else if(listaClientes.getSelectionModel().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe seleccionar el cliente"); 
		}else if (listaHelados.getSelectionModel().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debe seleccionar el helado"); 
		}
	}
	
	public void vender(ActionEvent event) {
		comprobacionSeleccionVenta();
		//creamos dos variables auxiliares para facilitar los parámetros del método vender
		Cliente caux = sistema.getListaClientes().get(listaClientes.getSelectionModel().getSelectedIndex());
		Helado haux = sistema.getListaHelados().get(listaHelados.getSelectionModel().getSelectedIndex());
		sistema.vender(caux, haux);
		System.out.println(caux.mostrarDatos()+" ha comprado helado "+haux.mostrarDatos());
		
		
	}
	
	
	
	private void cambiarVentana(String fxml, String titulo, Stage st) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource(fxml));
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle(titulo);
        stage.setScene(new Scene(parent));
        stage.show();
        st.close();
		}
}
