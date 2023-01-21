package principal;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota=4;
		// si la nota está entre 1 y 4 , "suspenso"
		// entre 5 y 6 "aprobado"
		// entre 7 y 8 "notable"
		// entre 9 y 10 "sobresaliente"
		// otro valor "no válida"
		
		// JAVA 11
		switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5,6:   // en java 17 se pueden agrupar varios resultados en el mismo case
				System.out.println("aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("no válida");
				
		}
		/* soluycion IF
		if (nota>=1 && nota<=4) {
			System.out.println("suspenso");
		}*/
	}

}
