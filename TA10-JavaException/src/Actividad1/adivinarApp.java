package Actividad1;
import java.util.Scanner;
public class adivinarApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GenerarNumeros gn = new GenerarNumeros();
		int numIntroducido = 0;
		int contador = 0;
		
		gn.generaNumAleatorio();
		
		while(numIntroducido != gn.getNumAleatorio()){
			
			try{
				System.out.println("Introduce un número:");
				numIntroducido = sc.nextInt();
				//System.out.println("SECRETO: numero correcto "+gn.getNumAleatorio()); 
				gn.comprobarNumero(numIntroducido);
				
				
				contador++;
			}catch (NumberFormatException e) {
				System.out.println("Error "+e.getMessage());
			}
			
		};
			System.out.println("Has utilizado " + contador + " intentos!");
		
		
		sc.close();
	}

}
