package principal;

interface Printer {
	void imprime (String cad);
	//incluiremos un método estatico que proporcione una determinada
	// implememntacion de la interfaz
	
	/*static Printer of(){          //Devuelve un objeto de si mismma
		return new Printer() {
			@Override
			public void imprime(String cad) {
				System.out.println(cad);
			} 
		};		
	}*/
}

public class Test2 {

	public static void main(String[] args) {
		// podemos llamar al metodo estatico de la interfaz
		//para que nos de un objeto ya hecho de una clase que implementa la
		// interfaz, y asi no tener que crear una clase que la implemente
		
		Printer pr = new Printer() {
			
			@Override
			public void imprime(String cad) {
				System.out.println(cad);
				
			}
		};
		pr.imprime("hola"+"\n");
		
		// System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
	}
}
