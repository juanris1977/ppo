package principal;

public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int hora=0;hora<=25;hora++) {
			if (hora>=0 && hora <=23) {
				if (hora>=6&&hora<=12) {
					System.out.println("Son las "+hora+", Buenos dias");
				}
				if (hora>=13&&hora<=18) {
					System.out.println("Son las "+hora+", Buenas tardes");
				}
				if (hora>=19&&hora<=23) {
					System.out.println("Son las "+hora+", Buenas noches");
				}
				if (hora>=0&&hora<=5) {
					System.out.println("Son las "+hora+", Que duermas bien");
				}
				}
			else {System.out.println(hora+ " la hora no es correcta");
		    }	
		}
	}
}
