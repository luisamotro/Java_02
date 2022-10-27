package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// Set o HashSet
		//Otro tipo de arreglo dinamico
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		
		HashSet<String> relatores = new HashSet<String>();
		
		// agregar elemento al arreglo
		// no permite elementos dublicados ni les asigna un orden
		relatores.add("alejandro");
		relatores.add("andrea");
		relatores.add("laura");
		relatores.add("pamela");
		System.out.println(relatores);
		
		//verificar el contenido del arreglo
		boolean verificacionNombre = relatores.contains("pamela");
		System.out.println("existe el relator?"+ verificacionNombre);
		
		//eliminar un elemento dentro del array
		relatores.remove("laura");
		System.out.println(relatores);
		
		//tamaño del arreglo 
		System.out.println("tamaño");
		

		
		


	}

}
