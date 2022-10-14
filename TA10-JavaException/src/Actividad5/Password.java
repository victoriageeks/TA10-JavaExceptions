package Actividad5;

public class Password {
	// Atributos
	private int longitud;
	private String contraseña;
	
	// constructor por defecto
	public Password() {
		this.longitud = 8;
		this.contraseña = crearContraseña(longitud);
	}
	
	//Constructor con los atributos
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = crearContraseña(longitud);
	}
	
	// Getters y setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setConstraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	// Método para crear una contraseña aleatoria según su longitud
	public String crearContraseña(int longitud) {
		String password="";
        for (int i=0;i<longitud;i++){

        	//hace que sea random las elecciones y por lo tanto genera aleatoriamente mayusculas, minusculas y numeros
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
	}
	
	//Método que detecta si la contraseña es fuerte o no
	 public boolean esFuerte(){
	        int cuentaNums=0;
	        int cuentaMinsc=0;
	        int cuentaMaysc=0;

	        for (int i=0;i<contraseña.length();i++){
	                if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
	                    cuentaMinsc+=1;
	                }else{
	                    if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
	                        cuentaMaysc+=1;
	                }else{
	                    cuentaNums+=1;
	                    }
	                }
	            }

	            if (cuentaNums>=5 && cuentaMinsc>=1 && cuentaMaysc>=2){
	            return true;
	        }else{
	            return false;
	        }
	    }
}
