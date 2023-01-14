package cl.generationf20220211;

public class Basquetbolista extends EquipoBasquet{
	//la herencia se basa en los datos/atributos compartidos, creando una nueva clase padre que toma los datos repetidos y los compartira
	
	
	private Float altura;
	private Float peso;
	
	public Basquetbolista() {
		super();
	}

	public Basquetbolista(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Basquetbolista [altura=" + altura + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

	//sobreescribir el metodo
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Basquetbolista");
	}
	
	
	

	
	
	
	
}
