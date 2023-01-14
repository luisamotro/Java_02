package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		//doWhile
		// alo menos se ejecuta una vez
		
		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		
		do {
			
			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();
			
		} while (edad < 18);
		
		System.out.println(edad);
		
		scanner.close();
	}

}
