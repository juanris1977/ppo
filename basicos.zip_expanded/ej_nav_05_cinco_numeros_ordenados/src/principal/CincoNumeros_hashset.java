package principal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CincoNumeros_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> datos = new HashSet <>();  // utilizo hashset porque sólo se añaden objetos si no existen antes
	
		Scanner sc = new Scanner (System.in);
		int num=0;
		do {
			System.out.println("Introduce número: ");
			
			if (!datos.add(Integer.parseInt(sc.nextLine()))) {                    // si no lo añade saca el texto 
				System.out.println("Ese número ya existe");
			}
			
						
		}
		while (datos.size() <5);    // Ya tengo un conjunto con 5 unidades distintas
		
		
		Integer [] array = new Integer [datos.size()];  //  Creo un array de 5 unidades para volcar el contenido del conjunto
		
		
		for (Integer i: datos) {         
			array[num]= i;
			num++;
		}
		
	
		
		for (Integer c: array) {
			System.out.println(c);
			
		}
	
		
		System.out.println();
		
// ordenamos con método burbuja que creamos en el metodo ordenarArray
		
		ordenarArray(array);
		
		for (Integer c: array) {
			System.out.println(c);
		}
	}
	
	static void ordenarArray (Integer [] combinacion) {

		int auxi;
		for (int i=0;i<combinacion.length-1; i++) {
			for (int j=i+1;j<combinacion.length;j++) {
				if (combinacion[j] > combinacion[i]) {
					auxi = combinacion[i];
					combinacion[i] = combinacion[j];
					combinacion[j] = auxi;
				}
			}
			
		}
	}

}
