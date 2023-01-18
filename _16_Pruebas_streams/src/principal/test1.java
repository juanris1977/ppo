package principal;

import java.util.List;

public class test1 {

	public static void main(String[] args) {
		/*List <Integer> nums = List.of(6,11,-4,8,-5,10,-8,2,11,27,-5,-12,41,10);
		
		System.out.println("Cuenta:");   // count
		System.out.println(nums.stream().count());
		System.out.println("Imprime todos");  //foreach
		nums.stream().forEach(n -> System.out.println(n));
		System.out.println("Imprime distintos: ");  // distinct
		nums.stream()
		.distinct()
		.count()
		.forEach(n -> System.out.println(n));*/
		
		
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		//muestra los 7 primeros números de la lista, sin contar duplicados
		nums.stream()
		.distinct()
		.limit(7)
		.forEach(n -> System.out.println(n));
		
		
				   
		
		
		
		
	}

}
