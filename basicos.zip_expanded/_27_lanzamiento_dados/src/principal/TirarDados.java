package principal;

public class TirarDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// tirar 10000 veces el dado y ver porcentajes 
		int [] contador = new int [6];
	
		
		for (int i=0;i<100000;i++) {
			int dado=(int)(Math.random()*6+1);
		/*	switch (dado) {
			case 1: 
				contador[0]++;
				break;
			case 2: 
				contador[1]++;
				break;
			case 3: 
				contador[2]++;
				break;
			case 4: 
				contador[3]++;
				break;
			case 5: 
				contador[4]++;
				break;
			case 6: 
				contador[5]++;
				break;				
			}*/
			contador[dado-1]++;  // equivale al switch anterior
		}
		
		/*	System.out.println("el 1 ha salido el "+contador[0]*100/10000+ "% de las veces");
			System.out.println("el 2 ha salido el "+contador[1]*100/10000+ "% de las veces");
			System.out.println("el 3 ha salido el "+contador[2]*100/10000+ "% de las veces");
			System.out.println("el 4 ha salido el "+contador[3]*100/10000+ "% de las veces");
			System.out.println("el 5 ha salido el "+contador[4]*100/10000+ "% de las veces");
			System.out.println("el 6 ha salido el "+contador[5]*100/10000+ "% de las veces");*/
		
			for (int i=0;i<6;i++) {
				System.out.println("el "+(i+1)+" ha salido el "+contador[i]*100/100000.0+ "% de las veces"); 
					// al poner el divisor en decimal, nos va a dar decimales
				
			}
		}
		
		
	
}
