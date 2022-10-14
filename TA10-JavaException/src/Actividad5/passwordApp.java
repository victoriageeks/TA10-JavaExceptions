package Actividad5;
import java.util.Scanner;
public class passwordApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de contraseñas que quieras crear:");
		int tamaño = sc.nextInt();
  
        System.out.println("Introduce la longitud de las contraseñas:");
        int longitud=sc.nextInt();

        
        Password listaPassword[]=new Password[tamaño];
        boolean fortalezaPassword[]=new boolean[tamaño];
  
       
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            
            System.out.println("Contraseña: "+listaPassword[i].getContraseña()+"\nEs fuerte?: "+fortalezaPassword[i]);
            System.out.println("------------------------------------");
        }
        sc.close();

	}

}
