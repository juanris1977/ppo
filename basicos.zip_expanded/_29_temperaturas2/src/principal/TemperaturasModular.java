package principal;

public class TemperaturasModular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valores="23.7, 11.3, 18.4, 30.1, 28.5, 16.2";
		
		String[] datos = valores.split(",");  // se crea un array con strings de las temperaturas
		
		double [] temps = new double [datos.length];  //  Creamos un array temps con igual tamaño, para ir metiendolos, 
												      //  pero convertidos a números
		
		for (int i=0;i<datos.length; i++) {          // para cada valor de datos, lo convertimos a numero y lo metemos en temps
			temps[i]=Double.parseDouble(datos[i]);
		}
		
		
		System.out.println("La media es "+calcularMedia(temps)+" y hay "+calcularSuperiores(temps,calcularMedia(temps) )+" ciudades con una temperatura superior");
	


	}
	
	static double calcularMedia(double[] temperaturas) {
		double media=0;
		for (int i=0;i<temperaturas.length; i++) {
			media=media + temperaturas[i];
		}
		media=media/temperaturas.length;
		return media;
	}

	static int calcularSuperiores(double[] temps, double media) {
		int superior=0;
		for (int i=0;i<temps.length; i++) {
			if (temps[i] > media) {
				superior++;
			}
			
		}
		return superior;
	}
}
