package service;

import java.util.ArrayList;
import java.util.HashSet;
import model.Curso;

public class CursoService {
	
	HashSet <Curso> cursos = new HashSet<>();
	
	public  void añadirCurso(String nombre, String categoria, double precio, int duracion ) {
		 cursos.add(new Curso(nombre,categoria,precio,duracion));		
	}
	
	public Curso cursoMasCaro() {
		Curso c= null;
		double mascaro= 0;
		for (Curso z: cursos) {
			if (z.getPrecio()>mascaro) {
				c= z;
				mascaro=z.getPrecio();
			}			
		}				
		return c;		
	}
	
	public ArrayList<Curso>  cursosCategoria(String categoria) {
		
		ArrayList<Curso> c = new ArrayList<>();
		for (Curso z: cursos) {
			if (z.getCategoria().equalsIgnoreCase(categoria)) {
				c.add(z);
			}
		}
		return c;
	}
	
	public ArrayList<Curso> actualizarDuracion(int duracion) {
		ArrayList<Curso> c = new ArrayList<>();
		for (Curso z: cursos) {
			if (z.getDuracion()>duracion) {
				z.setDuracion(z.getDuracion()-(10*z.getDuracion()/100));
				c.add(z);
			}
		}
		return c;
		
	}
	
	public ArrayList<Curso> mostrarTodos () {
		ArrayList<Curso> c = new ArrayList<>();
		for (Curso z: cursos) {
			c.add(z);
		}
		return c;
	}
	public boolean existeCurso(String cursobuscado ) {
		boolean existe=false;
		
		for(Curso c : cursos) {
			if (c.getNombre().equalsIgnoreCase(cursobuscado)) {
				existe=true;
				break;
			}
		}
		
		return existe;
	}
}
