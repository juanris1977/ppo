package pruebas;

import java.util.function.BiPredicate;

// haz una clase que tenga los siguientes metodos:
/*
 1. recibe 2 numeros y nos dice si son o no iguales
 2. Recibe 2 numeros y nos dice si el primero es mayor que el segundo
 3. Recibe 2 numeros y nos dice si ambos son pares 
 
 */

class Prueba {
	public boolean comprobar (int n1 , int n2 , BiPredicate<Integer, Integer> criterio) {
		return criterio.test(n1,n2);     // test es el método de los predicate
		
	}
}

public class Pruebas2 {

	public static void main(String[] args) {
		Prueba pr= new Prueba ();
		
		// parte 1
		System.out.println(pr.comprobar(6, 8, (a,b)->a==b));
		
		// parte 2
		System.out.println(pr.comprobar(6, 8, (a,b)->a>b));

		// parte 2
		System.out.println(pr.comprobar(6, 8, (a,b)-> a%2==0 && b%2==0));
	}

}
