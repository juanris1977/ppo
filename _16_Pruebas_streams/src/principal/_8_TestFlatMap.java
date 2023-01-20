package principal;

import java.util.List;

public class _8_TestFlatMap {

	public static void main(String[] args) {
		// dadas las notas de un centro de formacion, donde cada array
		// contiene las notas de un aula, calcula la media global
		
		List<Double[]> notas= List.of (new Double[] {4.1,7.3,5.4}      ,    // notas de 1 clase
								       new Double[]	{2.2,7.2,4.2,8.2,1.3}  ,  //  de otra clase
								       new Double[] {8.3,3.2, 2.9}     ,     // etc 
								       new Double[] {2.4,3.6} )
				; 
		// se pide saber la nota media de todos los alumnos
		
		notas.stream()   // Te da un stream de arrays de dobles    Stream<Double[]>
		           // Obtener un Stream <Double>
	}

}
