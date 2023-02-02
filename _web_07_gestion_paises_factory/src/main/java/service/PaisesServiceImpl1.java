package service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import model.Pais;
import service.locator.PaisesLocator;
import service.locator.PaisesLocatorFactory;

public class PaisesServiceImpl1 implements PaisesService {
	
	PaisesLocator locator = PaisesLocatorFactory.getPaisesLocator();
	
	
	// metodo que devulve la lista de continentes
	@Override
	public List<String> continentes () {
		return locator.getJsonStream()
			   .map(p -> p.getRegion())
			   .distinct()
			   .toList();		
	}
	
	@Override
	public List<Pais> paisesContinente (String cte) {
		return locator.getJsonStream()
			   .filter(t -> t.getRegion().equalsIgnoreCase(cte))
			   .toList();
	}
	@Override
	public List<String> frontera (String pais) {
		return locator.getJsonStream()
				      .filter(p->p.getName().equalsIgnoreCase(pais))
				      .flatMap(p->Arrays.stream(p.getBorders()))
				      .map(p -> nombre(p))
				      .toList();
				     
				      
				
				
				
			     
	}
	@Override
	public String nombre (String nom) {
		return locator.getJsonStream()
			          .filter(p -> p.getAlpha3Code().equalsIgnoreCase(nom))
			          .map(p -> p.getName())
			          .findFirst()
			          .get();
	}
}
