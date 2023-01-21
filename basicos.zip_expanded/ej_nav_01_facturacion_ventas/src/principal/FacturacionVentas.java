package principal;

import java.util.Scanner;

public class FacturacionVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double precio = 0;
		int unidades = 0;
		double total = 0;
		double descuento = 0;
		System.out.println("Introduce precio del producto: ");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce cuantas unidades quieres: ");
		unidades = Integer.parseInt(sc.nextLine());
		total = precio * unidades; 
		if (unidades>10) {
			descuento=10;	
			
		}
		else {
			if (unidades>=5) {
				descuento=5;
			}							
		}
		total=total-(total*descuento/100);
		System.out.println("Te aplicamos el "+descuento+" % de descuento, el total a pagar es: "+total);
	}
	

}
