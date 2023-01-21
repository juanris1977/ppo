package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestNuevasClasesFechas {

	public static void main(String[] args) {
		DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate f1=LocalDate.of(1977, 01, 29);  // 25 Octubre 1977
		//LocalDate f2=LocalDate.of(2016, 04, 13);
		String mf="05/11/2018";
		LocalDate f2=LocalDate.parse(mf,format1);
		
		System.out.println("f1: "+f1);
		System.out.println("f2: "+ f2);
	//	System.out.println("f3: "+ f3);

		if (f1.isBefore(f2)) {
			System.out.println("Antigua "+f1);
			System.out.println("Nueva "+f2);
		}else {
			System.out.println("Antigua "+f2);
			System.out.println("Nueva "+f1);
		}
	
		
	
		
	
	}

}
