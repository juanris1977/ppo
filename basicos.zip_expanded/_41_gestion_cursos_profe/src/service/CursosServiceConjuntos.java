package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import model.Curso;
/*
1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Mostrar todos los cursos
7.- Salir
*/
public class CursosServiceConjuntos {

	HashSet <Curso> cursos = new HashSet <>();   // Creamos un hashset (conjunto) para guardar los cursos
	
	public boolean añadirCurso(Curso curso) {
		
		for(Curso c: cursos) {
			if(c.getNombre().equalsIgnoreCase(curso.getNombre())) {
				return false;				
			} 	
		}		
		cursos.add(curso);	
		return true;
		/*boolean resultado= true;
		cursos.forEach(c -> {
						if(c.getNombre().equalsIgnoreCase(curso.getNombre())) {
						resultado = false;	// en una lambda no se pueden modificar variables locales	
						} 
			
							}
					  );
		if (resultado) {
			cursos.add(curso);
		}
		return resultado;*/
					
	}
	
	
	public Curso buscarCurso(String cursobuscado ) {
		Curso res = null;
		
		/*for(Curso c : cursos) {
			if (c.getNombre().equalsIgnoreCase(cursobuscado)) {
				res = c;
				break;
			}
		}*/
		cursos.forEach(null);
		
		return res;
	}
	
	public double duracionMedia() {
		double media=0;
		
		for (Curso c : cursos) {
			media=media+c.getDuracion();			
		}
		
		return media/cursos.size() ;
		
		
	}
	
	public List<Curso> cursosTematica(String tematica) {
		
		List<Curso> res =  new ArrayList<>();
		
		// quiero devolver un arraylist  de nombres de cursos con esa tematica 
		for (Curso c : cursos) {
			if (c.getTematica().equalsIgnoreCase(tematica)) {
				res.add(c);
			}
		}
		return res;
		
	}
	
	public void  eliminarCurso(int precio) {
		
		/*for (Curso c: cursos) {
			if (c.getPrecio() > precio) {
				cursos.remove(c);
				
			}
		}*/
		
		cursos.removeIf( c -> c.getPrecio() > precio);  // removeif necesita un predicado
		// el predicado lo creamos con una lambda
		
	}

	
	public ArrayList<Curso>  mostrarTodos () {
		 ArrayList<Curso> res = new ArrayList<>();
		 for (Curso c: cursos) {
			 res.add(c);
			
		}
	return res;	 
	}
}
