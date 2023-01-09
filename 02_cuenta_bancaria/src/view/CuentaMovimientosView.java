package view;

import java.util.ArrayList;

import model.Movimiento;
import service.CuentaMovimientos;

public class CuentaMovimientosView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaMovimientos cuenta = new CuentaMovimientos(0,0);
		
		System.out.println("saldo: "+cuenta.obtenerSaldo());
		cuenta.ingresar(100);
		System.out.println("+100");
		System.out.println("saldo: "+cuenta.obtenerSaldo());
	//	System.out.println(//cuenta.);
		cuenta.ingresar(200);
		System.out.println("+200");
		System.out.println("saldo: "+cuenta.obtenerSaldo());
		cuenta.extraer(100);
		System.out.println("-100");
		System.out.println("saldo: "+cuenta.obtenerSaldo());
		cuenta.extraer(150);
		System.out.println("-150");
		System.out.println("saldo: "+cuenta.obtenerSaldo());    //  solo va a poder sacar 100 que es el limite (mitad del saldo)
		
		ArrayList<Movimiento> movis = cuenta.movimientosRealizados();
		System.out.println("Los movimientos de la cuenta son: ");
		for (Movimiento e: movis) {
			System.out.println(e.getTipo()+"-->"+e.getCantidad());
		}
		
	}

}
