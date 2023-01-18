package principal;

import java.util.List;

public class test2 {

	public static void main(String[] args) {
		List <Integer> nums = List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		
		//Muestra los 7 primeros no duplicados
		System.out.println("Muestra los 7 primeros no duplicados:");
		
		nums.stream()
		.distinct()
		.limit(7)
		.forEach(n -> System.out.println(n));						  

		// hay algun negativo ?
		System.out.println("Hay negativos?");
		System.out.println(nums.stream()
		                   .anyMatch(n -> n<0));
		
		
		//  son todos pares ??
		System.out.println("Todos pares: ");
		System.out.println(nums.stream()
					       .allMatch(t -> t%2==0));
	}
}
