package principal;

public class Punto {
	private int x;
	private int y;
	//inicializa atributos
	public Punto(int x, int y ) {
		this.x=x;
		this.y=y;
	}
	public Punto() {
		x= 0;
		y= 0;
	}
	
	//settet and getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void dibujar () {
		System.out.println("Coordenadas: "+x+" , "+y);
	}
	

}
