package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Las variables 
		//En java establecemos el tipo de variable
		
		/*variables primitivas, caracter estatico*/
		
		int numero1 = 2;//variable numerica
		//-2,147,483,648 y el máximo 2,147,483,647 (inclusive).
		
		long numero2 = 2147483648l;//otro tipo
		
		float decimal1= 2.5f;
		float decimal2= (float) 2.5;//castear
		//float trabaja con decimales 
		
		double decimal3= 9.8d;//doble de grande que float
		char caracter= '4';//siempre en 'comillas simples'
		boolean respuesta= true;//false
		
		//short y byte
		
		System.out.println(numero1+" "+ numero2+" "+ decimal1+" "+ decimal2);
		System.out.println(decimal3+" " + caracter + " " + respuesta );
		
		String palabra= "qwerty";//esta no es primitiva, es cadena de caracter
		//palabra
		
		
	
		//variables objeto, tienen mas propiedades
		Integer numero3 = 2;
		//numero2.
		
		Long numero4 = 1234567890L;
		Float numero5 = 456789F; 
		double numero6 = 1234567890D;
		
		
		
		//la letra al final es para convertir un valor numero a un float
		
		Integer inter = 12;
		Long largo = 123456789L;
		Float flotante = 1.5F;
		Double doble = 1.7D;
		
		//de integer a long
		
		largo = Long.valueOf(inter);
		
		System.out.println(largo);

		//de integer a float
		
		flotante = Float.valueOf(inter);
		
		System.out.println(flotante);
		
		//de integer a double 
		
		doble = Double.valueOf(inter);
		
		System.out.println(doble);

		
		
		
		
		

	}

}
