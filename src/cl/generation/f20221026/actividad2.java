package cl.generation.f20221026;

public class actividad2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0f;
		Float estatura = 0f;
		
		do {
			System.out.println("Ingresa tu edad:");
			edad = sc.nextInt();
		} while (edad < 18 || edad > 120); //si el usuario pone una edad menor a 18, el sistema le volverá a pedir la edad
		
		System.out.println("Su edad es: " + edad);
		
		
		
		do {
			System.out.println("Ingresa tu peso:");
			kilos = sc.nextFloat();
		} while (kilos < 40 || kilos > 150); 
		System.out.println("Su peso es: " + kilos);
		
		
		do {
			System.out.println("Ingresa tu estatura:");
			estatura = sc.nextFloat();
		} while (estatura < 1.20 || estatura > 2.70);
		System.out.println("Su estatura es: " + estatura);
		
		sc.close();



	}

}
