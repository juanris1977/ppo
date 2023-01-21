package principal;

public class Primitiva {

	public static void main(String[] args) 	{
		// generar y ordenar una combinación de loteria primitiva
		
		int numero,d;
	//	int [] combinacion = new int [] {37,20,40,12,25,27};
		int [] combinacion = new int [6];
		int [] ordenada = new int [6];
		boolean valido, pendiente;
		
		combinacion[0] = (int)(Math.random()*49+1);  // El primero siempre es válido, pues no existen numeros previos
		for (int i=1;i<6;i++) {
			valido=true;
				do {numero= (int)(Math.random()*49+1);
					for (int z=0;z<i;z++) {       // recorro los numeros que ya tenemos
						if (combinacion[z]==numero) {    // buscamos si ya estaba el número, si estaba , repetimos
							valido=false;
						}
					}
							
				}
				while (!valido);   
		combinacion[i]=numero;
		}
		
		for (int i=0;i<combinacion.length; i++) {          // mostrar los números tal cual
			System.out.print(combinacion[i]+" ");
		}
		System.out.println();
		
/*		// ahora vamos a ordenar la combinación , metodo 1 
		
		ordenada[0]=combinacion[0];      //  el primer número lo ponemos tal cual
		
		for (int i=1;i<combinacion.length;i++) {
				int num=combinacion[i];    //Guardamos en num el siguiente candidato para meter en 
				     					   //la combinación ordenada, no es necesario, pero es más cómodo
				d=0;                       // indice sobre la combinacion ordenada
				pendiente=true;                     //para saber si el número está aun pendiente de encontrar su posicion
				while (pendiente && d<=i) {
					
					if (num < ordenada[d]) {          //Miramos si es menor que los existentes hasta ver
						for (int z=i;z>d;z--) {       // donde hay que crear un hueco para insertarlo
							ordenada[z]=ordenada[z-1];  // desplazando hacia la derecha los números mayores
									
						}                          //  aqui ya hemos creado el hueco, ahora tenemos que insertarlo
						if (pendiente) {
							ordenada[d]=num;       //  Lo insertamos en el hueco creado
							pendiente=false;
						}
					} 
					
					if (ordenada[d]==0) {
						ordenada[d]=num;       //  Lo insertamos pues es mayor que todos
						pendiente=false;
					}
					d++;
				}
			
		}*/
		//  FORMA MAS SENCILLA DE ORDENAR UN ARRAY
		
		int auxi;
		for (int i=0;i<combinacion.length-1; i++) {
			for (int j=i+1;j<combinacion.length;j++) {
				if (combinacion[j] < combinacion[i]) {
					auxi = combinacion[i];
					combinacion[i] = combinacion[j];
					combinacion[j] = auxi;
				}
			}
		}
		
	/*	for (int r=0;r<combinacion.length; r++) {          // mostrar los números de la combinación ordenada
			System.out.print(ordenada[r]+" ");
		}*/
		
		for (int r=0;r<combinacion.length; r++) {          // mostrar los números ordenados del array original
			System.out.print(combinacion[r]+" ");
		}
	}
	}
