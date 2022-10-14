package Actividad5;
import java.util.Scanner;
public class passwordApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de contraseñas que quieras crear:");
		int tamaño = sc.nextInt();
  
        System.out.println("Introduce la longitud de las contraseñas:");
        int longitud=sc.nextInt();

        
        Password listaContraseña[]=new Password[tamaño];
        boolean contraseñaFuerte[]=new boolean[tamaño];
  
       
        for(int i=0;i<listaContraseña.length;i++){
        	listaContraseña[i]=new Password(longitud);
        	contraseñaFuerte[i]=listaContraseña[i].esFuerte();
            
            System.out.println("Contraseña: "+listaContraseña[i].getContraseña()+"\nEs fuerte?: "+contraseñaFuerte[i]);
            System.out.println("------------------------------------");
        }
        sc.close();

	}

}
