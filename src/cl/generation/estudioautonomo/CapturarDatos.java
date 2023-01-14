package cl.generation.estudioautonomo;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		// DEFINCION Y USO DE SCANNER
		//Scanner, es la clase.
		//entrada, es el nombre de la variable a la que le asignamos el objeto.
		//new, palabra reservada que instancia un objeto de la clase Scanner.
		//System.in, parámetro que indica de donde proceden los datos, en e
		
		//Para pedir algo, siempre se crea la clase scanner primero
	    Scanner Dato = new Scanner(System.in);
			
	    //Para capturar la información ingresada declaramos otra variable que va a “recibir” los datos introducidos por teclado,
	    String nombre;
	    
	    //luego pedimos los datos al usuario de esta forma
	    System.out.print("Ingrese su nombre:");
	    
		//ponemos el nombre de nuestra variable (nombre) que sera igual a lo que ingrese el usuario
	    //tambien ponemos "Dato" que seria el nombre que le dimos al scanner
	    //y Todos los next[algo] permiten que ingrese el dato del tipo especifico que pedimos, en este caso string(por eso line).
		nombre = Dato.nextLine();
		
		//Y luego imprimimos el resultado
		System.out.println("Su nombre es: "+ nombre);
	}

}
