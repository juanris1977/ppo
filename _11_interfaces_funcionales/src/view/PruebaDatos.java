package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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
		
		// imprime los numeros de la lista usando el procesado de datos (accept)
		System.out.print("imprimir pantalla: "); service.procesaLista(nums, t ->System.out.print(t+" ")); System.out.println();
		
		//pares e imprimir
		System.out.print("Imprimir pares: ");  service.procesar(nums, t->t%2==0, t->System.out.print(t+" "));
		
		// guarda en fichero los positivos
		service.procesar(nums, 
						 t->t>0,
						 x-> {
							 String ruta="c:\\temp\\lambda.txt";
								try(FileOutputStream fos=new FileOutputStream(ruta,true);
										PrintStream out=new PrintStream(fos);){
									out.println(x);
								}
								catch(IOException ex) {
									ex.printStackTrace();
								}
						 	}
						 );
		// Suma de los cuadrados de los numeros de la lista
		 System.out.print("Suma de cuadrados: "); System.out.println(service.sumaTransformados(nums, t -> t*t));
		 
		 // suma de los cuadrados de las raices cubicas de cada elemento     usar andthen
		 
	}
	
}
