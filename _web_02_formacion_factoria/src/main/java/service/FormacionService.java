package service;

import java.util.List;

import model.Alumno;
import model.Curso;

public interface FormacionService {

	//  duracion media de todos los cursos	
	double duracionMedia();

	// Lista de cursos con un numero de alumnos inferior a un determinado valor	
	List<Curso> alumnosPorCurso(int valor);

	// edad media del curso con una determinada denominacion	
	double edadMedia(String denominacion);

	// Lista de nombres de alumnos
	List<String> nombresAlumnos();

	// nota media de todos los cursos
	double notaMedia();

	// Lista de alumnos aprobados
	List<Alumno> alumnosAprobados();

	//Lista de nombrers de cursos
	List<String> nombresCursos();

	//nota media del curso de una determinada denominacion
	double notaMediaCurso(String denominacion);

	List<Alumno> listaAlumnos(String denominacion);

}