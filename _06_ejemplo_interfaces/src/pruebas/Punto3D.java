package pruebas;

import interfaces.Operaciones;

public class Punto3D extends Punto implements Operaciones{
	private int z;
	
	public Punto3D (int z) {
		super(20,8); // llamo por herencia al constructos de la clase padre e inicializo en 20,8
		this.z = z;
			
	}
	
	public Punto3D (int x, int y , int z ) {
		super(x,y);
		this.z= z;
	}
	public void mover (int d) {
		setX(getX() +d);    //  no compilaria   x= x+d;   X , Y son privados de Punto, por lo que hay que acceder por setter and getter
		setY(getY() +d);
		z= z+d ; 
			
	}
	
	//sobreescribimos dibujar 
	public void dibujar () {
		System.out.println("coodenadas:" +getX()+" , "+getY()+" , "+z);
		
	}

	@Override
	public void girar(int a) {
		setX(getX()+a);
		
	}

	@Override
	public int invertir() {
		// TODO Auto-generated method stub
		return z=z+1;
	}
}
