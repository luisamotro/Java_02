package cl.generation20221027;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		
		menu ();
			
		}
		//menu();//llamado del metodo/funcion dentro del main
	    //break;//termina bruscamente el bucle o cualquier caso
		//Menu de opciones
		//Calculadora con 4 operaciones basica 
		//solicitar 2 numeros Float
		//mostrar los resultados y guardar en una variable
		//ofrecer opciones de repeticiones(bucle)
		//definir los metodos
		//validaciones
		//terminar la ejecucion
		//limpiar las variables
	

	public static void menu() {
		System.out.println("_______________");
		System.out.println("______MENU_____");
		System.out.println("_______________");
		System.out.println("1.____SUMAR____");
		System.out.println("2.____RESTAR___");
		System.out.println("3._MULTIPLICAR_");
		System.out.println("4.___DIVIDIR___");
		System.out.println("0.____SALIR____");
		System.out.println("_______________");

		int opciones = 0;//int porque es numerico el valor de abajo
		Scanner sc = new Scanner (System.in);
		int contadorErrores = 4;
	
		
		do {
			System.out.println("_Seleccione una opcion_");
			opciones = sc.nextInt();
			
			
		    //si la opcion es 0, salir del do while
			if(opciones==0) {
				System.out.println("Usted ha salido del programa");
				break;	
			}
			
			if(contadorErrores==0){
				contadorErrores--;
				System.out.println("Agoto la cantidad de intentos");
				break;

			}if (opciones < 0 || opciones > 4) {//condicion de error
				contadorErrores--;
				System.out.println("Te quedan "+contadorErrores+" intentos");
			}
		
		} while (opciones < 0 || opciones > 4);
		
		System.out.println(contadorErrores);
		
		if(opciones == 0 || contadorErrores == 0) {
			System.out.println("ADIOS");
			
		}else {//solo ingresara para opciones 1,2,3,4
			
			//solicitar 2 numeros 
			System.out.println("Ingresa el primer numero");
			float numero1 = sc.nextFloat();
			
			System.out.println("Ingresa el segundo nuemero");
			float numero2 = sc.nextFloat();
			
			float resultado = 0;
			
			switch (opciones) {
			
			case 1://Sumar
				resultado = numero1 + numero2;
				System.out.println("El resultado es "+ resultado);
				
				break;
				
			case 2://Sumar
				resultado = numero1 - numero2;
				System.out.println("El resultado es "+ resultado);
				
				break;
				
			case 3://multiplicacion
				resultado = numero1 * numero2;
				System.out.println("El resultado es "+ resultado);
				
				break;
				
			case 4://Division
				if(numero2 == 0) {//limitacion porque no se puede dividir por 0
					System.out.println("No se puede dividir por cero!!");
					
				}else {
					resultado = numero1 / numero2;
					System.out.println("El resultado es "+ resultado);
				}
				break;
				
			default:
				System.out.println("Opcion no valida");
				break;
			}

			
			
			
		}
	}
	
}
