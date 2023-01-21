package principal;

public class SumaNumeros {

	public static void main(String[] args) {
		// tenemos 2 números en 2 variables, 
		/* hacer un programa que muestre la suma de todos los numeros enteros entre ambos*/
		int a=12 , b=9, z,   suma=0;
		
		/*if (a>b) {    // si a>b intercamnbio sus valores
			z=a ;
			a=b;
			b=z;
		}*/
		//solucion 3
		a=Math.min(a, b);
		b=Math.min(a, b);
		for (int i=a;i<=b;i++) {
			suma=suma+i;
			
		}
		System.out.println("la suma de los numeros entre "+a+" y "+b+" es "+suma);
	}   

}
 