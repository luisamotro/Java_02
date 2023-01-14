package cl.generationActividad2;

public class Directivos extends Colegio {


	private String cargos;
	private int experiencia;
	
	public Directivos() {
		super();
	}
	public Directivos(String cargos, int experiencia) {
		super();
		
		this.cargos = cargos;
		this.experiencia = experiencia;
	}
	
	public String getCargos() {
		return cargos;
	}
	public void setCargos(String cargos) {
		this.cargos = cargos;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Directivos [cargos=" + cargos + ", experiencia=" + experiencia + "]";
	}

	
	
	
	
	
}
