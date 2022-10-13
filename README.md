
# Unidad 10 - Java Exceptions






## Actividad 1
Escribe un porgrama utilizando para ello el paradigma de POO, que juegue con el usuario a adivinar un número. Debe cumplir los siguientes requerimientos:
 - El ordenador debe generar un número entre 1 y 500, y el usuario tiene que intentar adivinarlo.
 - Cada vez que el usuario introduce un valor, el ordenador debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario.
 - Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número.
 - Si el usuario introduce algo que no es un número, debe indicarlo en pantalla y contarlo como un intento indicando que no ha conseguido reconocer la entrada lanzando la excepción InputMismatchException.
## Actividad 2
Escribe un programa, utilizando para ello el paradigma de POO, que lance y capture una excepción customizada. Crea para ello un package diferente que puedas reutilizar para el resto de tus proyectos.

Recomendaciones:
El programa abre un bucle try{} en el que comienza mostrando un mensaje por pantalla. A continuación, crea un objeto de la clase Exception, indicando en su constructor un mensaje explicativo.

El resultado debe ser similar a este mensaje:
 - Excepción capturada con mensaje: Esto es un objeto Exception. Programa terminado.
 
## Actividad 3
Escribe un programa, utilizando para ello elparadigma de POO, que genere un número aleatorio e indique si el número generado es par o impar. El programa utilizará para ello el lanzamiento de una excepción.

Recomendaciones:
 - El programa utiliza la clase Random() para obtener un número aleatorio entre 0 y 999(por poner un rango cualquiera).
 - Se determina si el número es par o impar y se lanza una excepción con el correspondiente mensaje para indicarlo (se limitará a mostrar el mesnaje asociado a la excepción capturada).

El resultado debe ser similar a este mensaje:
 - Generando número aleatorio... El número aleatorio generado es: 203. Es impar.
## Actividad 4
Escribe un programa, utilizando para ello el paradigma de POO, que nos permita realizar cálculos simples (suma, resta, multiplicación, potencia, raíz cuadrada, raíz cúbica y división). El programa debe estar preparado para gestionar los posibles errores de cálculo. Debes utilizar para ello el control de excepciones de Java.

Recomendaciones:
 - Utiliza siempre que sea posible las excepciones definidas en la API de Java 8.
 - Puedes utilizar como interfaz visual Scanner o JOptionPane.
 - Estructura correctamente el código en diferentes packages.
## Actividad 5
Haz una clase llamada Password que siga las siguientes condiciones:
 - Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
 - Los constructores serán los siguientes:
    - Un constructor por defecto.
    - Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria con esa longitud.

Los método que implementa serán:
 - esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
 - generarPassword(): genera la contraseña del objeto con la longitud que tenga.
 - Método get para contraseña y longitud.
 - Método set para longitud.

Ahora crea una clase ejecutable:
 - Crea un array de Passwords con el tamaño que tu le indiques por teclado.
 - Crea un bucle que cree un objeto para cada posición del array.
 - Indica también por teclado la longitud de los Password (antes del bucle).
 - Crea otro array de booleanos donde se almacene si el password del array de Password es fuerte o no (usa el bucle anterior).

Al final, muestra la contraseña y si es fuerte o no (usa el bucle anterior). Usa este simple formato:
 - contaseña1 valor_booleano1
 - contraseña2 valor_booleano2
