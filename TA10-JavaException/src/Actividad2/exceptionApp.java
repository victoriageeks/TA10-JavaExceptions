package Actividad2;

import exceptionCustom.myException;
public class exceptionApp {

	public static void main(String[] args) {
		
		try {
			throw new myException();
			
		}catch(myException e) {
			System.out.println(e);
		}

	}

}
