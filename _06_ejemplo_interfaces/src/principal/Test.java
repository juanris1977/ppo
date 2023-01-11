package principal;

import interfaces.Operaciones;
import pruebas.Mesa;
import pruebas.Punto3D;

public class Test {

	public static void main(String[] args) {
		//Operaciones op;
		//op = new Mesa (2,7,3);
		//op.invertir(); // invierto la mesa
		
		procesar (new Mesa (2,7,3));  // es equivalente a lo amnterior
		
		//op = new Punto3D(1,2,6);
		// op.invertir();  // invierto sobre el punto3D
		
		procesar (new  Punto3D(1,2,6));
		
		//Puedo llamar a procesar (que pide un operaciones) con una mesa porque mesa implementa operaciones
		//Puedo llamar a procesar (que pide un operaciones) con un punto3D porque punto3D implementa operaciones

	}
	
	static void procesar(Operaciones op) {
		op.girar(10);
		System.out.println(op.invertir());
	}

}
