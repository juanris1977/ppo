package principal;

public class EsPrimo {

	public static void main(String[] args) {
		// dado un número, que te diga si es primo
		int n=53;
		boolean primo=true;
		for (int i=2;i<n & primo;i++) {  // Si ya vimos que es divisible por algún número no hace falta seguir hasta n
			if (n%i==0) {
				primo=false;
			}
		}
		System.out.println("El número "+n+" es primo: "+primo);
	}

}
