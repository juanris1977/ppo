package principal;

import java.util.Scanner;

public class aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int  numero = 0;
		int mayores= 0;
		int [] numeros = new int [5];
		Scanner sc = new Scanner(System.in);
				
		do	{
			System.out.println("Introduce un número entero entre 1 y 100: ");
			numero= Integer.parseInt(sc.nextLine());
		}
		while (!(numero>0 && numero <=100));
		
		for (int i=0;i<numeros.length;i++) {
			numeros[i] = (int)(Math.random()*100+1);
			if (numeros[i]>numero) {
				mayores++;
			}
		
				
		
		
		System.out.println("Los números aleatorios generados son: ");
		for (int c : numeros) {
			System.out.println(c);
		}
		System.out.println("Hay "+mayores+" números mayores que el "+numero );*/
		int  numero = 0;
		int aleatorio = 0;
		int mayores= 0;
		Scanner sc = new Scanner(System.in);
				
		do	{
			System.out.println("Introduce un número entero entre 1 y 100: ");
			numero= Integer.parseInt(sc.nextLine());
		}
		while (!(numero>0 && numero <=100));
		
		System.out.println("Los números aleatorios generados son: ");
		
		for (int i=0;i<5;i++) {
			aleatorio = (int)(Math.random()*100+1);
			System.out.println(aleatorio);
			if (aleatorio>numero) {
				mayores++;
			}
		
		}
		System.out.println("Hay "+mayores+" números mayores que el "+numero );	
	}

}
