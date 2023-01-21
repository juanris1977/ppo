package principal;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primo=true;
		int numero ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		numero = Integer.parseInt(sc.nextLine());
		
		for (int i=2; i<numero; i++) {
			if (numero % i==0) {
				primo=false;
				break;
			}
		}
		
		
		System.out.println("Es el "+numero+" primo? "+primo);
	}

}
