package pruebas;

import interfaces.Operaciones;

public class Mesa implements Operaciones{
	private int largo, ancho, alto;

	public Mesa(int largo, int ancho, int alto) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void girar(int a) {
		// TODO Auto-generated method stub
		largo= largo +a;
		ancho= ancho +a;
	}

	@Override
	public int invertir() {
		// TODO Auto-generated method stub
		alto = alto *-1 ;
		return alto;
	}
	
}
