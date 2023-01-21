package principal;

public class CuantosPares {
	public static void main(String[] args) {
		int menor=127 , mayor= 346, pares=0;
		for (int i=menor+1;i<mayor;i++) {
			if (i%2==0) {
				pares++;
			}
		}
		System.out.println("Hay "+pares+" números pares entre "+menor+" y "+mayor );
				
	}

}
