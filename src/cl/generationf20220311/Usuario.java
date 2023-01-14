package cl.generationf20220311;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String correo;
	private String contraseña;
	private String apellido;
	private String nick;
	
	
	// permite agregar mas de 2 datos en telefeno
	private  ArrayList <String> telefonos;// permite agregar mas de 2 datos en telefeno

	//ATRIBUTO DE COLABORACION,se crea un objeto aparte porque son detalles no relacionados directamente con el usuario
	//instancia objeto direccion
	//objeto Direccion creado aparte, con nombre direccion
	private Direccion direccion;
	
	public Usuario() {
		super();
		//inicializando la variable del arraylist en el constructor vacio porque en usuario, nos referimos al constructor vacio
		this.telefonos = new ArrayList<String>(); 
	}

	public Usuario(String nombre, String correo, String contraseña, String apellido, String nick,
			ArrayList<String> telefonos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contraseña = contraseña;
		this.apellido = apellido;
		this.nick = nick;
		this.telefonos = telefonos;
		
		
		
	}

	

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public ArrayList<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contraseña=" + contraseña + ", apellido="
				+ apellido + ", nick=" + nick + ", telefonos=" + telefonos + ", direccion=" + direccion + "]";
	}

	

	
	
	
	

}
