package service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> misciudades = new ArrayList<>();

	public boolean añadirCiudad (Ciudad ciudad) {
		
	/*	if (misciudades.stream()
		           .filter(c-> c.getNombre().equalsIgnoreCase(ciudad.getNombre()) && c.getPais().equalsIgnoreCase(ciudad.getPais()))
		           .findFirst()
		           .isEmpty()) {            // no existe esa ciudad 							
								misciudades.add(ciudad);
								return true;
							   }*/
		if (misciudades.stream()
		           .noneMatch(c -> c.getNombre().equalsIgnoreCase(ciudad.getNombre()) 
		        		   		   && c.getPais().equalsIgnoreCase(ciudad.getPais())))  // no existe esa ciudad, pues la agregamos
		        		   		{ 							
								misciudades.add(ciudad);
								return true;
							   }		
		return false;		
	}
	
	public int ciudadesEnPais (String paisbuscado) {
		
		return
		(int) misciudades.stream()
					     .filter(n->n.getPais().equalsIgnoreCase(paisbuscado))
					     .count();		
	}
	
	public List<Ciudad> datosCiudadesPorCriterio (Predicate<Ciudad> cond) {
		
		List<Ciudad> res = new ArrayList<>();
		for (Ciudad c : misciudades) {
			if (cond.test(c)) {
				res.add(c);
			}
		}		
		return res;		
	}
	
	
	
	public Ciudad ciudadMasPoblada () {
		
		return 
		misciudades.stream()
		           .max( (c1, c2) -> c1.getHabitantes() - c2.getHabitantes() )
		           .orElse (null);		        	   		
	}
	
	public Ciudad ciudadMasFria () {
		return 
				misciudades.stream()
				           .min( (c1, c2) -> Double.compare(c1.getTemperatura(),c2.getTemperatura() ))
				           .orElse (null);
	
	}
	
	public Ciudad buscarCiudad (String ciudadbuscada , String paisbuscado)  {
		return
			misciudades.stream()
			           .filter( a-> a.getNombre().equalsIgnoreCase(ciudadbuscada) && a.getPais().equalsIgnoreCase(paisbuscado))  //stream<Ciudad>
			           .findFirst()   //Optional<Ciudad>
			           .orElse(null);   // elemento en sí, si existe, sino, nulo
	}
	public List<Ciudad> mostrarTodas () {
		return misciudades;
		
	}
	
	// método que devuelva el total de paises registrados
	public int cuantosPaises() {
		return 
			(int)	misciudades.stream()
						   .map(c -> c.getPais().toLowerCase())   // convierto el Objeto ciudad en sólo el pais al que pertenece  Stream<String>
						   .distinct()
						   .count();
	}
		
	// temperatura media de las ciudades cuyo pais se recibe , si no hay ciudades en el pais, devuelvo un optional que ya será tratado
	public OptionalDouble temperaturaMediaPais (String Pais) {
		return 
				misciudades.stream()
				           .filter(p -> p.getPais().equalsIgnoreCase(Pais))   // Stream<Ciudad>    Nos quedamos con las ciudades de ese pais 
				           .mapToDouble( c -> c.getTemperatura())         // DoubleStream      Convertimos cada ciudad a su temperatura
				           .average();   //OptionalDouble  
		}	
	
	
}
