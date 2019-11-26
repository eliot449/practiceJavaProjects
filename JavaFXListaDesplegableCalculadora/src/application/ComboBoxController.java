package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ComboBoxController implements Initializable {

	@FXML
	private ComboBox<Integer> listaDespNum1;
	private ObservableList<Integer> listaNum =FXCollections.observableArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	@FXML
	private ComboBox<String> listaDespOp;
	private ObservableList<String> lista2 =FXCollections.observableArrayList("+", "-", "*", "/");
	
	@FXML
	private ComboBox<Integer> listaDespNum2;
	
	
	@FXML
	Label l1 = new Label();

	Calculadora calc;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		listaDespNum1.setItems(listaNum);
		listaDespOp.setItems(lista2);
		listaDespNum2.setItems(listaNum);
		calc = new Calculadora();

	}
	
	public void resultado(){
		
		//getSelectionModel().isEmpty() sirve para determinar si el ComboBox está vacío
		if (listaDespNum1.getSelectionModel().isEmpty()) {
			l1.setText("El primer campo numérico no ha sido seleccionado");
		}else if (listaDespNum2.getSelectionModel().isEmpty()) {
			l1.setText("El segundo campo numérico no ha sido seleccionado");
		}else if (listaDespOp.getSelectionModel().isEmpty()) {
			l1.setText("El  campo de operación no ha sido seleccionado");
		}else {
			String op = listaDespOp.getValue();
			if (op.equals("+")){
				l1.setText(String.valueOf(calc.sumar(listaDespNum1.getValue(), listaDespNum2.getValue())));
				
			}else if (op.equals("-")){
				l1.setText(String.valueOf(calc.restar(listaDespNum1.getValue(), listaDespNum2.getValue())));
			}else if (op.equals("*")){
				l1.setText(String.valueOf(calc.multiplicar(listaDespNum1.getValue(), listaDespNum2.getValue())));
			}else if (op.equals("/")){
				l1.setText(String.valueOf(calc.dividir(listaDespNum1.getValue(), listaDespNum2.getValue())));
			}
		}
	}
	
}
