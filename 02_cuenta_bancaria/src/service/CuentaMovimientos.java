package service;

import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite{
	
	private ArrayList<Movimiento> movs;// = new ArrayList<movimiento>();
	
	
	// constructor
	public CuentaMovimientos (double saldo, double limite , ArrayList<Movimiento> m) {
			super(saldo,limite);
			this.movs=m;
	}
	
	public void ingresar (double dinero ) {
		super.ingresar(dinero);
		Movimiento mov = new Movimiento(dinero,"ingresar");		
		movs.add(mov);
	}
	
	public void extraer (double dinero ) {
		super.extraer(dinero); 
		Movimiento mov = new Movimiento(dinero,"extraer");		
		movs.add(mov);
	}
		
	public ArrayList <Movimiento> movimientosRealizados ( ) {
		return movs;
	}
	
	
}
