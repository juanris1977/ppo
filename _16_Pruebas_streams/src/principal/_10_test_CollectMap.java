package principal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _10_test_CollectMap {

	public static void main(String[] args) {
		List <String> empleados = List.of("112F|Angel", "23Q|Ana" , "90T|Javier");
		
		System.out.println("Generar un map con todos los empleados, clave el codigo y el valor el nombre");
		
	 Map <String , String >  resultado = empleados.stream()   //  Stream <String>
			 									  .collect(Collectors.toMap(s -> s.split("[|]")[0] ,  
			 									  						    s -> s.split("[|]")[1])) ;
					
	 // mostramos claves y valores 
	 
	 resultado.forEach((k,v) -> System.out.println(k+ ":"+v));
		       	  
	System.out.println();	
	 List<String> alumnos = List.of("Julia|5", "Alicia|3","Alonso|6","Marta|5", "Kevin|6");
	 System.out.println("Generar un map con los alumnos , clave nota , valor nombre");
	 
	/* Map <Integer , String> mapAlumno = alumnos.stream()
			 								.collect(Collectors.toMap(s -> Integer.parseInt(s.split("[|]")[1]) ,  
			 														  s -> s.split("[|]")[0])) ;
	 
	 mapAlumno.forEach((k,v) -> System.out.println(k+ ":"+v));*  // da error por clave duplicada
	 */
	 
	  Map <Integer , List<String>> mapAlumno = alumnos.stream()
			 								.collect(Collectors.groupingBy(s -> Integer.parseInt(s.split("[|]")[1])));
	  
	  mapAlumno.forEach((k,v) -> System.out.println(k+ ":"+v));    //  te devuelve  3:[Alicia|3]
	  															   //	     		5:[Julia|5, Marta|5]
			  														//  			6:[Alonso|6, Kevin|6]
			 														  
	 
	  
	}
}
