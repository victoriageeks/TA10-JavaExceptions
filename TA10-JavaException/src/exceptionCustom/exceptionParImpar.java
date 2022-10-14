package exceptionCustom;

public class exceptionParImpar extends Exception{
	private int num= 0;
	
	public exceptionParImpar(int num) {
		this.num=num;
	}
	
	@Override
	public String toString() {
				if(num%2==0) {
					return "El número es par";
				}else {
					return "El número es impar";
				}
		
	}
}
