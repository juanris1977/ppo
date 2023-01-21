package principal;

public class Loteria {

	public static void main(String[] args) {
		// dada una combinación, decir cuantos aciertos tiene acertados
		
		int[] ganadora = {3,7,11,22,29,40};
		int[] boleto = {10,11,21,22,29,40};
		double [] premios= {0,0,8,200,35000,150000};
		int acertados=0;
		
		for (int i=0; i < boleto.length;i++) {
			for (int j=0; j < ganadora.length;j++) {
				if (boleto[i] == ganadora[j]) {
					acertados++;
					break; // si ya lo he encontrado, no hace falta seguir recorriendo la combinación ganadora
				}
			}
		}
		System.out.println("Hay "+acertados+ " aciertos, y te han tocado "+premios[acertados-1]+ " euros");

	}

}
