package cl.generation.f20221024;

import java.util.Arrays;

public class arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arreglos/array en java
		//Estaticos: no cambia el tamaño del arreglo
		int[] arreglo= new int[3];
		//arreglo.length;tamaño del arreglo 
		//arreglo de tipo entero
		//no permite mezclar tipos de datos 
		//el dato si o si tiene que ser numerico 	
		
		//como crear un arreglo?
		//Tipo_de_variable[] Nombre_del_array = new  Tipo_de_variable[dimensión];
			
		//agregar datos 
		arreglo[0]=4;
		arreglo[1]=5;
		arreglo[2]=6;
		//arreglo[3]=7;error fuera de indice, max 3
		
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));//para ver el contenido del arreglo
		System.out.println(arreglo[0]);//para mostrar el elemento
		
		int[] sinNumeros = {};//cero elementos por definicion
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78;para unarreglo vacio no se puede
		System.out.println(Arrays.toString(sinNumeros));
		//para asignar valores a los arreglos se usa [[
		
		String[] vocales = {"a","e","i","o","u"};
		System.out.println("cantidad de elementos "+vocales.length);
		vocales[1]="o";
		vocales[3]="e";
		vocales[2]="y";
		
		//crear un array de numeros flotantes de tamaño 6
		float[] numeros = new float [6];
		
		//agregar 6 elementos al arreglo
		numeros [0]= 11;//decimal, porque es flotante
		numeros [1]= 12;//si no, el sistema pone el 0 (12.0) por default
		numeros [2]= 13;//trae el .0 implicito
		numeros [3]= 14;
		numeros [4]= 15;
		numeros [5]= 16;
		numeros [6]= -17;//los negativos son flotantes 
		
		
		//crear arreglo de enteros tamaño 100 y agregar valores dinamicamente desde el 1 al 100
		int[] numeros = new int [100];//el 100 es el tamaño, dimension que uno le asigna 
		for (int i = 0; i < numeros.length; i = i + 1); {
			numeros[i] = i+1;
		}
		System.out.println(Arrays.toString(numeros));
			
		//crear arreglo pero agregar valores del 100 al 1
		int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for(int i =arreglo100a1.length; i>0  ;i-- ) {
			arreglo100a1[arreglo100a1.length - i]= i;
		}
		//Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
		int[] arr = new int [10]
				
		//2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		Para el mismo arreglo, sacar el promedio de los números.
		
	
		
		
		
		
		
				
		
		
		
		
		
		
		
	
	
	
	}
}
