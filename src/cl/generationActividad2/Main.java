package cl.generationActividad2;

import java.util.ArrayList;

import cl.generationf20220211.Basquetbolista;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Directivos> admin = new ArrayList <Directivos>();
		Directivos directivo1 = new Directivos();
		directivo1.setNombre("Juanito");
		directivo1.setApellido("perez");
		directivo1.setEdad(40);
		directivo1.setCargos("Director");
		directivo1.setExperiencia(6);
		
		admin.add(directivo1);
		
		Directivos directivo2 = new Directivos();
		directivo2.setNombre("pedro");
		directivo2.setApellido("ramirez");
		directivo2.setEdad(39);
		directivo2.setCargos("SubDirector");
		directivo2.setExperiencia(5);
		
		admin.add(directivo2);
		
		Directivos directivo3 = new Directivos();
		directivo3.setNombre("Juana");
		directivo3.setApellido("Lira");
		directivo3.setEdad(35);
		directivo3.setCargos("secretaria");
		directivo3.setExperiencia(5);
		
		admin.add(directivo3);
		
		for (Directivos directivo : admin) {
			System.out.println(admin.toString());
		}
		
		ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
		Alumno alumnos = new Alumnos;
	}

}
