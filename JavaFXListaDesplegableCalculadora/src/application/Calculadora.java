package application;

public class Calculadora {

	public int sumar(int n1, int n2){
		return n1+n2;
		}
		
	public int restar(int n1, int n2){
		return n1-n2;
		}
	
	public int multiplicar(int n1, int n2){
		return n1*n2;
	}
	
	
	public double dividir(int n1, int n2){
		return n1*1.0/n2;
		//En este caso, como la lista es de enteros, no se pueden cambiar los parámetros de entrada por doubles para la división, así que es necesario
		//multiplicar alguno de los valores por 1.0 para transformarlo en double antes de retornarlo.
	}

}
