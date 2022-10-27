package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		// capturar datos ingresados por el usuario
		
		Scanner scanner = new Scanner(System.in);//variable de tipo scanner llamada scanner, para capturar un dato
		//calculo del IMC;
		//imc=kilos/(estatura*estatura)
		System.out.println("ingrese su peso en kilogramos");//para pedir datos en Java
		Float peso = peso = scanner.nextFloat();//capturar la info del flotante
		System.out.println();
		System.out.println("el peso es:" +peso);
		
		System.out.println("ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		System.out.println("la estatura del paciente es:" + estatura);
		
		Float Imc = peso/(estatura*estatura);
		System.out.println("su Imc es:"+Imc);
		
		
		scanner.close();//para que termine de esuchar o esperar que se le diga que llame al dato
		return Imc;
	
	}

	public static void nivelImc(Float Imc) {
		
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		if (Imc < 18.5F) {
			System.out.println("el paciente esta bajo peso");{
			}else if(Imc=> 18.5f && Imc < 25){
				System.out.println("el paciente esta en el rango normal");
	
			}else if (Imc >=25F && Imc < 30) {
				System.out.println("El paciente esta en el rango sobre peso");
			}else {
				
			}
			
		}

	}
	
	
	
	
	
}
