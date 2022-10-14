package Actividad4;

/* Esto lo lanza un Scanner para indicar que el token
 * recuperado no coincide con el patrón del tipo esperado, o que el token está
 * fuera del rango para el tipo esperado.*/
import java.util.InputMismatchException;
import java.util.Scanner;


	public class calculadoraApp {
	/* permite el acceso a métodos y variables de clase sin la necesidad de instanciar 
	 * un objeto de dicha clase, permitiendo la inicialización de forma cómoda y durante la carga de clase.*/
		static Scanner sc = new Scanner(System.in);
		static Calculadora c = new Calculadora();
		static boolean salir = false;
		
		public static void main(String[] args) {
			
			do {
				try {
					menuCalculadora();
					
				} catch (InputMismatchException e) {
					System.out.println("Se ha introducido un valor incorrecto, recuerda escribir un número para realizar una tarea.");
					sc.next();
				}
			}while(!salir);
			sc.close();
			
		}
		
		public static void menuCalculadora() {
			System.out.println("Bienvenido, ¿Qué quieres hacer? \n1) Sumar \n2) Restar \n3) Multiplicar \n4) Dividir \n5) Potencia \n6) Raíz cuadrada \n7) Raíz cúbica \n0) Salir");
			int eleccion =  sc.nextInt();
			
			
			switch (eleccion) {
			case 1:
				//la c es el nuevo objeto que has creado de la clase Calculadora
				pedir2Nums(c);
				System.out.println("La suma de ambos números es de: "+c.sumar());
				break;
			case 2:
				pedir2Nums(c);
				System.out.println("El resultado de restas ambos números es: "+c.restar());
				break;
			case 3:
				pedir2Nums(c);
				System.out.println("La multiplicación de ambos números es de: "+c.multiplicar());
				break;
			case 4:
				pedir2Nums(c);
				System.out.println("El resultado de dividir ambos números es :"+c.dividir());
				break;
			case 5:
				pedir2Nums(c);
				System.out.println("El resultado de la potencia es de: "+c.potencia());
				break;
			case 6:
				pedir1Num(c);
				System.out.println("El resultado de la raíz cuadrada es de: "+c.raizCuadrada());
				break;
			case 7:
				pedir1Num(c);
				System.out.println("El resultado de la raíz cúbica es de: "+c.raizCubica());
				break;
			case 0:
				salir = true;
				break;
				}
		}
		
		public static Calculadora pedir2Nums(Calculadora c) {
			
			System.out.println("Introduce el primer número para operar:");
			c.setX(sc.nextDouble());
			System.out.println("Introduce el segundo número:");
			c.setY(sc.nextDouble());
			
			return c;
		}
		
		public static Calculadora pedir1Num(Calculadora c) {
			
			System.out.println("Introduce el número:");
			c.setX(sc.nextDouble());
			
			return c;
		}
	
	}