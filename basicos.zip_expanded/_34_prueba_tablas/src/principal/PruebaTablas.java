package principal;

import java.util.Collection;  // subirmas
import java.util.HashMap;
import java.util.Set;

public class PruebaTablas {

	public static void main(String[] args) {

		HashMap<Integer,String> tabla = new HashMap<>();
		tabla.put(1, "Lunes");
		tabla.put(2, "Martes");
		tabla.put(3, "Miercoles");
		tabla.put(4, "Jueves");
		
	/*	System.out.println(tabla.get(1));
		System.out.println();
		
		System.out.println(tabla.size());
		System.out.println();
	//	System.out.println("eliminamos: "+ tabla.remove(300));
		// recorre los valores de un hashmaps*/
		
		Collection<String> col=tabla.values();    
		for (String s:col) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(tabla.containsValue("Lunes"));
		System.out.println(tabla.containsKey(2));
		// recorrer claves de un hashmap
/*		
		Set<Integer> claves=tabla.keySet();
		for (Integer c:claves) {
			System.out.println(c);
		}
		System.out.println();
		
		tabla.remove(3);
		
////		Collection<String> col=tabla.values();   // Ojo que hashmap no tiene un orden establecido, puede darte los valores en cualquier orden 
		for (String s:col) {
			System.out.println(s);
		}
		System.out.println();
		
//		Set<Integer> claves=tabla.keySet();
		for (Integer c:claves) {
			System.out.println(c);
		}
		
	*/			

	}

}
