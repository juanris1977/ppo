package principal;

import java.util.Scanner;

public class ComprobarEmail {

	public static void main(String[] args) {
		//  introducción de una dirección de correo electrónico, y nos indique si es o no válida (tiene que tener @ y .)
		Scanner sc = new Scanner(System.in);
		String email;
		boolean valido=false;
		
		
	    do {
	    	System.out.println("Introduce un email: ");
	     	email=sc.nextLine();
	     	if (email.indexOf("@")!=-1 &&  
	     			email.indexOf(".")!=-1 ) {
	     		System.out.println("El email es correcto");
	     		valido=true;
			
	     	}
	     	else {
			System.out.println("No es correcto");
	     	}
	    } while (!valido);

	}
}
