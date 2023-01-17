package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Producto;
import service.ServiceProductos;

public class ProductosView {
	static ServiceProductos service = new ServiceProductos();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
				opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
				switch(opcion) {      // evaluamos
				case 1:
					añadirProducto();
					break;
				case 2:
					subirPrecio();
					break;   
				case 3:
					ordenarPrecio();
					break;
				case 4:
					eliminarProductos();
					break;
				case 5:
					subirPrecioCategoria();
					break;
				case 6:
					mostrarProductos();
					break;
				
				case 7: System.out.println("--- Adios ---");
				}
			}
			catch (NumberFormatException ex) {
				System.out.println("Debes elegir una opción numérica");
				opcion=0;
			}
				
		}while(opcion!=7);

	}
	
	static void mostrarMenu() {
		System.out.println();
		System.out.println("1.- Nuevo producto");
		System.out.println("2.- Subir precios");
		System.out.println("3.- Ordenar productos");
		System.out.println("4.- Eliminar productos");
		System.out.println("5.- Subir precios en categoria");
		System.out.println("6.- Mostrar todos los productos");
		System.out.println("7.- Salir"); 
		System.out.println();
		System.out.println("Elija una opción: ");
		System.out.println();
	}	
		
	static void añadirProducto () {
		String nombre;
		Double precio;
		String categoria;
		System.out.println("Nombre del producto: ");
		nombre = sc.nextLine();
		System.out.println("Precio del producto: ");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Categoria del producto: ");
		categoria = sc.nextLine();
		service.altaProducto(new Producto(nombre, precio, categoria));		
	}
	
	static void subirPrecio () {
		
		System.out.println();
		System.out.println("Cuanto quieres subir los precios?: ");		
		service.subirPrecio(Double.parseDouble(sc.nextLine()));		
	}
	
	static void subirPrecioCategoria () {
		double subida;
		String categoria;
		System.out.println();
		System.out.println("Cuanto quieres subir los precios?: ");	
		subida = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.println("De qué categoria: ");
		categoria = sc.nextLine();
		service.subirPrecioCategoria(subida, categoria); 
	}
	
	static void ordenarPrecio () {
		service.ordenar();
	}
	
	static void eliminarProductos ( ) {
		System.out.println();
		System.out.println("De que categoria eliminamos todos sus productos? ");
		service.eliminarProducto(sc.nextLine());		
	}
	
	static void mostrarProductos () {
		service.mostrarProductos();		
	}
	
	
}
