package principal;

public class Test {

	public static void main(String[] args) {
	//  creamos 2 objetos Punto y dibujamos
		/*Punto p1= new Punto();
		Punto p2 = new Punto(3,7);
		p1.dibujar();
		p2.dibujar();*/
		
		// creamos un objeto punto3D y llamamos a sus metodos
		
		Punto3D pd = new Punto3D(1,7,4);
		pd.dibujar();
		pd.mover(2);
		System.out.println("------------");
		pd.dibujar();
		
	}
	
}
