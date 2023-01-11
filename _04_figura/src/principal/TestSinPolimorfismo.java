package principal;

import geometria.Circulo;
import geometria.Triangulo;

public class TestSinPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo ("azul", 3);
		Triangulo triangulo = new Triangulo ("amarillo",3,7);
		
		System.out.println("Tipo de figura: Circulo");
		System.out.println("Color: "+circulo.getColor());
		System.out.println("Superficie: "+circulo.superficie());
		
		System.out.println();
		
		System.out.println("Tipo de figura: Triangulo");
		System.out.println("Color: "+triangulo.getColor());
		System.out.println("Superficie: "+triangulo.superficie());
		
		// Para cada figura geométrica creo un objeto, y tengo que poner 3 veces los syso , es ineficiente
		//  utilizando polimorfismo sería más eficiente y corto
	}

}
