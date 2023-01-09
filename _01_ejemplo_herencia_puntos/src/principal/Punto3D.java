package principal;

public class Punto3D extends Punto{
	private int z;
	
	public Punto3D (int z) {
		this.z = z;
			
	}
	public void mover (int d) {
		x= x+d;
		y= y+d;
		z= z+d;
			
	}
}
