package Actividad3;

import exceptionCustom.exceptionParImpar;
public class numeroAleatorioApp {

	public static void main(String[] args) {
		// generar número aleatorio y decir si es par o impar
		
		try {
			System.out.println("Generando numero aleatorio...");
			
			generarNumAleatorio numAleatorio = new generarNumAleatorio(0,999);
			
			int num =(int)numAleatorio.getNumero();
			System.out.println ("El número generado es: "+num);
			
			throw new exceptionParImpar(num);
			
		}catch(exceptionParImpar e) {
			System.out.println(e);
		}
	}
}
