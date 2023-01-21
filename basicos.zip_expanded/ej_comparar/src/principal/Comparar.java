package principal;

public class Comparar {

	public static void main(String[] args) {
		// array de 5 números, otro número dado, saber cuantos números del array son mayores que el número dado
		int [] valores = new int [] {37,8,32,23,14};
		int n=7, mayores= 0;
		
		for (int i=0; i< valores.length; i++) {
			if (n < valores [i]) {
				mayores++;
			}
		}
		System.out.println("hay "+mayores+" números en el array mayores que el "+n);
	}

}
