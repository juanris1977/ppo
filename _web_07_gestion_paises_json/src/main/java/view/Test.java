package view;

import java.text.NumberFormat;
import java.util.List;

import model.Pais;
import service.PaisesService;

public class Test {

	public static void main(String[] args) {
		PaisesService service = new PaisesService();
		System.out.println("Lista de continentes");
		System.out.println(service.continentes());
		System.out.println(service.paisesContinente("Europe"));
		NumberFormat formato = NumberFormat.getIntegerInstance();
		
		List<Pais> paises = service.paisesContinente("Europe");
		
		for (Pais p:paises) {
			System.out.println(formato.format(p.getPopulation()));
		}
		
	}

}
