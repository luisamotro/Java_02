package cl.generation.f20221025;
import java.util.HashMap;
public class ArregloHashMapTest {

	public static void main(String[] args) {
		// HashMap
		//llave, valor (key,value)
		HashMap<Integer,String> relatores = new HashMap<Integer,String>();
		
		//Agregar valor al map
		relatores.put(11, "Alejandro");//numero=clave
		relatores.put(2, "Andrea");
		relatores.put(33, "Laura");
		relatores.put(4, "Pamela");
		relatores.put(4, "Pamela");
		relatores.put(11, "Israel");//si existe esa clave, sobre escribe el valor
		
		//Tamaño del map
		System.out.println(relatores.size());
		
		//acceder a un dato atraves de la clave
		System.out.println(relatores.get(33));
		
		// acceder a un dato a traves de la clave
		System.out.println("map"+relatores);
		
		//recorremos un map
		/*for (Map.Entry<keyType, valType> entry : map.entrySet()) {
		keyType key = entry.getKey();
		valType val = entry.getValue();
		}
		*/

		for(Integer clave: relatores.keySet()) {//saca la clave
			System.out.println("clave"+clave);
			System.out.println("clave "+clave+" valor "+relatores.get(clave));

		}
			
		
		
		
		
		

	}

}
