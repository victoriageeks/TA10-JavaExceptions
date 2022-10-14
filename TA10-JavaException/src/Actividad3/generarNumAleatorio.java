package Actividad3;
import java.util.Random;


public class generarNumAleatorio{
	
	Random rand = new Random();
	int numero;
	public int numMin;
	public int numMax;
	
	
	public generarNumAleatorio() {
		this.numero = generarNumero();
	}
	
	public generarNumAleatorio(int numMin, int numMax){
		this.numMin = numMin;
		this.numMax = numMax;
		this.numero = generarNumero();
	}
	
	public double getNumMin() {
		return numMin;
	}
	
	public double getNumMax() {
		return numMax;
	}
	
	public double getNumero() {
		return numero;
	}
	
	public int generarNumero() {
		
			int numAleatorio=rand.nextInt((numMax-numMin)+1) + numMin;
			return numAleatorio;
	};
};

