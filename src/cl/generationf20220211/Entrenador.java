package cl.generationf20220211;

public class Entrenador extends EquipoBasquet{

	//extends + "la clase comun" es la herencia
	
	private int aniosExperiencia;
	private String equipo;
	
	public Entrenador() {
		super();
	}
	

	public Entrenador(String nombre, String apellido, int edad, int aniosExperiencia, String equipo) {
		super(nombre, apellido, edad);//se pasan atributos comunos y los no comunes a la super clase
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}


	public Entrenador(int aniosExperiencia, String equipo) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.equipo = equipo;
	}
	

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [aniosExperiencia=" + aniosExperiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

	/*public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija entrenador");
	}*/
	
	
	

	
	

	

	
	
	
}
