package service;

import java.util.ArrayList;

import model.Movimiento;

/*public class CuentaMovimientos extends CuentaLimite{
	
	private ArrayList<Movimiento> movs = new ArrayList<Movimiento>();
	// constructor
	public CuentaMovimientos (double saldo, double limite , ArrayList<Movimiento> m) {
			super(saldo,limite);
			this.movs=m;
	}
	
	public void ingresar (double dinero ) {
		super.ingresar(dinero);
		ajustarLimite();
		Movimiento mov = new Movimiento(dinero,"ingresar");		
		movs.add(mov);
	}
	
	public void extraer (double dinero ) {
		super.extraer(dinero); 
		ajustarLimite();
		Movimiento mov = new Movimiento(dinero,"extraer");		
		movs.add(mov);
	}
		
	public ArrayList <Movimiento> movimientosRealizados ( ) {
		return movs;
	}
}
*/
public class CuentaMovimientos extends CuentaLimite{
	
	private ArrayList<Movimiento> movs = new ArrayList<>();

	
	// constructor
	public CuentaMovimientos (double saldo, double limite) {
			super(saldo, limite);
						
	}
	
	@Override
	public void ingresar (double dinero ) {
		super.ingresar(dinero);
		ajustarLimite();     //  para que el limite quede actualizado despues de ingresar
		Movimiento mov = new Movimiento(dinero,"ingresar");		
		movs.add(mov);
	
	}
	
	@Override
	public void extraer (double dinero ) {
		if (dinero <= super.obtenerSaldo()/2) {       //  obtenerSaldo() / 2 nos da el limite para sacar
			Movimiento mov = new Movimiento(dinero,"extraer");	  //  Creamos el objeto movimiento con el tipo y cantidad (dinero)
			super.extraer(dinero);  				 // llamamos al extraer de Cuenta  (clase padre)

			movs.add(mov);    									  // Lo añadimos al arraylist
			
		}else {
			Movimiento mov = new Movimiento(super.obtenerSaldo()/2,"extraer");    
			super.extraer(super.obtenerSaldo()/2);    // llamamos al extraer de Cuenta  (clase padre) , pero con el limite que teniamos, que era saldo/ 2
			
			movs.add(mov);
		}
	
		ajustarLimite();   //  para que el limite quede actualizado despues de extraer
			
		
	}
		
	public ArrayList <Movimiento> movimientosRealizados ( ) {
		return movs;
	}
	
}
