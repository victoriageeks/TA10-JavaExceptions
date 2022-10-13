package Actividad1;
import java.util.Random;

public class GenerarNumeros {
	private int numAleatorio;
	private int numIntroducido;
	Random rnd = new Random();
	
	
	//Generador de número
	public GenerarNumeros(){
		
	}


	//Getters y setters
	public int getNumAleatorio() {
		return numAleatorio;
	}


	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}


	public int getNumIntroducido() {
		return numIntroducido;
	}


	public void setNumIntroducido(int numIntroducido) {
		this.numIntroducido = numIntroducido;
	}
	
	
	//Método que genera un número aleatorio entre 1 y 500
	public int generaNumAleatorio() {
		numAleatorio = (int)(Math.random() * ((500 - 1) + 1)) + 1;
		return numAleatorio;
	}
	
	
	//Método que si el número introducido es mayor o menor
	public void comprobarNumero(int numIntroducido) {
		if(numIntroducido>numAleatorio) {
			System.out.println("El número que has introducido es mayor al número generado.");
		}else if(numIntroducido==numAleatorio){
			System.out.println("Correcto!!");
		}else {
			System.out.println("El número que has introducido es menor al número generado.");
		}
	}
	
	
	@Override
	public String toString() {
		return "Numero generado: " + numAleatorio;
	}
}
