package principal;

import java.util.ArrayList;
import java.util.Scanner;

//Se solicita una nota y se guarda si es un número positivo, y pide otra nota
//si la nota es un negativo, no la guarda y no sigue pidiendo notas
//mostrará:
// nota media
// número de aprobados
// Nota más alta
// Nota más baja

public class Notas2 {

	public static void main(String[] args) {
		int nota, media=0, aprobados=0 ;
		int alta=0, baja=10;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> Notas = new ArrayList<>();
		
		System.out.println("Introduce una nota: ");
		nota = sc.nextInt();
		
		while (nota>=0) {
			Notas.add(nota);
			System.out.println("Introduce una nota: ");
			nota = sc.nextInt();
		}
		alta=Notas.get(0);
		baja=Notas.get(0);
		for (int i=0;i<Notas.size();i++) {
			nota=Notas.get(i);
		
			if (nota<baja)  baja=nota;  //  otra forma seria baja=Math.min(baja,nota);    ESTÁ MEJOR VISTO HACERLO ASI CON EL MATH
			if (nota>alta)  alta=nota;  //  alta=Math.min(alta,nota);
			media=media+nota;
			if (nota>=5) aprobados++;			
		}
		System.out.print("Las notas introducidas son: ");
		for (int i=0;i<Notas.size();i++) {
			System.out.print(Notas.get(i)+" ");
		}
		System.out.println();
		System.out.println("La nota más baja es: "+baja);
		System.out.println("La nota más alta es: "+alta);
		System.out.println("La nota media es: "+media*1.0/Notas.size());
		System.out.println("Hay "+aprobados+" aprobados");
	}
	
}
