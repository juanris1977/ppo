package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceall {

	public static void main(String[] args) {
		//List<Integer> nums = List.of(8,2,5,11,4) ;  //una lista es inmutable, por lo que va a dar error de compilacion
		List<Integer> nums = new ArrayList<>(List.of(8,2,5,11,4)) ;   // ÇCreamos un arrayList a partir de la lista inmutable
		
		// para cada elemento de la lista, sustituyelo por su cuadrado metodo tradicional
	/*	for (int i=0 ; i<nums.size();i++) {				
			nums.set(i, nums.get(i) * nums.get(i));
		}
		nums.forEach(x -> System.out.println(x));
	*/
		
		// Utilizando replaceAll
		
		nums.replaceAll(x->x*x);
		nums.forEach(x -> System.out.println(x));
		
		
		

	}

}
