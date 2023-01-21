package principal;

import java.util.Scanner;

public class LecturaNumero {

	public static void main(String[] args) {
		// hacer un programa que pida un numero y nos diga si el numero es par o impar
		
		int num;
		// crear un objeto scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un número: ");
		num=sc.nextInt();
		if (num%2==0) {
			System.out.println("el numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}

}
