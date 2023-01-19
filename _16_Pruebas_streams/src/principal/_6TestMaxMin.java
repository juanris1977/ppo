package principal;

import java.util.List;

public class _6TestMaxMin {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		System.out.println("Número positivo más pequeño");
		nums.stream()
		.filter(n->n>0)
		.min((a,b)->a-b)      //  se queda con el mínimo usando el comparador , si a-b es positivo significa A>B , ordena de menor a mayor internamente
		.ifPresentOrElse(n->System.out.println(n)
	   			, ()->System.out.println("No hay positivos"));

	}
}
