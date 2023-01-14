package cl.generation.estudioautonomo;

import java.util.ArrayList;

public class Arreglos2 {

	public static void main(String[] args) {
		// ArrayList o arreglos dinamicos
		// el espacio de memoria es dinamico
		//estructura basica
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		
		ArrayList<String> Grupo7 = new ArrayList<String>();
		
		//Como agregar valores al ArrayList, es con .add
		Grupo7.add("Luisa");
		Grupo7.add("Luis");
		Grupo7.add("Camilo");
		Grupo7.add("Atenas");
		Grupo7.add("Jonathan");
		System.out.println(Grupo7);
		
		//Para ver el tamaño del arraylist
		//length es para datos estaticos, y size para datos dinamicos
		System.out.println(Grupo7.size());
		
		
		//Como obtener un elemento dentro del arreglo
		Grupo7.get(0);//mostrara lo que hay en la posicion 0
		System.out.println(Grupo7.get(0));
		
		//Como eliminar un elemento dentro del arraylist
		Grupo7.remove(2);
		System.out.println(Grupo7.get(2));//mostrara el de la posicion 1 y se correra la lista mostrando al que estaba en la 2 y la mostrara
		Grupo7.add("Camilo");//si vuelvo a añadir un elemento eliminado, los mostrara de ultimo
		
		//Como recorrer el arraylist
		for (int i = 0; i<Grupo7.size(); i++) {
			System.out.println("Integrante: "+ Grupo7.get(i));//mostrara el i, es decir, los elementos del arraylist
			
		}
		//iterar=recorrer
		//for iterador o for de objeto
		//Para recorrer el arraylist, asociando cada elemento de este con la nueva variable creada llamada integrante
		//la variable integrante se esta creando abajo, y asociando a la grupo7, cada elemnto del grupo 7 es un integrante
		
		for(String Integrante:Grupo7) {//recorre cada uno de los elementos del conjunto
		System.out.println(Integrante);//por eso se imprime, uno por uno de los relatores
		//se ejecuta, hasta que ya no hay nada dentro por recorrer
				
		
	
		}
	}
	
}

