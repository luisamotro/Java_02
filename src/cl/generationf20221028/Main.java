package cl.generationf20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Estudiante estudiante = new Estudiante("Luisa","Morales","26033130-2");
		/aqui se esta usando solo el constructor con 3 datos, para agregar el resto despues
		/System.out.println(estudiante.toString());
		/estudiante.setEdad(20);
		estudiante.setCorreo("l@gmailcom");
		estudiante.setCurso("1A");
		System.out.println(estudiante.toString());*/
		
		//EJERCICIO 
		//creamos scanner para que se ingresen y guarden los datos 
		Scanner sc = new Scanner(System.in);
		
		//primero definir el arreglo en un arraylist
		//<Estudiante> no es un tipo de dato sino un objeto, es decir un arreglo de tipo estudiante  
		ArrayList<Estudiante> lista_estudiantes= new ArrayList<Estudiante>();//arreglo de estudiantes
		
		int continuar = 2;//variable de control para ver si sigue el ciclo o no
		
		do {//en el while se creara una instancia por cada objeto
			
			System.out.println("Ingrese el nombre del estudiante");//solicitamos los datos
			String nombre = sc.nextLine();//guardar los datos 
			
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			
			Estudiante estudiante = new Estudiante();//creamos la instancia para guardar los datos que ingresaron
			
			//asignando valor a los atributos
			estudiante.setNombre(nombre);//se agrega el valor al atributo
			estudiante.setApellido(apellido);
			
			//aqui se agrega un objeto al arraylist estudinate
			lista_estudiantes.add(estudiante);//al arreglo estudiantes, se agrega datos del estudiante
		
			System.out.println("quiere agregar otro estudiante");//solicitamos un limite
			System.out.println("(1) SI  (2) NO");//damos opciones
			continuar = sc.nextInt();//la opcion se guarda aqui
			
			sc.nextLine();//corrige el error de pedir un numero y luego  pide un string
			
		}while(continuar == 1);//si aprieta el 1, se repetira, cualquier otro numero lo detiene
		
		//Para mostrar a todos los estudiantes
		for (Estudiante alumno: lista_estudiantes){//for de objeto, (tipo de dato luego  la variable : arreglo que recorreremos) 
			System.out.println("nombre: "+alumno.getNombre());
			System.out.println("apellido: "+alumno.getApellido());
		}
		
		//Obtener un estudiante especifico por posicion
		lista_estudiantes.get(1);//se mostrara el objeto en la pocision 0
		
		//Accedemos a un atributo de un objeto en especifico
		lista_estudiantes.get(1).getNombre();//para acceder a un atributo en especifico
		System.out.println("Nombre del estudiante 2; "+lista_estudiantes.get(1).getNombre());
		System.out.println(lista_estudiantes.toString());
	
	
		
		
		
		
		
	
	}

}
