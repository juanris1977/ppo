package interfaces;
/*
Crear una implementación de la interfaz Printer, que consista en que el método
muestre por pantalla el texto recibido. Se creará un objeto de dicha implementación
y se llamará al método con un texto cualquiera.
*/

interface Printer {
	void print(String cad);
}


class Imprimir implements Printer {		
	@Override
	public void print(String cad) {
		System.out.println(cad);	
	}
}


public class Test {	
	
	public static void main(String[] args) {		
		//Printer pr = new Imprimir();    //  Creamos un objeto del tipo Imprimir		
										// Porque Imprimir es una clase que implementa 
										// esa interfaz
		Imprimir pr = new Imprimir();
		pr.print("hola");	
	}
	
}
	

