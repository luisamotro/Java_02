package cl.generation.f20221025;

import java.util.ArrayList;

public class arreglosdinamicos {

	public static void main(String[] args) {
		//ArrayList
		//Definicion
		 
		
		ArrayList<String> relatores = new ArrayList<String>();
		
		//Agregar valores al arreglo
		
		relatores.add("Luisa");//elemento 0
		relatores.add("Maria");//elemento 1
		relatores.add("Morales");//elemento 2
		relatores.add("Troncoso");//elemento 3
		System.out.println(relatores);
		
		//Para el tamaño del arraylist
		System.out.println(relatores.size());
		/*length, para arreglos estaticos, size para arreglos dinamicos*/
		
		//Para obtener un elemento del arreglo seria
		System.out.println(relatores.get(3));
		//System.out.println(relatores.get(7));fuera de indice
		
		//Eliminar  un elemento dentro del array
		relatores.remove(3);
		System.out.println(relatores);
		
		//Para recorrer el array
		for(int i=0 ; i<relatores.size();i++) {
			//relatores[i]; en array estaticos 
			System.out.println("relatores"+relatores.get(i));
		}
		System.out.println("-----------------------");
		
		//for iterador o for de objeto
		for(String relator:relatores) {//recorre cada uno de los elementos del conjunto
			System.out.println(relator);//por eso se imprime, uno por uno de los relatores
        //se ejecuta, hasta que ya no hay nada dentro por recorrer
		
		}
	
		
	
	
	
	

	
	
	
	
	
	}

}
