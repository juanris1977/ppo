package principal;

import geometria.Circulo;
import geometria.Triangulo;

public class TestSinPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo ("azul", 3);
		Triangulo t1 = new Triangulo ("amarillo",3,7);
		
		System.out.println("Tipo de figura: Circulo");
		System.out.println("Color: "+c1.getColor());
		System.out.println("Superficie: "+c1.superficie());
		
		System.out.println();
		
		System.out.println("Tipo de figura: Triangulo");
		System.out.println("Color: "+t1.getColor());
		System.out.println("Superficie: "+t1.superficie());
		
		// Para cada figura geométrica creo un objeto, y tengo que poner 3 veces los syso , es ineficiente
		//  utilizando polimorfismo sería más eficiente y corto
	}

}
