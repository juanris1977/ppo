package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ManipulacionService {
/*
		public int sumaPares(List<Integer> numeros) {
			int suma= 0;
			for(int n:numeros) {
				if (n%2==0) {
				suma+=n;
				}
			}
			return suma;
		}
		
		
		public int sumaPositivos(List<Integer> numeros) {
			int suma= 0;
			for(int n:numeros) {
				if (n>0) {
				suma+=n;
				}
			}
			return suma;
		}
		
		public int sumaMultiplos3(List<Integer> numeros) {
			int suma= 0;
			for(int n:numeros) {
				if (n%3==0) {
				suma+=n;
				}
			}
			return suma;
		}*/
	
	// este método servirá para sumar por cualquier criterio
	//  la condicion que debera cumplir el niumero para sewr sumado
	// se proporciona a traves de un objeto que implementa la interfaz Predicate
	
	public int sumaPorCriterio (List<Integer> numeros, Predicate<Integer> condicion) {
		int suma= 0;
		for (int n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}			
		}
		return suma;
	}
	
	/*
	 método que recibe una lista de numeros y los imprime
	 método que recibe una lista de numeros y los guarda en un fichero
	 método que recibe una lista de numeros y los manda a la nube
	 */
	
	public void procesaLista(List<Integer> numeros, Consumer<Integer> proceso) {
		
		for (int n:numeros) {			
			proceso.accept(n);				
		}					
	}
	
	/*
	 metodo que recibe una lista de numeros e imprime los pares
	 metodo que recibe un conjunto de numeros y guarda en un fichero los positivos
	 metodo que recibe una lista y guarda en un fichero los multiplos de 5
	 metodo que recibe un conjunto de numero e imprime los negativos
	 */
	
	public void procesar (Collection<Integer> co , Predicate<Integer> criterio, Consumer<Integer> proceso) {
		
		for (int x : co) {
			if (criterio.test(x)) {
				proceso.accept(x);
			}			
		}
		
	}
	/*
	recibes una lista y devuelve suma de cuadrados 
	recibes una lista y devuelve suma de raices cubicas
	
	*/
	
	
	
	public int sumaPorCriterioTransformados (List<Integer> numeros, Predicate<Integer> condicion , Function<Integer,Integer> fun) {
		int suma= 0;
		for (int n:numeros) {
			if(condicion.test(n)) {
				suma+=fun.apply(n);
			}			
		}
		return suma;
	}
	
	public int sumaTransformados (List<Integer> nums, Function <Integer, Integer> fun) {
		Integer suma= 0;
		Integer res = 0;
		for (Integer n:nums) {
			res = fun.apply(n);
			 suma+=fun.apply(n);  // sumamos el resultado de transformar cada numero segun la funcion
			}			
		return suma;		
	}
	
	//  suma de los valores de la lista y le añadimos algo 
	
	public int sumaListaConValor (Collection<Integer> numeros, Supplier<Integer> data) {
		int suma= 0;
		
		for (int n:numeros) {
			suma+=suma+n;
			}			
					
		
		return suma + data.get();
	}
	
	/*
	 1. Metodo que recibe una lista de cadenas de caracteres y devuelve el total de vocales de aquellas que comiencen por "a"
	 
	 2. Metodo que recibe una lista de cadenas de caracteres y devuelve el total de caracteres de aquellas que tengan mas de 5 letras 
	
	"salida"  "armario"  "luna"  "amarilo"
	
	M1 devolveria : devuelve el numero de vocales de armario y de amarillo (4+4) -->8
	M2 devuelve : El numero de caracteres de salida, armario y amarillo 6+7+7 --> 20
	 */
	
	public int manipularTextos (List<String> cadenas , Predicate <String> criterio , Function <String, Integer> transforma ) {
		int res= 0;
		
		for (String c: cadenas) {
			if (criterio.test(c)) {
				res+=transforma.apply(c);				
			}
		}
		
		return res;
	}
	
}
