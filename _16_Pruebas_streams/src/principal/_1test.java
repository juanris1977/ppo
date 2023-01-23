package principal;

import java.util.List;

public class _1test {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		
		nums.forEach(n -> System.out.print(n+" , "));
		System.out.println();
		
		 
	
				
	//	System.out.println("Cuenta:");   // count
		
		/*System.out.println(nums.stream().count());
		System.out.println("Imprime todos");  //foreach
		nums.stream()
			.forEach(n -> System.out.println(n));
		
	
  	System.out.println("Imprime distintos: ");  // distinct
	System.out.println(	nums.stream()
		.distinct()
		.count());
		
		
		*/
		
		
		//muestra los 7 primeros números de la lista, sin contar duplicados
		System.out.println("muestra los 7 primeros números de la lista, sin contar duplicados");
		nums.stream()    	//6 , 11 , -4 , -5 , 6 , 10 , 6 , 8 , 2 , 11 , 27 , -5 , -12 , 41 , 10 , 
		.distinct()        	//6 , 11 , -4 , -5 ,  10 , 8 , 2 , 27 , -5 , -12 , 41  
		.skip(6)			//							2 , 27 , -5 , -12 , 41  
		.forEach(n -> System.out.println(n));
		
	
		
		
			
		
		
		
		
	}

}
