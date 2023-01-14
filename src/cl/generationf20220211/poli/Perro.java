package cl.generationf20220211.poli;

public class Perro extends Mascota {

	private String sonido;

	public Perro() {
		super();//vacio
		
	}

	public Perro(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);//atributos de la clase padre
		
	}

	public Perro(String sonido) {
		super();//con mi atributo
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
	@Override
	public void emitirSonido() {
		System.out.println("es sonido es (ladrido) es gauf");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

