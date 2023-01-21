package principal;

import java.util.Arrays;
import java.util.Scanner;

public class CincoNumeros_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Scanner sc = new Scanner (System.in);
		int [] array = new int [5]; 
		
		int num=0;
		int cont= 0;
		do {
			System.out.println("Introduce número: ");
			num = Integer.parseInt(sc.nextLine());
			if (yaExiste(num,array)) {                    // si ya existe saca el texto para meterlo de nuevo
				System.out.println("Ese número ya existe");
			}
			else     //  lo añade
			{
				array[cont]=num;
				cont++;
			}
			
						
		}
		while (cont <5);    // Ya tengo un array con 5 unidades distintas
		
		
		
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
	
	static void ordenarArray (int [] combinacion) {

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
	
	static boolean yaExiste(int num , int [] array) {
		boolean existe= false;
		
		for (int z=0; z<array.length; z++) {
			if (array[z]== num) {
				existe=true;
				break;				
			}
		}
		
		return existe;
	}

}
