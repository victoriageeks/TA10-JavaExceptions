package Actividad4;

public class Calculadora {
	double primerNum;
	double segundoNum;
	
	public Calculadora() {
	}
	
	public Calculadora(int primerNum) {
		this.primerNum = primerNum;
	}
	
	public Calculadora(int primerNum, int segundoNum) {
		this.primerNum = primerNum;
		this.segundoNum = segundoNum;
	}

	public double sumar() {
		return (primerNum+segundoNum);
	}
	
	public double restar() {
		return (primerNum-segundoNum);
	}
	
	public double multiplicar(){
		return (primerNum*segundoNum);
	}
	
	public double dividir(){
		return (primerNum/segundoNum);
	}
	
	public double potencia(){
		return (Math.pow(primerNum, segundoNum));
	}
	
	public double raizCuadrada(){
		return (Math.sqrt(primerNum));
	}
	
	public double raizCubica(){
		return (Math.cbrt(primerNum));
		
	}

	public double getX() {
		return primerNum;
	}

	public void setX(double primerNum) {
		this.primerNum = primerNum;
	}

	public double getY() {
		return segundoNum;
	}

	public void setY(double segundoNum) {
		this.segundoNum = segundoNum;
	}
	
	
}
