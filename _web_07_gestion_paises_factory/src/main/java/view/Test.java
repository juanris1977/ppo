package view;

import java.util.List;

import model.Pais;
import service.PaisesService;
import service.PaisesServiceFactory;

public class Test {

	public static void main(String[] args) {
		PaisesService service = PaisesServiceFactory.getPaisesService();

		
		List<Pais> paises = service.paisesContinente("Africa");
		
		for (Pais p:paises) {
			System.out.print(p.getName()+", frontera con: ");
		   
			
			if (p.getBorders()!=null) {	
				System.out.println(service.frontera(p.getName()));
					}
			else {System.out.print("no hay paises fronterizos");
			      
					
			}
			System.out.println();
		}
	}
		
}
