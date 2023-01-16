package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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
	
	public int sumaTransformados (List<Integer> numeros, Function <Integer, Integer> fun) {
		int suma= 0;
		for (int n:numeros) {
			 suma+=fun.apply(n);  // sumamos el resultado de transformar cada numero segun la funcion
			}			
		return suma;		
	}
}
