package cl.generationf20221102.interfaces;

public abstract class Animal {
	
	private float peso;
	private float altura;
	
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
		}
	//definicion del metodo, te tipo publico que no retorna nada, ni recibe parametros
	//no se implementa/ instancia
	public abstract void metodoEnAnimal();
	
	
	/*public void abstract metodoEnAnimal() {
		System.out.println("Estoy en el metodo de animal");
	}*/
	
	
		
	}


