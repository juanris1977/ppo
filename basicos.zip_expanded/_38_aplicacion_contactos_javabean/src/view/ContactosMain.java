package view;

import java.util.Scanner;

import Service.ContactosService;
import model.Contacto;

/*EJERCICIO AGENDA DE CONTACTOS
1.- Nuevo contactoo
2.- Buscar contacto
3.- Borrar contacto
4.- Mostrar todos los nombres 
5.- Salir

Opción 1: Se solicita el nombre del contacto y su número telefono y se guardará. Si ese número de telefono ya está siendo utilizado, el contacto no se guarda
Opción 2. Se pide el número de teléfono y te muestra el nombre del contacto
Opción 3. Se pide el número de teléfono y se elimina ese contacto*/

public class ContactosMain {
	
	static ContactosService contactoService=new ContactosService(); //notasService es un objeto que manejaremos en todos nuestros métodos
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				nuevoContacto();
				break;
			case 2:
				buscarContacto();
				break;   
			case 3:
				borrarContacto();
				break;
			case 4:
				mostrarNombres();
				break;
			case 5: System.out.println("--- Adios ---");
			}
		}while(opcion!=5);
		
		
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo contacto");
		System.out.println("2.- Buscar contacto");
		System.out.println("3.- Borrar contacto");
		System.out.println("4.- Mostrar nombres");
		System.out.println("5.- Salir"); 
	}	
	
	static void nuevoContacto() {
		int telefono, edad;
		String nombre, email;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es el número de telefono: ");
		telefono=Integer.parseInt(sc.nextLine());
		System.out.println("Cual es el nombre: ");
		nombre=sc.nextLine();
		System.out.println("Cual es el email: ");
		email=sc.nextLine();
		System.out.println("Cual es la edad: ");
		edad=Integer.parseInt(sc.nextLine());
		contactoService.nuevoContacto(telefono, nombre, email, edad);		
		
	}
	
	static void  buscarContacto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qué teléfono quieres buscar?: ");
		int telefono=sc.nextInt();
		Contacto contacto=contactoService.buscarContacto(telefono);
		System.out.println("El contacto asociado al telefono "+telefono+ " es "+contacto.getNombre()+" --> "+contacto.getEmail()+",   "+contacto.getEdad()+ " años.");
		
		
	}
	
	static void  borrarContacto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qué teléfono quieres borrar?: ");
		int telefono=sc.nextInt();
		contactoService.borrarContacto(telefono);
	}
	static void mostrarNombres() {
		String[] nombres=contactoService.mostrarNombres();
		/*for (int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]+ " , ");*/
		
		for (String n: nombres) {
			System.out.println(n);
		}
		
	}
	
}
