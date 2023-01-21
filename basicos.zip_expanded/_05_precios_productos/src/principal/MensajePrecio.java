package principal;

public class MensajePrecio {

	public static void main(String[] args) {
		// si el precio es 10 es muy caro, si es 9 caro , si es 8 aceptable, si es 7 lo compro
		// si es 6 barato , cualquier otro no me lo creo
		int precio=7;
		switch (precio) {
			case 10:
				System.out.println("muy caro");
				break;
			case 9:
				System.out.println("caro");
				break;
			case 8:
				System.out.println("aceptable");
				break;
			case 7:
				System.out.println("compro");
				break;
			case 6:
				System.out.println("barato");
				break;
			default:
				System.out.println("invalido");
			
		}

	}

}
