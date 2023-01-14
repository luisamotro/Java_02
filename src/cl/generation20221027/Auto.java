package cl.generation20221027;

public class Auto {
	//los objetos en java son aquellos a los que le damos caracteristicas y funciones
	//cuando creamos la clase es el prototipo del objeto
	//herencia, pilar fundamental de java, creamos un objeto que es comun para todos
	//Encapsulamineto = googlear!!!
	
	//ATRIBUTOS:(marca, color, modelo,etc) se le asigna un tipo de dato.
	//private: porque son de un mismo objeto y determina si se puede o no acceder a ese valor
	//se define el tipo de dato (atributo), si es marca, string si es numero decimal, float, etc
	//por ultimo el atributo
	
	private String marca;//"Nissan"
	private String color;//"Negro"
	private String modelo;//"ñuñuki"
	private Float cilindrada;//1.6 0 2.4
	private Float rendimiento;//10.5 (km/lt)
	private Float velocidad;//km/h
	
	//CONSTRUTOR:
	//Nos permite instanciar al objeto e inicializar los atributos 
		
	public Auto() {//constructor publico, llamado igual que la clase
		super();
	}

		public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}//igual al de arriba, solo que recibiendo los atributos
		
		

	//getters y setters (accesador y mutador)
	//con getter, se accede al valor del atributo
	//con setter, se cambia 
		

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public Float getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(Float cilindrada) {
			this.cilindrada = cilindrada;
		}

		public Float getRendimiento() {
			return rendimiento;
		}

		public void setRendimiento(Float rendimiento) {
			this.rendimiento = rendimiento;
		}

		public Float getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(Float velocidad) {
			this.velocidad = velocidad;
		}

	
	//metodos del objeto (acciones)
		
		public void avanzar() {
			System.out.println("Estoy en el metodo avanzar del objeto");
		}

		@Override//el metodo/funcion to string retorna una string
		public String toString() {
			return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
					+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
		}//este metodo le estamos heredando, el auto hereda de la clase objeto, el metood to string
		//donde imprima marca, se imprimira el contenido de marca, etc
		//esto es para consultar los datos 
	}
		

	



