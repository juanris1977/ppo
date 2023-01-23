package principal;

import java.util.Arrays;
import java.util.List;

public class _3PruebaFilter {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		List<String> nombres = List.of ("leche", "atún", "vino", "patatas", "leche", "agua", "vino", "lechuga");
 		
	/*	System.out.println("Cuantos pares diferentes hay?");
		System.out.println(nums.stream()    //6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10)
		                   .distinct()			//6,11,-4,-5,10,8,2,27,-5,-12,41
		                   .filter(t-> t%2==0)  // //6,-4,,10,8,2,,41
		                   .count());   //6
		*/
/*		System.out.println("Cuantos nombres diferentes de menos de 6 caracteres hay");
		System.out.println(nombres.stream()   //  "leche", "atún", "vino", "patatas", "leche", "agua", "vino", "lechuga");
					       .distinct() 		// "leche", "atún", "vino", "patatas",   "agua",   "lechuga");
					       .filter(n->n.length()<6)  // "leche", "atún", "vino",     "agua",   
					       .count()); 
		*/
		String nombresjuntos = "leche,atún,vino,patatas,leche,agua,vino,lechuga";
		
		 
		String [] miarray = nombresjuntos.split(",");
		
		System.out.println(
				Arrays.stream(miarray)  // stream<String>  "[leche atún vino patatas leche agua vino lechuga]";
				.distinct()   //"[leche atún vino patatas   agua   lechuga]";
				.filter(n->n.length()<6)   // "[leche atún vino     agua   ]";
				.count()
				);
		
	/*	String nombresjuntos = "leche,atún,vino,patatas,leche,agua,vino,lechuga";
		String [] nom= nombresjuntos.split(",");
		System.out.println(
				Arrays.stream(nom)
				.distinct()
				.filter(n->n.length()<6)
				.count()
				);
				*/
	}

}
