package principal;

import java.util.ArrayList;

public class ListaNumeros extends ArrayList<Integer> {
	
	public int first() {			
		int primero = get(0);		
		return primero;
	}
	
	public int last() {			
		int ultimo = get(super.size()-1);			
		return ultimo;
	}
	
	public int sum() {
		int suma=0;		
		for (int c=0;c<size();c++) {
			suma= suma+get(c);
		}		
		return suma;
	}

	@Override
	public boolean add(Integer e) {
		
		if (!contains(e)) {
			return super.add(e);  //  da true si lo puede añadir			
		}
		return false;
	}
}
