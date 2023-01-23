package main;

import java.util.List;

import model.Alumno;
import model.Curso;
import service.FormacionService;

public class Test {
	static FormacionService service = new FormacionService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Duracion Media Cursos: "+ service.duracionMedia());
		
		System.out.println("Edad Media: " + service.edadMedia("Spring"));
		
		System.out.println(service.alumnosPorCurso(3));
		
		System.out.println("Nombres: "+ service.nombresAlumnos());
		
		System.out.println("Nota media: " + service.notaMedia());
		
		System.out.println("Aprobados: " + service.alumnosAprobados());
		
	}

}
