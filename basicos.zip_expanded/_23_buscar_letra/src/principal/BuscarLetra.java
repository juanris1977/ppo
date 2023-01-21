package principal;

import java.util.Scanner;

public class BuscarLetra {

	public static void main(String[] args) {
		// Pedir un texto y que nos diga cuantas vocales hay 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		String texto=sc.nextLine();
		
		texto=texto.toLowerCase();
		int cuantas=0;
		
		for (int i =0;i<texto.length(); i++) {
			/*if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || 
				texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {*/
			switch (texto.charAt(i)) {
				case 'a','e','i','o','u':
					cuantas++;
				
			}
		}
		System.out.println(cuantas);
		System.out.println(texto.substring(4, 8));
		
	}

}
