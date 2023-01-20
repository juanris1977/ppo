package principal;

import java.util.List;

public class _7TestMap {

	public static void main(String[] args) {
		List<String> nombres = List.of ("leche", "atún", "vino", "patatas", "leche", "agua", "vino", "lechuga");
		
		System.out.println("Cuantos productos no repetidos, tienen más de 6 caracteres");
		

		System.out.println(nombres.stream()
				          .distinct()
				          .map(n -> n.length())    // convierto cada cadena a cuantos caracteres tiene esa cadena
				          .filter(n -> n>6)
				          .count()
				          );
		
		System.out.println(nombres.stream()
		          .distinct()		         
		          .filter(n -> n.length()>6)
		          .count()
		          );
		
		System.out.println("suma del total de caracteres de todas las cadenas no repetidas");
		
		System.out.println(nombres.stream()
		          .distinct()		 //Stream<String>        
		          .mapToInt(n -> n.length())   // para cada cadena lo convierto en su longitud , es un IntStream
		          .sum()
		          );

	}
}
