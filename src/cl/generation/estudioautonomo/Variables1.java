package cl.generation.estudioautonomo;

public class Variables1 {

	public static void main(String[] args) {
		//Variables
		//primitivas de caracter estatico, debe tener un tipo de dato en especifico
		
		//String- almacena texto, como "Hola".
		//int- almacena enteros (números enteros)
		//float- almacena números de coma flotante, con decimales
		//char- almacena caracteres individuales, como 'a' o 'B'. Los valores de char están entre comillas simples
		//boolean- almacena valores con dos estados: verdadero o falso
		
		//PARA CREAR UNA VARIABLE
		// tipo_variable nombre_variable = contenido_variable
		int numero = 15;
		System.out.println(numero);
		
		//También se puede declarar una variable sin asignar el valor y asignarlo despues.
		int num;
		num = 15;
		System.out.println(num);
		
		//SOBRE ESCRITURA 
		numero = 10;//antes tenia el 15 (int numero = 15;), ahora cambia a 10
		System.out.println(numero);
		
		//IMPRESION DE VARIABLES
		//printIn
		
		//Se pueden sumar variables con +
		String Nombre = "Luisa";
		String Apellido = "morales";
		String nombreCompleto = Nombre +  Apellido;
		System.out.println(nombreCompleto);
		
		//PARA DECLARAR VARIABLES DEL MISMO TIPO
		//se pueden mostrar separadas por comas
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);

		
		//TIPOS DE DATOS************// lo mismo que lo anterior
		//Tipos de datos primitivos: incluye byte, short, int, long, float, doubleybooleanchar
		//Tipos de datos no primitivos, como StringArrays y Classes 
		
		//primitivios, como los vimos anteriormente
		int Num = 5;               // Integer (whole number)
		long num2 = 1234l;         // igual que int pero se diferencia en el tamaño del dato
		float FloatNum = 5.99f;    // Floating point number, se pone la f para indicar que es float
		char Letra = 'D';         // Character
		double decimales = 5.4d; //igual a float, pero cambia el tamaño de memoria y se pone d para indicar que es double
		boolean Bool = true;       // Boolean
		
		
		Float num3 = 4.6F; //no primitivo, con mayuscula 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
