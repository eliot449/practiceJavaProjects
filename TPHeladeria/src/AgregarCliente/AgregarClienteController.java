package AgregarCliente;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Modelo.Cliente;
import Modelo.Helado;
import Modelo.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AgregarClienteController implements Initializable {
	
	private Sistema sistema;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		sistema = Sistema.getSistema();
		
	}
	
	@FXML
	private TextField nombre = new TextField();
	@FXML
	private TextField apellido = new TextField();
	@FXML
	private TextField dni = new TextField();
	@FXML
	private TextField mail = new TextField();

	@FXML
	private AnchorPane ap = new AnchorPane();
	

	
	public void irAPantallaPrincipal (ActionEvent event) {
		Stage st =  (Stage) ap.getScene().getWindow();
		try {
			cambiarVentana("../PantallaPrincipal/PantallaPrincipal.fxml", " ", st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void guardarCliente(ActionEvent event) {
		Cliente c = new Cliente(nombre.getText(), apellido.getText(), mail.getText(), Integer.parseInt(dni.getText()));
		sistema.agregarCliente(c);
		System.out.println(c.mostrarDatos());
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
