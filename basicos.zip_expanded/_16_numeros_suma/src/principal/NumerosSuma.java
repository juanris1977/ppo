package principal;

public class NumerosSuma {

	public static void main(String[] args) {
		// ¿cuantos números tenemos que sumar, empezando por 1, hasta alcanzar o superar el valor 1000?
		int suma=0, cuantos=0;
		while (suma<1000) {
			cuantos++;
			suma=suma+cuantos;
			
		}
		System.out.println("Los "+cuantos+ " primeros números, su suma es "+suma);

	}

}
