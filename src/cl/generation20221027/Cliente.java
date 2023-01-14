package cl.generation20221027;

public class Cliente {
//ACTIVIDAD DE CLASE

	//1. se determinan los atributos
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	
	//2.luego los constructores, uno vacio y el otro con atributos para darles su valor
	public Cliente() {
		super();
	}


	public Cliente(String nombre, String apellido, String correo, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
	}
	
	//3.luego los getters y setters, para cambiar el null por el valor
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//4.Luego generamos el toString para que se muestre completo
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion="
				+ direccion + "]";
	}
	
	
	
	


	
	
	

	
	
	
	
	
	
}
