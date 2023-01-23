package principal;

import java.util.List;

public class _9_test_peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		System.out.println("Muestra los positivos no repetidos y nos diga cuuantos hay");
		System.out.println("total: "+
		nums.stream()
			.filter(n -> n>0)
			.distinct()
			.peek(n -> System.out.println(n))   // Imprime , pero además sigue devolviendo el stream para hacer "la segunda consulta"
			.count()  //Long
				);
		
		// OJO QUE ES PEREZOSO

		
		List<Integer> nums1=List.of(8,1,-3,-1,1);
		System.out.println("Ojo con los métodos modo cortocircuito: ");
		nums1.stream()
				.peek(n->System.out.println(n))      // Solo muestra los que han sido realmente tratados por el aymatch
				.anyMatch(n->n<0);

		
	}

}
