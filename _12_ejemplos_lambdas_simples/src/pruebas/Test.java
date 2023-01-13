package pruebas;


interface I1 {
	void print(String cad);
}

interface I2 {
	int suma (int a ,int b);
}

interface I3 {
	String send();
	default void call() {
		System.out.println("hello");
	}
	
}






public class Test {

	public static void main(String[] args) {
		
		
		I1 i1= cad -> System.out.println(cad);    // cad->System.out.println(cad) es la implementacion del metodo print del interface I1
		i1.print("esto se imprimirá");
		
		I2 i2= (a,b) -> a+b ;    // a+b es la implementacion del metodo suma de la interfaz I2
		int suma = i2.suma(3, 5);
		
		I3 i3= () -> "adios" ;
		i3.send();  //  

	}

}
