package cl.generationActividad2;

public class Profesores extends Colegio {

	private String materia;
	private String titulo;
	
	public Profesores() {
		super();
	}

	public Profesores(String materia, String titulo) {
		super();
		this.materia = materia;
		this.titulo = titulo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
	
	
}
