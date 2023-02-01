package view;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import model.Pais;
import service.PaisesService;

public class Test {

	public static void main(String[] args) {
		PaisesService service = new PaisesService();

		
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
