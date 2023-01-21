package principal;

public class UtilizarSplit {

	public static void main(String[] args) {
		String texto= "Juan,Marta|Elena,Jose,Juan,Maria,Lucas,Elena";
		String nombre= "Elena";
		String[] datos=texto.split("[|,]"); //marca como separador la , el espacio y el punto
		int contador=0;
		for (int i=0; i<datos.length; i++) {
			{
				System.out.println(datos[i]);
			}
		}
		
	}

}
