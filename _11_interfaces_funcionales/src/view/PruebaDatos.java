package view;

import java.util.List;
import java.util.function.Predicate;

import service.ManipulacionService;

public class PruebaDatos {
	
	public static void main(String[] args) {
		List<Integer> nums = List.of(3,8,211,4,9);
		ManipulacionService service = new ManipulacionService();
		
		// mostrar suma de los pares por un lado, y la suma de los positivos por otro
		
		Predicate pares = new Predicate<Integer>() {
				@Override
				public boolean test(Integer t) {
					// TODO Auto-generated method stub
					return t%2==0;
				}
			};
			
		
		
		System.out.println("pares: " + service.sumaPorCriterio(nums, pares ));   // Tenemos que pasarle un objeto de una clase que implemente el predicado, 
																				// o bien, como es este caso, hacerlo a traves de una clase anonima
		
		System.out.println("Positivos: " + service.sumaPorCriterio(nums, new Predicate<Integer>() {
									@Override
									public boolean test(Integer t) {
										// TODO Auto-generated method stub
										return t>0;
									}
								}));
		
		System.out.println("pares con lambda: " + service.sumaPorCriterio(nums, t -> t%2==0 )); 
		System.out.println("positivos con lambda: " + service.sumaPorCriterio(nums, t -> t>0 )); 
	}
	
}
