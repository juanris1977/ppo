package service;

public class CuentaLimite extends Cuenta {
	private double limite;//, saldo;
	
	public CuentaLimite(double saldo, double limite) {
		super(saldo);   // llamo al constructor de la Cuenta para obterner saldo original
		this.limite = limite;  // Creamos el limite actual
	}
	
	public CuentaLimite() {
		
		limite = 50;
	}
	
	public void ajustarLimite() {		
		limite=obtenerSaldo() / 2;	//	 obternerSaldo
	}
	
	@Override
	public void extraer (double dinero) {
		if (dinero <= limite) {
			super.extraer(dinero);   // llamamos al extraer de Cuenta  (clase padre)
		}else {
			super.extraer(limite);
		}
	}
	

}
