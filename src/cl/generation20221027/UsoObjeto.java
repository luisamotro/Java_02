package cl.generation20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clase, creacion de clase 
		// creacion de una variable auto de tipo auto
		Auto auto1 = new Auto();//estamos creando una refencia, es una cajita donde vamos a agregar datos 
		//el objetivo es crear algo y llenarlo de daots para finalmente llevarlo a la base de datos
		//va a depender de la cantidad
		
		//auto1.color="rojo";
		
		//asignar valores a los atributos utilizamos el set
		//solo a traves del metodo setter
		//los setter pueden cambiar
		auto1.setColor("rojo");//ponerle el color rojo
		auto1.setMarca("ford");//ponerle la marca
		
		//saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		System.out.println(auto1.getColor());//muestra el color, junto con el syso
		System.out.println(auto1.getMarca());
		


	}

}
