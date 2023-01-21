package principal;

import java.util.Arrays;
import java.util.List;

public class _8_TestFlatMap {

	public static void main(String[] args) {
		// dadas las notas de un centro de formacion, donde cada array
		// contiene las notas de un aula, calcula la media global
		
		List<double[]> notas= List.of (
									   new double[] {4.1,7.3,5.4}      ,    // notas de 1 clase
								       new double[]	{2.2,7.2,4.2,8.2,1.3}  ,  //  de otra clase
								       new double[] {8.3,3.2, 2.9}     ,     // etc 
								       new double[] {2.4,3.6} )
				; 
		// se pide saber la nota media de todos los alumnos
		
		
		/* notas.stream()   // Te da un stream de arrays de dobles    Stream<Double[]>
						.flatMap(a->Arrays.stream(a)) //Stream<Stream Double>  Hemos convertido el Stream de Arrays de dobles es un Stream de Stream de Dobles
						.mapToDouble(c -> c)      //  Lo convertimos  a DoubleStream para poder acceder al optional average
						.average()
						.ifPresentOrElse(n -> System.out.println("La media es: "+n), 
										 ()-> System.out.println("No hay datos"));*/
		 
		 notas.stream()  
			.flatMapToDouble(a->Arrays.stream(a))
			.average()
			.ifPresentOrElse(n -> System.out.println("La media es: "+n), 
							 ()-> System.out.println("No hay datos"));
		
		
	}

}
