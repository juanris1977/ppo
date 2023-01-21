package principal;

public class Comprobar {

	public static void main(String[] args) {
		// dado array de numneros cualesquiera, que nos diga si hay o no algún número par en el array
		int valores[]= {5,7,8,3,12,10};
		boolean par=false;
		for(int i=0; i<valores.length;i++) {
			if (valores[i]%2==0) {
				par=true;
				break; // podemos salirnos ya porque ya hay un par 
			}
		}
		if (par) {
			System.out.println("hay al menos un par");
		} else {
				System.out.println("no hay ningún par");
		}
	}
}


