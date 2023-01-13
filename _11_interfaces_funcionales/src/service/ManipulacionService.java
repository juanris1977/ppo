package service;

import java.util.List;
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
		
}
