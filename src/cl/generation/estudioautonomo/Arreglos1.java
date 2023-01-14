package cl.generation.estudioautonomo;

import java.util.Arrays;

public class Arreglos1 {

	public static void main(String[] args) {
		//Estrucutura basica
		//tipovariable [[ nombrevariable = new tipovariable [dimension
	
		int [] numeros = new int [3];

				
		//como agregar elementos al arreglo
		//en la posicion 0 se agregara el 1, en la 1, se agregara el 2, etc
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=3;
		
		System.out.println(Arrays.toString(numeros));//para mostrar el arreglo  completo
		System.out.println(numeros[1]);//para mostrar el elemento en posicion 1
		
		//otra forma mas facil y rapida es la siguiente, donde se agrega todo al tiempo
		//int[]num= {1,2,3};
		//y tambien se pueden crear con otro tipo de variable, por ejemplo;
		//String [] nombres = new String [3];
		//nombres [0]= luisa;
		//nombres [1]= morales;
		
		
		//para acceder a los elementos se hace asi
		//int numeros = numeros [0];
	
		
		
	
		
		
		
	}

}
