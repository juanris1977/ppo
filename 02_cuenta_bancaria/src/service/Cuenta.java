package service;

public class Cuenta {
	private double saldo;
	public Cuenta() {
		saldo=100;
	}
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	// metodos ingresar, extraer, obtener saldo
	
	public void ingresar (double dinero ) {
		saldo = saldo + dinero;   // saldo+= dinero
	}
	public void extraer (double dinero ) {
		saldo = saldo - dinero;   //  saldo-= dinero
	}
	public double obtenerSaldo ( ) {
		return saldo;
	}

	
}
