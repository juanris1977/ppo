package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Curso;
import service.CursoService;

public class CursosMain {

	static CursoService service = new CursoService(); 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		int opcion;
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				añadirCurso();
				break;
			case 2:
				cursoMasCaro();
				break;   
			case 3:
				cursosCategoria();
				break;
			case 4:
				actualizarDuracion();
				break;
			case 5:
				mostrarTodos();
				break;
			case 6:
				System.out.println("--- Adios ---");
				break;
			}
		}while(opcion!=6);
	}
	static void mostrarMenu() {

		System.out.println();
		System.out.println("1.- Añadir curso ");
		System.out.println("2.- Buscar curso más caro");
		System.out.println("3.- Cursos por categoría");
		System.out.println("4.- Actualizar duración");
		System.out.println("5.- Mostrar todos");
		System.out.println("6.- Salir ");
	}
	
	static void añadirCurso() {
		String nombre= null;
		String categoria = null;
		double precio= 0;
		int duracion= 0;
		
		System.out.println("Introduce el nombre del curso: ");
		nombre= sc.nextLine();
		while (service.existeCurso(nombre)) {
			System.out.println("Ya existe un curso con ese nombre, introduce otro nombre: ");
			nombre= sc.nextLine();
		}
		System.out.println("Introduce la categoria del curso: ");
		categoria = sc.nextLine();
		System.out.println("Introduce el precio: ");
		precio=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la duracion: ");
		duracion=Integer.parseInt(sc.nextLine());
		service.añadirCurso(nombre, categoria, precio, duracion);
	}
	static void cursoMasCaro() {
		Curso  c = service.cursoMasCaro();
		System.out.println("Con un precio de "+c.getPrecio()+" euros, el curso llamado "+c.getNombre()+" sobre "+c.getCategoria()+" es el más caro.");
	}
	static void cursosCategoria() {
		
		System.out.println("Elige una categoria de cursos y te muestro los que hay: ");
		String cat = sc.nextLine();
		ArrayList<Curso> cur = service.cursosCategoria(cat);
		if (cur.size()==0) {
			System.out.println("No hay cursos en la categoria "+cat);
			System.out.println();
		}
		else {
			System.out.println("Hay "+cur.size()+ " curso(s) en esa categoria:");
			for (Curso z : cur) {
				System.out.println(z.getNombre()+ " de "+z.getCategoria()+" con un precio de "+z.getPrecio()+ " y duracion de "+z.getDuracion()+" horas.");
			}
		}
	}
	static void actualizarDuracion() {
		System.out.println("Dime la duración por encima de la cual, reduciré la duracion en un 10%: ");
		ArrayList<Curso> cur= service.actualizarDuracion(Integer.parseInt(sc.nextLine()));
		System.out.println("Se ha actualizado la duración de : "+ cur.size() + " cursos: "); 
		for (Curso z : cur) {
			System.out.println(z.getNombre()+ "de "+z.getCategoria()+" con un precio de "+z.getPrecio()+ " y duracion después de la reducción de "+z.getDuracion()+" horas.");
		}
	}
	static void mostrarTodos() {
		ArrayList<Curso> cur = service.mostrarTodos();
		for (Curso z : cur) {
			System.out.println(z.getNombre()+ " de "+z.getCategoria()+" con un precio de "+z.getPrecio()+ " y duracion de "+z.getDuracion()+" horas.");
		}
	}
}
