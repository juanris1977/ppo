package principal;

public class PolimorfismoNumeros {
	



	public static void main(String[] args) {
		
		/*Realizar una clase con un método.
		Ese método recibirá un objeto numerico,del tipo que sea, 
		y mostrará el valor del mismo.*/
		
		mostrarValorNumerico(32);//numero entero
		mostrarValorNumerico(45.32);//numero doble
		mostrarValorNumerico(4L);//numero long
	}
	public static void mostrarValorNumerico(Number n) {//Number es la clase padre de los objetos numericos
		System.out.println(n.intValue());//intValue devuelve el valor entero
	}
}