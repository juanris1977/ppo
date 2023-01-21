package principal;

import java.util.ArrayList;
import java.util.Scanner;

// Se solicita una nota y se guarda si es un número positivo, y pide otra nota
// si la nota es un negativo, no la guarda y no sigue pidiendo notas
// muestra las notas guardadas hasta ahora

public class Notas {

	public static void main(String[] args) {
		// Declaración de variables y objetos
		int nota;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> Notas = new ArrayList<>();
		
		System.out.println("Introduce una nota: ");
		nota = sc.nextInt();
		
		while (nota>=0) {
			Notas.add(nota);
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();
		}
		for (int i=0;i<Notas.size();i++) {
			System.out.println(Notas.get(i));
		}
	}

}
