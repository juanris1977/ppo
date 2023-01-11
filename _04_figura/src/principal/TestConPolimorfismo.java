package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

public class TestConPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostrarDatosFigura(new Circulo ("Azul", 4));      //  Dentro de la clase Figura, estamos creando un circulo
		mostrarDatosFigura(new Triangulo ("Azul", 4,2));  //  Dentro de la clase Figura, estamos creando un triangulo

	}

	static void mostrarDatosFigura(Figura f) {
		System.out.println("Tipo de figura: "+f.getClass().getSimpleName());
		System.out.println("Color: "+f.getColor());
		System.out.println("Superficie: "+f.superficie());
	}
}
