package cl.generation20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		//Instancia de clase, es la referencia a un objeto, le damos las caracteristicas
		//(se crea esta clase solo  para instaciar el objeto, la clase auto es la creacion del objeto)
		//Es la creacion de una variable auto de tipo auto
		
		Auto auto1 = new Auto();//Inicializando, estamos creando una refencia, es una cajita donde vamos a agregar datos, el parentesis es el constructor vacio d eauto
		//Auto:metodo, auto1:nombre de la variable
		//el constructor vacio (parentesis vacio) es para agregar los datos posteriomente, es el espacio donde se agrega
		//auto1.color="rojo";//no se puede ver porque el artirbuto es privado
		
		//ASIGNAR VALORES A LOS ATRIBUTOS PRIVADOS 
		//utilizamos el set, solo a traves del metodo setter
		//los setter cambian el null, por el valor que le queremos dar a cada atributo
		
		auto1.setColor("rojo");//ponerle el color que quiero en el parentesis
		auto1.setMarca("ford");//ponerle la marca que quiero ene l parentesis
		auto1.setModelo("Ñuñuki");
		
		
		//COMO SABER EL CONTENIDO DE LOS ATRIBUTOS completo, el toString
		System.out.println(auto1.toString());
		
		//COMO CAPTURAR CADA CONTENIDO DE LOS ATRIBUTOS, individualmente
		System.out.println(auto1.getColor());//muestra el color que asignamos
		System.out.println(auto1.getMarca());//muestra la marca asignada
		System.out.println(auto1.getModelo());
		
		//Nueva instancia de auto 
		Auto car = new Auto("Nissan","Negro","asdf",1.5f,10.7f,123f);{
			//le agregammos la informacion del constructor enseguida
			System.out.println(car.toString());
			System.err.println(car.getColor());
		}
		//Llenar la instancia enseguida, o de apoco, depende del constructor, es decir, si el constructor es vacio, se puede agregar en cualquier momento, pero el otro se llena enseguida.
		
	



	}

}
