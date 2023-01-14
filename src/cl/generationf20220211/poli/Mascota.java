package cl.generationf20220211.poli;

public class Mascota {
     //Atributos comunes entre perro y gato
	private String raza;
	private String nombre;
	private String sexo;
	
	//CONTRUCTORES
	public Mascota() {
		super();
	}

	public Mascota(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	
	//GETTERS Y SETTERS
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	public void emitirSonido() {
		System.out.println("es sonido es...");
	}
	
	//ejemplo polimorfismo parametrico, see sta sobrecargando el metodo
	
	public void horasSiesta() {
		System.out.println("la mascota no duerme");
	}
	
	public void horasSiesta(int horas) {//distinta a la anterior por el int
		System.out.println("la mascota duerme "+horas+" horas");
	}
	public void horasSiesta(float horas) {//distinta a la anterior por el float
		System.out.println("la mascota duerme "+horas+" horas");
	}
	
	
}
