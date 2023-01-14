package cl.generation20221027;

public class InstanciaCliente {

	public static void main(String[] args) {
		
		//5. creamos la instancia (cliente1)
		Cliente cliente1 = new Cliente();
		
		//6.Luego con set, le agregamos los valores que queremos
	    cliente1.setNombre("Luisa");
		cliente1.setApellido("Morales");
		cliente1.setCorreo("Luisamotro14@gmail.com");
		cliente1.setDireccion("Dario pavez 345");
		
		//7.visualizamos individualmente
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.getApellido());
		System.out.println(cliente1.getCorreo());
		System.out.println(cliente1.getDireccion());
		
		//O visualizamos el string completo
		System.out.println(cliente1.toString());	
			
	}
}
