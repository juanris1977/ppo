package principal;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// EJERCICIO: Realizar un programa que lea 5 números. 
		// Después, el programa analizará cada número y nos dirá si es múltiplo de 2, de 3, de 5 o de ninguno de ellos
		Scanner sc = new Scanner(System.in);
		int num;
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduce un numero: ");
			num= sc.nextInt();
			if (num%2==0) 
				System.out.println("Es múltiplo de 2");
			
			else  if (num%3==0) 
				   System.out.println("Es múltiplo de 3");
				else  if (num%5==0) 
					   System.out.println("Es múltiplo de 5");
					else System.out.println("No es múltiplo de ninguno");
			    			
		}
		
	}

}
