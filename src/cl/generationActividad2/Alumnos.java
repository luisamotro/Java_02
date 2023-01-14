package cl.generationActividad2;

public class Alumnos extends Colegio{

	private String nivel;
	private String curso;
	private Float calificacion;
	
	public Alumnos() {
		super();
	}

	public Alumnos(String nivel, String curso, Float calificacion) {
		super();
		this.nivel = nivel;
		this.curso = curso;
		this.calificacion = calificacion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Float calificacion) {
		this.calificacion = calificacion;
	}

	
	
	
	
}
