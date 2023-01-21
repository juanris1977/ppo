package view;

//comentario
import java.util.Scanner;

import service.NotasService;  //  Para poder usar los métodos de la otra clase, tenemos que importarla 

public class NotasMain {

	static NotasService notasService=new NotasService(); //notasService es un objeto que manejaremos en todos nuestros métodos
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		int opcion;
		
		do {
			mostrarMenu();
			opcion=sc.nextInt();  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				pedirNota();
				break;
			case 2:
				mostrarMedia();
				break;   
			case 3:
				mostrarAprobados();
				break;			
			case 4:
				mostrarExtremas();
				break;
			case 5: 
				mostrarTodas();
				break;
			case 6:
				eliminarSuspensos();
				break;
			case 7:
				subirNotas();
				break;
				
				
			}
		}while(opcion!=8);
	}
	
	static void mostrarMenu() {
		System.out.println("1.- Grabar nota");
		System.out.println("2.- Calcular media");
		System.out.println("3.- Aprobados");
		System.out.println("4.- Notas extremas");
		System.out.println("5.- Mostrar todas");
		System.out.println("6.- Eliminar suspensos");
		System.out.println("7.- Subir notas");
		System.out.println("8.- Salir"); 
	}
	
	static void pedirNota() {
		Scanner sc = new Scanner(System.in);
		double nota;
		System.out.println("Introduce nota: ");
		nota = sc.nextDouble();
		notasService.guardarNota(nota);
	}
	
	static void mostrarMedia() {
		System.out.println("La media es: "+notasService.media());
	
	}
	
	static void mostrarAprobados() {
		System.out.println("Aprobados: "+ notasService.aprobados());
	}
	
	static void mostrarExtremas() {
		System.out.println("Nota máxima: "+ notasService.notaMax());
		System.out.println("Nota mínima: "+ notasService.notaMin());
		
	}
	
	static void mostrarTodas() {

		double[] notas=notasService.notas();
		System.out.println("Las notas introducidas son: ");
		for (int i=0;i<notas.length; i++) {
			System.out.print(notas[i]+" ");
		}
		System.out.println();
	}
	static void eliminarSuspensos() {
		notasService.eliminarSuspensos();
		System.out.println("Hemos eliminado los suspensos");
			
		}
	static void subirNotas() {
		notasService.subirNotas();
	}
	
}
