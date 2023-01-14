package cl.generation.estudioautonomo;

import java.util.Scanner;

public class BucleDoWhile1 {

	public static void main(String[] args) {
		//DO WHILE
		//Este ciclo ejecutará el bloque de código una vez, antes de verificar si la condición es verdadera,
		//luego repetirá el ciclo mientras la condición sea verdadera.
		
		/*do {
			  // se ejecutara una primera vez y luego saldra a ver si la condicion es correcta.
			}
		   while (condition);*/
		
		//EJEMPLO
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i <= 5);
			

	}

}
