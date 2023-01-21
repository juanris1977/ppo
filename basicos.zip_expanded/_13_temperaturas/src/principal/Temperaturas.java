package principal;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		// cuantas ciudades tienen una temperatura superior a la media ?? 
		
		double [] temps = new double[6];
		Scanner sc = new Scanner (System.in);
		

		for (int i=0;i<temps.length; i++) {
			
			System.out.println("temnoperatura: ");
			Double temperatura = sc.nextDouble();
			temps[i] = temperatura ;
			
		
			
		}
		
	}

}
