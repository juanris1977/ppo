package principal;


import java.util.ArrayList;
import java.util.List;

public class DudasListas_remove {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Juan");
		nombres.add("Luis");
		nombres.add("Pepe");
		nombres.add("Luis");
		if (nombres.remove("Luis")) {
			nombres.remove("Pablo");
			
		}
		System.out.println(nombres);
		
	}

}
