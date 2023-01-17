package principal;

import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		List<Integer> nums = List.of(8,2,5,11,4) ;
		
		//Forma tradicional
		for (int n : nums) {
			System.err.println(n);
		}
		
		nums.forEach(n -> System.out.println(n));   // Usando el foreach 
		
		// 
		

	}

}
