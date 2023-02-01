package principal;

import model.Ciudad;
import model.Ciudad2;
import model.Ciudad3;

public class Test {

	public static void main(String[] args) {
		Ciudad c = new Ciudad ("Badajoz" , "España");
		System.out.println(c);    //  devuelve model.Ciudad@626b2d4a   paquete.clase.hashcode
		
		// System.out.println(c) es equivalente a System.out.println(c.toString()); 
		// Hemos sobreescrito el toString en el javabean para que me lo muestre de la manera que yo quiera  (Babajoz:España)
		
		Ciudad2 c2 = new Ciudad2 ("Badajoz" , "España");
		System.out.println(c2); 
		
		Ciudad3 c3 = new Ciudad3("Madrid" , "España");
		Ciudad3 c4 = new Ciudad3 () ;
		System.out.println(c3);
	}

	
}
