package principal;

public class CalculosEdades {

	public static void main(String[] args) {
		// Calcular la media de edad
		int [] edades= {34,19,26,44,30,18};
		double suma=0;
		for (int i=0;i<edades.length;i++) {
			suma=suma+edades[i];
		}
		System.out.println("la edad media es "+suma/edades.length);
}
}
