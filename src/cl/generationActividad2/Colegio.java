package cl.generationActividad2;

public class Colegio {


		private String nombre;
		private String apellido;
		private int edad;
		
		public Colegio() {
			super();
		}

		public Colegio(String nombre, String apellido, int edad) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
		}

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

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Colegio [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
		}
		
		
		
		
		
		
	
}

	
	
	
	

