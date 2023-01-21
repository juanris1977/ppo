package principal;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el radio: ");
		float R = sc.nextFloat();
		
		System.out.println("El área del circulo es: "+(Math.PI*Math.pow(R, 2)));
		
	}

}
