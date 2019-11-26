package PantallaPrincipal;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Sistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PantallaPrincipalController implements Initializable{

	private Sistema sistema;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		sistema = sistema.getSistema();
	}
	
	@FXML
	private AnchorPane ap = new AnchorPane();

	
	public void irAAgregarCliente (ActionEvent event) {
		Stage st =  (Stage) ap.getScene().getWindow();
		try {
			cambiarVentana("../AgregarCliente/AgregarCliente.fxml", " ", st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void irAAgregarHelado (ActionEvent event) {
		Stage st =  (Stage) ap.getScene().getWindow();
		try {
			cambiarVentana("../AgregarHelado/AgregarHelado.fxml", " ", st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void irAVender (ActionEvent event) {
		Stage st =  (Stage) ap.getScene().getWindow();
		try {
			cambiarVentana("../Vender/Vender.fxml", " ", st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
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
