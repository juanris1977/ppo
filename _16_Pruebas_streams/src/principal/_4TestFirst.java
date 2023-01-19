package principal;

import java.util.List;

public class _4TestFirst {

	public static void main(String[] args) {
		List<String> nombres = List.of ("leche", "atún", "vino", "patatas", "leche", "agua", "vino", "lechuga");
		
		System.out.println("Mostrar el nombre del primer producto que comience por a, si no hay que muestre no hay ninguno: ");
		
		if (nombres.stream()
			.filter(n->n.startsWith("a"))
			.findFirst()
			.isEmpty()) {
						System.out.println("no hay ninguno");
		} 
		else {System.out.println( nombres.stream()
								    .filter(n->n.startsWith("a"))
								    .findFirst()
								    .get()
				);
				
		}
		
		//usando el orElse
		System.out.println(
			nombres.stream()   //devuelve un stream<String>
			.filter(n->n.startsWith("a"))
			.findFirst()
			.orElse("No hay nada")
		);
		
	}
}
