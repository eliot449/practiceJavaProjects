package application;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Alumno;
import Modelo.Instituto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ComboBoxController implements Initializable {

		
		
	@FXML
	private ComboBox <String> listaDesp;
	private Instituto inst = new Instituto();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		for(Alumno aux: inst.getLista()) {
			listaDesp.getItems().add(aux.mostrarDatos());
				
			}
			
		}
	}
	
	

