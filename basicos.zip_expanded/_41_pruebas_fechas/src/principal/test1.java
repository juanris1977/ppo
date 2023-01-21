package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {

	public static void main(String[] args)  {
		int suma = 3;
		Date d1 = new Date();
		Date d2 = new Date (3052245522323L);  // milisegundos desde 1 enero 1970 , si el número es muy grande, la L , lo "convierte" a Long
		System.out.println("d1: "+d1);
		System.out.println("d2: "+d2);
		if (d1.before(d2)) {
			System.out.println("fecha antigua: " +d1);
			System.out.println("fecha moderna: " +d2);
		}else {
			System.out.println("fecha antigua: " +d2);
			System.out.println("fecha moderna: " +d1);
		}
		//formateado de fechas
		SimpleDateFormat formatofecha=new SimpleDateFormat("dd-MM-yyyy h:mm:ss");
		
		System.out.println(formatofecha.format(d1));
		System.out.println(formatofecha.format(d2));
		
		DateFormat df =DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL);
		System.out.println("con dateFormat: "+df.format(d1));
		System.out.println("con dateFormat: "+df.format(d2));

		// parseado de fechas
		
		SimpleDateFormat formafecha=new SimpleDateFormat("dd/mm/yyyy");
		String f1 ="25/27/2017";
		
		try {
		
		Date mifecha = formafecha.parse(f1);
		
		System.out.println("1-->" +mifecha);
		System.out.println("2-->"+formafecha.format(mifecha));
	//	suma= suma/0 ;
		
		}
		catch (ParseException ex) {
			System.out.println("El formato de fecha no es correcto");
		}
		/*catch (ArithmeticException ex) {
			System.out.println("No se puede dividir entre cero");
		}
		*/
}
}
