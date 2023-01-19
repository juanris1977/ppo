package service;

import java.util.ArrayList;
import java.util.List;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> misciudades = new ArrayList<>();

	public boolean añadirCiudad (Ciudad ciudad) {
		
		if (misciudades.stream()
		           .filter(c-> c.getNombre().equalsIgnoreCase(ciudad.getNombre()) && c.getPais().equalsIgnoreCase(ciudad.getPais()))
		           .findFirst()
		           .isPresent()) {            // existe ciudad no hago nada							
							return false;
							     }
		misciudades.add(ciudad);
		return true;		
	}
	
	public int ciudadesEnPais (String paisbuscado) {
		
		return
		(int) misciudades.stream()
					     .filter(n->n.getPais().equalsIgnoreCase(paisbuscado))
					     .count();		
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
			           .filter( a-> a.getNombre().equalsIgnoreCase(ciudadbuscada) && a.getPais().equalsIgnoreCase(paisbuscado))
			           .findFirst()
			           .orElse(null);
	}
}
