package principal;


interface Datos {
	static void imprime() {
		System.out.println("hello");
	}
}

class Prueba implements Datos {
	
}





public class Test {

	public static void main(String[] args) {
		Datos.imprime();  //hay que llamarlo usando directamente el interfaz
		
		Prueba pr = new Prueba();
//		pr.imprime();    da error porque el metodo imprime es sta´tico y sólo es accesible desde el interfaz 
		

	}

}
