package principal;

import java.util.ArrayList;

public class PruebaListas {

	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<>();
		ArrayList<String> textos = new ArrayList <> ();
		textos.add("Lunes");  // pos0
		textos.add("martes");  //pos1
		textos.add("miercoles");  //pos 2
		textos.add("miercoles");
	//	System.out.println(textos.get(1));  // saca martres
		
		for(int i=0;i<textos.size();i++){
			System.out.println(textos.get(i));
			}
		System.out.println();
		
		textos.add(1,"jueves"); // mete jueves en el indice 1 , y desplaza todos a indices mayores

		textos.remove(0); // Elimina el valor del indice 0 y desplaza todos hacia abajo 
		
		for(int i=0;i<textos.size();i++){
			System.out.println(i+" "+textos.get(i));
			}
		System.out.println(textos.indexOf("miercoles"));
		numeros.add(20);
	}
	
	
}
