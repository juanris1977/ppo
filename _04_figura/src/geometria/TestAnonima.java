package geometria;

public class TestAnonima {

	public static void main(String[] args) {
		// creaccion de una subclase de figura y un objeto
		
		Figura f=    
				
				 new Figura ("verde") {       //  esto es un objeto de una subclase de figura
			@Override						  // implicitamente estoy generando la clase Figura
			public double superficie() {      // que tiene como color uno concreto, y como implementacion de 	
				return 10*5;				  // la superficie uno concreto en la implementacion del objeto abstracto
			}
		};
		
			// TODO Auto-generated method stub

	
		System.out.println(f.superficie());
		System.out.println(f.getClass().getName());
	}

}
