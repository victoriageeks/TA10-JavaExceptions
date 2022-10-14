package exceptionCustom;

public class myException extends Exception{
	public myException() {
		
	};
	
	@Override
	public String toString() {
		return "Mensaje mostrado por pantalla\nExcepción capturada con mensaje: Esto es un objeto Exception \nPrograma terminado.";
	}
}
