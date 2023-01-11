package principal;

// Realizar una clase con un método.
// Ese método recibirá una colleccion de números enteros y devolvera la suma de los mismos
import java.util.Collection;

public class ColeccionDeNumeros {
	
	public int sumaColeccion (Collection<Integer> col) {
		
		int suma=0;
		
		for (Integer n : col) {
			suma = suma+n;			
		}
			
		return suma;	
	}
	// realizar un segundo metodo que reciba 2 colecciones
	// y nos diga cuantos números están a la vez en ambas colecciones
	
	public int cuantosRepetidos (Collection<Integer> a , Collection<Integer> b) {
		int repetidos= 0;
		
		for (Integer n : a) {
			if (b.contains(n)) {
				repetidos++;
			}
		}
		
		
		return repetidos;
	}
	
	
}
