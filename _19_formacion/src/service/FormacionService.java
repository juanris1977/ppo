package service;

import java.util.List;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;

public class FormacionService {
	private static List<Curso> cursos=List.of(new Curso("Java for dummies",50,List.of(			
																new Alumno("alumno1",25,7),
																new Alumno("alumno2",32,2),
																new Alumno("alumno3",19,8)
																)),
											new Curso("Spring",60,List.of(			
																		new Alumno("alumno5",18,6.9),
																		new Alumno("alumno4",40,3.2),
																		new Alumno("alumno8",28,6)
																		)),
											new Curso("JavaScript",75,List.of(			
																		new Alumno("alumno2",32,7.1),
																		new Alumno("alumno4",40,8.3),
																		new Alumno("alumno7",33,4)
																		))

											);
	
	
	//  duracion media de todos los cursos	
	public double duracionMedia () {
		return  
				cursos.stream()
				     .collect(Collectors.averagingDouble(c ->c.duracion()));
	}
	
	// Lista de cursos con un numero de alumnos inferior a un determinado valor	
	public List<Curso> alumnosPorCurso (int valor) {
		return 
			cursos.stream()
				  .filter(c -> c.matriculas().size() <= valor)
				  .collect(Collectors.toList());
				  
	}
	
	// edad media del curso con una determinada denominacion	
	public double edadMedia (String denominacion) {
		return 
			cursos.stream()     //  Streams<Curso>
			      .filter(c -> c.denominacion().equalsIgnoreCase(denominacion))  // stream Curso filtrado
			      .flatMap(c -> c.matriculas().stream())   //stream de  alumnos
				  .collect(Collectors.averagingDouble(a -> a.edad()));
			    
			     
		}

	
	// Lista de nombres de alumnos
	public List<String> nombresAlumnos () {
		return 
			cursos.stream()
			      .flatMap(c -> c.matriculas().stream().map(a -> a.Nombre()))			     
			      .distinct()
			      .toList();
	}
	
	
	// nota media de todos los cursos
	public double notaMedia() {
		return 
			cursos.stream()  //Stream de Curso
			      .flatMap(c -> c.matriculas().stream())  // Stream de Alumno
			      .collect(Collectors.averagingDouble(a->a.nota()));
			      
			
	}
	
	// Lista de alumnos aprobados
	public List<Alumno> alumnosAprobados () {
		return cursos.stream()
			         .flatMap(c -> c.matriculas().stream()) 
			         .filter(c -> c.nota() >=5)
			       //  .collect(Collectors.toList());     
					.toList();
	}
	//Lista de nombrers de cursos
		public List<String> nombresCursos () {
			return 
				cursos.stream()
				      .map(c-> c.denominacion())
				      .toList();				      
		}
		
	//nota media del curso de una determinada denominacion
	public double notaMediaCurso(String denominacion) {
	
		return 
			cursos.stream()
			      .filter(c -> c.denominacion().equalsIgnoreCase(denominacion))
			      .flatMap(c -> c.matriculas().stream())  // Stream de Alumno
			      .collect(Collectors.averagingDouble(a->a.nota()));
		}
	
	//Lista de alumnos de un curso de una determinada denomincacion 
	
	public List<Alumno> listaAlumnos (String denominacion) {
		return 
			cursos.stream()
			.filter(c -> c.denominacion().equalsIgnoreCase(denominacion))
		    .flatMap(c -> c.matriculas().stream())  // Stream de Alumno		   
		    .toList();		     
	}

}
