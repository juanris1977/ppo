package principal;

import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		// introducir 5 edades, las guarda en un array, y muesytra la media
		int [] edades= new int[5];
		Scanner sc = new Scanner(System.in);
		// leemos 5 edades
		for (int i=0;i<edades.length;i++) {
			System.out.println("Introduce edad: ");
			edades[i]= sc.nextInt();
		}
		double suma=0;
		for (int i=0;i<edades.length;i++) {
			suma=suma+edades[i];
		}
		System.out.println("la edad media es "+suma/edades.length);

	}

}
