package principal;

public class Notas {

	public static void main(String[] args) {
		String valores="5,8,2,3,7,1,9,4";
		 // cuantos aprobados hay ?
		String [] numeros = valores.split(",");   // guardamos cada número en un array, pero aún tiene formato texto
		int [] notas = new int [numeros.length];  // creamos array notas para guardar los numeros en formato numero
		int aprobados=0;
		
		for (int i=0;i<numeros.length; i++) {
			notas[i] = Integer.parseInt(numeros[i]);
			if (notas[i]>=5) {
				aprobados++;
			}
		}
		
		System.out.println("Hay "+aprobados+" aprobados");
		

	}

}
