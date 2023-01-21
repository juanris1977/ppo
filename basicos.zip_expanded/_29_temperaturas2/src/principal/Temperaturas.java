package principal;

public class Temperaturas {

	public static void main(String[] args) {
		// cuantas ciudades tienen una temperatura superior a la media ?? 
		
		String valores="23.7| 11.3";
		
		String[] datos = valores.split("[|]");  // se crea un array con strings de las temperaturas
		
		double [] temps = new double [datos.length];  //  Creamos un array temps con igual tamaño, para ir metiendolos, 
												      //  pero convertidos a números
		
		for (int i=0;i<datos.length; i++) {          // para cada valor de datos, lo convertimos a numero y lo metemos en temps
			temps[i]=Double.parseDouble(datos[i]);
		}
		
		double media=0;
		int superior=0;
		for (int i=0;i<temps.length; i++) {
			media=media + temps[i];
		}
		media=media/temps.length;
		for (int i=0;i<temps.length; i++) {
			if (temps[i] > media) {
				superior++;
			}
			
		}
		System.out.println("La media es "+media+" y hay "+superior+" ciudades con una temperatura superior");
	}

}
