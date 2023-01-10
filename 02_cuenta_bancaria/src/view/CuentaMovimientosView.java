package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.Cuenta;
import service.CuentaMovimientos;

public class CuentaMovimientosView {
	static Scanner sc = new Scanner (System.in);
	static CuentaMovimientos cuenta;
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Introduce un saldo: ");
		double saldo = Double.parseDouble(sc.nextLine());		
		double limite = saldo/2;
		cuenta= new CuentaMovimientos(saldo, limite);
	
		int opcion;
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				ingresarCantidad();
				break;
			case 2:
				extraerCantidad();
				break;   
			case 3:
				saldoMovimientos();
				break;
			
			case 4: System.out.println("--- Adios ---");
			}
		}while(opcion!=4);

	}
	
	static void mostrarMenu() {
		
		System.out.println();
		System.out.println("1.- Ingresar ");
		System.out.println("2.- Extraer ");
		System.out.println("3.- Consultar saldo y movimientos");
		System.out.println("4.- Salir");
		System.out.println();
	}
	
	static void ingresarCantidad () {
		System.out.println("Introduce la cantidad que quieres ingresar: ");
		double cantidad= Double.parseDouble(sc.nextLine());
		cuenta.ingresar(cantidad);
				
	}
	
	static void extraerCantidad () {
		System.out.println("Introduce la cantidad que quieres extraer: ");
		double cantidad= Double.parseDouble(sc.nextLine());
		cuenta.extraer(cantidad);
					
	}
	
	static void saldoMovimientos () {
		ArrayList<Movimiento> movs = cuenta.movimientosRealizados();
		
		System.out.println("Los movimientos son: ");
		for (Movimiento c:movs ) {
			System.out.println(c.getTipo()+"-->"+c.getCantidad());
		}
		System.out.println("------Saldo final------: "+cuenta.obtenerSaldo());
		
	}
}


