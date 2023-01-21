package principal;

import java.util.Arrays;

public class Loteria {

	public static void main(String[] args) {
		//  generar y ordenar una combinación de loteria primitiva
		int [] combinacion = new int [6];
		int contador= 0;
		int numeroGenerado;
		while (contador<6) {
			numeroGenerado=(int)(Math.random()*49+1);
			if (!repetido(numeroGenerado,combinacion,contador)) {
				combinacion[contador]=numeroGenerado;
				contador++;
			}
		} //  ya tenemos 6 números
		ordenar(combinacion);
		imprimir(combinacion);
	}
	
	static boolean repetido(int numero, int[] array, int cont) {
		boolean res=false;
		for (int i=0;i<cont;i++) {
			if (array[i]==numero) {
				res=true;
				break;
			}
		}		
		return res;
	}
	static void ordenar(int[] array) {
		// ordenamos con metodo burbuja
		int aux=0;
		for (int i=0;i<array.length;i++) {
			for (int k=i+1;k<array.length;k++) {
				if (array[k]<array[i]) {  //intercambiar
					aux = array[k];
					array[k]=array[i];
					array[i]= aux;
				}
			}
		}
		// opcion con sort
		//Arrays.sort(array);
	}	
	

	
	static void imprimir(int[] array) {
		for (int num:array) {          // mostrar los números ordenados del array original
			System.out.print(num+" ");
		}
		
	}

}
