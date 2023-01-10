package geometria;

public class Triangulo extends Figura{
	private double lado, altura;

	public Triangulo(String color, double lado, double altura) {
		super(color);
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public double superficie() {		
		return lado*altura/2;
	}
}
