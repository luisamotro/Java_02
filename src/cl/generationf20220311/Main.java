package cl.generationf20220311;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// obejtos de colaboracion
		
		Usuario usuario = new Usuario();
		
		//se crea un arrray list que permita agregar mas telefonos
		/*ArrayList <String> telefono = new ArrayList <String>();
		
		String telefonito = "123456789";
		telefono.add(telefonito);
		telefono.add("543452342");
		
		
		usuario.setTelefonos(telefono);
		System.out.println(telefono);
		
		System.out.println(usuario.getTelefonos());*/
		
		
		//otra opcion para agregar varios telefonos

		
		//el get trae el tipo de dato del objeto arreglo (telefonos)
		//se añade con add, datos al array telefonos(arreglo.add)
		usuario.getTelefonos().add("12345");
		usuario.getTelefonos().add("23456");
		usuario.getTelefonos().add("34567");
		//muestra el array completo
		System.out.println(usuario.getTelefonos());
		
		Direccion direccion = new Direccion();
		direccion.setCalle("pedro");
		direccion.setNumero("123");
		direccion.setSector("juan");
		direccion.setCiudad("santiago");
		direccion.setRegion("metropolitana");
		usuario.setDireccion(direccion);//pasando al usuario el objeto direccion
		
		System.out.println(usuario.getDireccion().toString());
		
	
	}

}
