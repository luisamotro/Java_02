package cl.generationf20220211.poli;

public class PoliMain {

	public static void main(String[] args) {
		// POLIMORFISMO
		//significa que se pueden crear clases que pueden tomar muchas formas

		//instancia de la clase mascota
		
		Mascota mascota = new Mascota();
		mascota.emitirSonido();//imprime el metodo creado al final, emitirsonido
		
		//instancia de gato y perro
		
		Perro jerry = new Perro();
		jerry.emitirSonido();
		
		Gato tom = new Gato();
		tom.emitirSonido();
		
		/*________POLIMORFISMO___________*/
		
		//tanto perro y gato, heredan de la clase mascota por tanto, se puede crear variables que se comproten como perros
		//una super clase se comporta como una clase hija, pero no es hija, es solo su comportamiento.
		//el polimorfismo, primero debe existir herencia o jerarquia de clase
		//cuando creamos un polimorfismo puede tener solo los atributos de la clase madre.
		//el objetivo del polimorfismo, es que una clase se comporte como otra para saber su funcionamiento
		
		//polimorfismo parametrico: el metodo se escribe igual pero recibe distintos atributos
		
		System.out.println("_____________");
		
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		
		
		Mascota michi = new Gato();//se comporta como gato, pero no es un gato
		michi.emitirSonido();
		System.out.println(michi.toString());
		
		Mascota niño = new Gato();
		System.out.println(niño.toString());
		
		michi.horasSiesta(3);
	
		
		
		
		
		
		
		
	}

}
