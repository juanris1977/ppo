package _20_leer_pares;

import java.util.Scanner;

public class LeerPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] pares = new int[5];
		int num;
		int media=0;
	/*	do {
			
			}
		}
		*/
		int validos=0; //son los que llevamos metidos en el array
		while (validos<pares.length) {
			System.out.println("Introduce un par");
			num=sc.nextInt();
			if (num%2==0) {
				pares[validos]=num;
				validos++;
				
			}
					
			
		}
		for (int i=0;i<pares.length; i++) {
			media=media+pares[i];
		}
		media=media/pares.length;
		System.out.println("La media de numeros es: "+media);
	}

}
