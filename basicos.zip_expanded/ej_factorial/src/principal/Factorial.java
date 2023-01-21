package principal;

public class Factorial {

	public static void main(String[] args) {
		// Calcular el factorial de un número dado
		int n=6, fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("El factorial de "+n+" es: "+fact );
	}

}
