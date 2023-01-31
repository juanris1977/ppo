package service;

import java.util.List;

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
}
