package principal;

import java.util.List;
import java.util.stream.Collectors;

public class _11_collect_otros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(6,25,456,54,6,5,6);
		System.out.println("Mostrar la suma de todos los elementos" );
		
		System.out.println(
				nums.stream()
				.mapToInt(n->n)    // Para convertir a IntStream y poder acceder a Sum
				.sum()
				);
		
		// /Utilizando Collect
		System.out.println(
				nums.stream()
				.collect(Collectors.summingInt(n->n))
				);
		
	}

}
