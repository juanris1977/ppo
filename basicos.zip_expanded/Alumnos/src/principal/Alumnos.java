package principal;

public class Alumnos {

	public static void main(String[] args) {
		// array de notas de alumnos, calcular media, número de aprobados, nota más alta
		
		double[]notas=new double[] {1,6,8, 3.4, 8, 10, 2}; 
		double media=0, alta=0;
		int aprobados=0;
		
		for (int i=0; i<notas.length;i++) {
			media=media+notas[i];
			if (notas[i] > 5 ) {
				aprobados++;	
			}
			if (notas[i]>alta) {
				alta=notas[i];
			}
			
		}
		System.out.println("La media es: "+media/notas.length);
		System.out.println("La nota más alta es: "+alta);
		System.out.println("El número de aprobados es: "+aprobados);
	}

}
 