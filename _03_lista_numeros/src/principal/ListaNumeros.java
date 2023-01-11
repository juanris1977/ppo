package principal;

/*Crear una nueva clase de coleccion para listas de enteros.

Esta nueva clase, a la que llamaremos ListaNumeros, va a heredar ArrayList<Integer>

Metodos nuevos:
	*first(). Devuelve el primer número de la colección
	*last(). Devuelve el último número de la colección
	*sum() . Devuelve la suma de todos los números

No se pueden añadir números repetidos*/

import java.util.ArrayList;

public class ListaNumeros extends ArrayList<Integer> {
	ArrayList<Integer> ele ;
	public int first() {			
		int primero = get(0);		
		return primero;
	}
	
	public int last() {			
		int ultimo = get(size()-1);			
		return ultimo;
	}
	
	public int sum() {
		int suma=0;	
		
		for (int c=0;c<size();c++) {
	 
			suma= suma+get(c);			
		}		
		/*for (Integer c: ele) {
			suma= suma + c;
		}*/
		
		
		return suma;
	}

	@Override
	public boolean add(Integer e) {
		
		if (!contains(e)) {
			return super.add(e);  //  da true si lo puede añadir			
		}
		return false;
	}
}
