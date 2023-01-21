package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasModular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> Notas = new ArrayList<>();
		int nota;
		
		System.out.println("Introduce una nota: ");
		nota = sc.nextInt();		
		while (nota>=0) {
			Notas.add(nota);
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();
		}
		System.out.print("Las notas introducidas son: ");
		for (int i=0;i<Notas.size();i++) {
			System.out.print(Notas.get(i)+" ");
		}
		System.out.println();
		System.out.println("La nota más baja es: "+calcularMinimo(Notas));
		System.out.println("La nota más alta es: "+calcularMaximo(Notas));
		System.out.println("La nota media es: "+calcularMedia(Notas));
		System.out.println("Hay "+calcularAprobados(Notas)+" aprobados");
	}
	
	
	static int calcularMedia(ArrayList<Integer> lista) {    
		// método que recibe una lista de números y devuelve la media 
		int media=0;
		for (int i=0;i<lista.size();i++) {
			media=media+lista.get(i); 
		}
		media=media/lista.size();
		return media;    //  El return es lo que va a devolver nuestro método
	}
	

	static int calcularAprobados(ArrayList<Integer> lista) {  
		// método que recibe una lista de números y devuelve los aprobados
		int aprobados=0;
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i)>=5) aprobados++;
		}
		return aprobados;
		
	}
	
	static int calcularMaximo(ArrayList<Integer> lista) {  
		int maximo=lista.get(0);
		for (int i=0;i<lista.size();i++) {
			maximo=Math.max(maximo,lista.get(i));
		}
		return maximo;
	}
	
	static int calcularMinimo(ArrayList<Integer> lista) {  
		int minimo=lista.get(0);
		for (int i=0;i<lista.size();i++) {
			minimo=Math.min(minimo,lista.get(i));
		}
		return minimo;
	}
}


