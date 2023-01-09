package service;

import java.util.ArrayList;

import model.movimiento;

public class CuentaMovimientos extends CuentaLimite{
	
	private ArrayList<movimiento> movs = new ArrayList<movimiento>();
	
	
	// constructor
	public CuentaMovimientos () {
		
	}
	
	public void ingresar (double dinero ) {
		super.ingresar(dinero);
		
		movs.add(null)
	}
	
	
	
	public ArrayList <movimiento> movimientosRealizados ( ) {
		
		ArrayList<movimiento> movs = new ArrayList<movimiento>();
		
		
		return movs;
	}
	
	
}
