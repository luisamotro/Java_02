package cl.generation.estudioautonomo;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones
		//void funcion que no retorna ningun valor
		sumarDos();//llamado a la funcion dentro del main siosi
		System.out.println(num);//para que muestre el resultado final
		sumarTres(3);//el numero 3 lo ingresamos como pedido de la funcion
		sumarTres("perro");
		nombreEdad("Luisa",20);
	}
	
	static int num = 3;
	//en esta funcion no se ingresa ningun dato, tampoco retorna ninguno
	public static void sumarDos () {
		num = num + 2;//se pone num porque se sobre escribe la variable con el nuevo valor de num + 2
		
	}
	//en esta te pide un dato que tiene que ser especifico, si es integer, o string etc
	public static void sumarTres(Integer numero) {//para que se ingrese un numero entero solamente y se usara solo dentro de esta funcion
		Integer nuevo_numero = numero + 3;
		System.out.println(nuevo_numero);
	}
	//las funciones se pueden llamar igual pero solicitar en el llamado, distintos tipos de datos
	public static void sumarTres(String numero) {//para que se ingrese un numero entero solamente y se usara solo dentro de esta funcion
		String nuevo_numero = numero + 3;
		System.out.println(nuevo_numero);
	}
	
	//Hacer funcion que pida un string y un integer
	public static void nombreEdad(String nombre, Integer edad) {//separado si o si por coma
		String datos = nombre + edad;
		System.out.println(datos);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

