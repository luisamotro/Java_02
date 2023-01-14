package cl.generationf20220211;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	// HERENCIA en Java
	//los atirbutos son heredador de la classe padre, aquellos setter donde todos coinciden
	//instanciando objetos= crear variable del tipo de cada objeto, usando el constructor vacio
	
	Entrenador entrenador = new Entrenador();
	entrenador.setNombre("Jhon");
	entrenador.setApellido("Doe");
	entrenador.setEdad(55);
	entrenador.setAniosExperiencia(10);
	entrenador.setEquipo("Valdivia");
		
	System.out.println(entrenador.toString());
	
	//instancia kinesiologo
	
	Kinesiologo kine = new Kinesiologo();
	kine.setNombre("Jane");
	kine.setApellido("Doe");
	kine.setEdad(52);
	kine.setTitulo("kinesiologia");
	kine.setEspecialidad("En musculos");
	
	//instancia basquetbolista
	
	ArrayList<Basquetbolista> listaJugadores = new ArrayList<Basquetbolista>();
	
	Basquetbolista basquet = new Basquetbolista();
	basquet.setNombre("Juan");
	basquet.setApellido("Morales");
	basquet.setAltura(1.80f);
	
	listaJugadores.add(basquet);//agregando un objeto a la lista 

	Basquetbolista basquet2 = new Basquetbolista();
	basquet2.setNombre("Maria");
	basquet2.setApellido("Perez");
	basquet2.setAltura(1.78f);
	
	listaJugadores.add(basquet2);//agregando el objeto 2 a la lista
	
	//para recorrer la lista
	//for (tipo variable nombre variable : lista a recorrer)
	for (Basquetbolista basquetbolista : listaJugadores) {
		System.out.println(basquetbolista.toString());
	}
	
	//sino hemos creado el metodo to striing en cada objeto, se imprimira el de la la clase padre
	
	entrenador.metodoImprimir();
	kine.metodoImprimir();
	basquet.metodoImprimir();
	
	//instancia clase nieta ayudante
	Ayudante ayudante = new Ayudante();
	ayudante.metodoImprimir();
	
	
	
	
	
	
	
	}

}
