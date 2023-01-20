package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Ciudad;
import service.CiudadesService;

public class ViewService {
	static CiudadesService service = new CiudadesService();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 
			int opcion;
			do {
				mostrarMenu();
				try {
					opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
					switch(opcion) {      // evaluamos
					case 1:
						añadirCiudad();
						break;
					case 2:
						ciudadesPorPais();
						break;   
					case 3:
						datosCiudadesPorCriterio();
						break;  
					case 4:
						ciudadMasPoblada();
						break;
					case 5:
						ciudadMasFria();
						break;
					case 6:
						datosCiudad();
						break;
					case 7:
						mostrarDatos();
						break;
					
					
					case 0: System.out.println("--- Adios ---");
					}
				}
				catch (NumberFormatException ex) {
					System.out.println("Debes elegir una opción numérica");
					opcion=0;
				}
					
			}while(opcion!=0);

		}
		
		static void mostrarMenu() {
			System.out.println();
			System.out.println("1.- Añadir nueva ciudad");
			System.out.println("2.- Ver número de ciudades por pais");
			System.out.println("3.- Ver datos de ciudades por pais");
			System.out.println("4.- Ciudad más poblada");
			System.out.println("5.- Ciudad más fría");
			System.out.println("6.- Ver datos de ciudad");
			System.out.println("7.- Ver todos los datos");
			
			System.out.println("0.- Salir"); 
			System.out.println();
			System.out.println("Elija una opción: ");
			System.out.println();
		}
		
	static void añadirCiudad () {
		String nombre;
		String pais;
		int habitantes;
		Double temperatura;
		
		System.out.println("Nombre de la ciudad: ");
		nombre = sc.nextLine();
		System.out.println("País: ");
		pais = sc.nextLine();
		System.out.println("Habitantes: ");
		habitantes= Integer.parseInt(sc.nextLine());
		System.out.println("Temperatura: ");
		temperatura = Double.parseDouble(sc.nextLine());
		
		service.añadirCiudad(new Ciudad(nombre, pais, habitantes, temperatura));		
	
	}
	
	static void ciudadesPorPais () {
		
		System.out.println("Elige pais: ");
		String pais=sc.nextLine();
		System.out.println("En "+pais+" hay "+service.ciudadesEnPais(pais)+" ciudades");	
		
	}
	
	static void datosCiudadesPorCriterio () {
		
		System.out.println("País: ");
		String pais = sc.nextLine();
		List<Ciudad> ciudades = service.datosCiudadesPorCriterio(c->c.getPais().equalsIgnoreCase(pais));
		
		if (!ciudades.isEmpty()) {
		//  que es mejor???   ciudades.stream().forEach(c->System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getHabitantes()+" habitantes y temperatura media de "+c.getTemperatura()+" grados."));			
			ciudades.forEach(c->System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getHabitantes()+" habitantes y temperatura media de "+c.getTemperatura()+" grados."));
		}
		else System.out.println("Aún no hay datos");

		
		
				
	}
	
	static void ciudadMasPoblada ( ) {
		Ciudad c = service.ciudadMasPoblada();
		if (service.ciudadMasPoblada()!=null) {
			System.out.println("Estos son los datos de la ciudad más poblada:");
			System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getHabitantes()+" habitantes.");			
		}
		else {
			System.out.println("Todavía no hay datos");
		}
	}
	
	static void ciudadMasFria ( ) {
		/*Ciudad c = service.ciudadMasFria();
		if (service.ciudadMasFria()!=null) {
			System.out.println("Estos son los datos de la ciudad más fría:");
			System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getTemperatura()+" temperatura media.");			
		
		}
		else {
			System.out.println("Todavía no hay datos");
		}*/
		
		List<Ciudad> c = service.mostrarTodas();
		
		c.stream().sorted((c1,c2) ->Double.compare(c1.getTemperatura(), c2.getTemperatura()))
				  .findFirst()
				  .ifPresentOrElse(n->System.out.println(n.getNombre()+" de "+n.getPais()+" con "+n.getTemperatura()+" temperatura media.")
      		   			, ()->System.out.println("No hay datos"));
				  
		
	//	c.sort( (c1,c2) ->Double.compare(c1.getTemperatura(), c2.getTemperatura()));
				
	}
	
	static void datosCiudad () {
		
		System.out.println("Nombre de la ciudad: ");
		String nombre = sc.nextLine();
		System.out.println("País: ");
		String pais = sc.nextLine();
		Ciudad c = service.buscarCiudad(nombre, pais);
		if (c!=null) {
			System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getHabitantes()+" habitantes y temperatura media de "+c.getTemperatura()+" grados.");					
		}
		else {
			System.out.println("Esa ciudad no existe");
		}
		
	}
	
	static void mostrarDatos  () {
		List<Ciudad> ciudades = service.mostrarTodas();
		if (!ciudades.isEmpty()) {
			ciudades.stream().forEach(c->System.out.println(c.getNombre()+" de "+c.getPais()+" con "+c.getHabitantes()+" habitantes y temperatura media de "+c.getTemperatura()+" grados."));			
		}
		else System.out.println("Aún no hay datos");

	}
	
    
		

}
