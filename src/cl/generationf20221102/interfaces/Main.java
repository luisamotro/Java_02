package cl.generationf20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		//Interfaces y clases abstractas
		//las clases abtractas: se definen solo los atributos y metodos abstractos(no tienen especificaciones), que se implementan solo donde heredemos esa clase
		//Interfaces: solo se definen metodos 
		//no se pueden implementar o instanciar 


		/*Animal animal = new Animal() {	
		}*///no se pueden instanciar clases abstractas
		
		//
		Caballo caballo = new Caballo();
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		Leon leon = new Leon();
		leon.setAltura(1.5f);
		leon.setPeso(50.0f);
		
		//imprimir valores setteados
		
		System.out.println("Altura "+leon.getAltura());
		System.out.println("Peso "+leon.getPeso());
		
		
		
	}

}
