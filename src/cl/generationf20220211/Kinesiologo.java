package cl.generationf20220211;

public class Kinesiologo extends EquipoBasquet{

	
	private String titulo;
	private String especialidad;
	
	public Kinesiologo() {
		super();
	}

	public Kinesiologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

	@Override
	public String toString() {
		return "Kinesiologo [titulo=" + titulo + ", especialidad=" + especialidad + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

	public void metodoImprimir () {
		System.out.println("Estoy en el metodo de la clase hija kine");
	}
	
	
	
	
}
