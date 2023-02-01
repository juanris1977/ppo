package service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import model.Pais;
import service.locator.PaisesLocator;

public class PaisesService {
	
	PaisesLocator locator = new PaisesLocator();
	
	
	// metodo que devulve la lista de continentes
	public List<String> continentes () {
		return locator.getJsonStream()
			   .map(p -> p.getRegion())
			   .distinct()
			   .toList();		
	}
	
	public List<Pais> paisesContinente (String cte) {
		return locator.getJsonStream()
			   .filter(t -> t.getRegion().equalsIgnoreCase(cte))
			   .toList();
	}
	public List<String> frontera (String pais) {
		return locator.getJsonStream()
				      .filter(p->p.getName().equalsIgnoreCase(pais))
				      .flatMap(p->Arrays.stream(p.getBorders()))
				      .map(p -> nombre(p))
				      .toList();
				     
				      
				
				
				
			     
	}
	public String nombre (String nom) {
		return locator.getJsonStream()
			          .filter(p -> p.getAlpha3Code().equalsIgnoreCase(nom))
			          .map(p -> p.getName())
			          .findFirst()
			          .get();
	}
}
