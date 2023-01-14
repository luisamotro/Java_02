package cl.generationf20220211;

public class EquipoBasquet {

  //la herencia se basa en los datos/atributos compartidos, creando una nueva clase padre que toma los datos repetidos y los compartira
	
	private String Nombre;
	private String Apellido;
	private int Edad;
	
	public EquipoBasquet() {
		super();
	}

	public EquipoBasquet(String nombre, String apellido, int edad) {
		super();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "EquipoBasquet [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + "]";
	}
	
   //creando el metodo
	public void metodoImprimir () {
		System.out.println("Estoy en el metodo de la super clase");
	}
	
	
}
