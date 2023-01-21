package service;

import java.util.ArrayList;


/*       ENUNCIADO PROGRAMA NOTAS:
Realizar un programa para la gestión de notas. Al iniciarse el programa, se presentará en pantalla el siguiente menú:
1-  Grabar nota
2.- Calcular media
3.- Aprobados
4.- Notas extremas
5.- Mostrar todas
6.- Eliminar suspensos 
7.- Salir    */

public class NotasService {
	ArrayList<Double> notas =new ArrayList<>();
	
	public void guardarNota(double nota) {
		notas.add(nota);
	}
	
	public double media(){
		double media=0;
		/*for (int i=0;i<notas.size();i++) {
			media=media+notas.get(i); 
		}*/
		
		for (double n:notas) {
			media=media+n;
		}
		
		media=media/notas.size();
		return media; 
	}
	
	public int aprobados() {
		int aprobados=0;
		for (int i=0;i<notas.size();i++) {
			if (notas.get(i)>=5) aprobados++;
		}
	
		
		return aprobados;
	}
	
	public double notaMax () {
		double maximo=notas.get(0);
		for (int i=0;i<notas.size();i++) {
			maximo=Math.max(maximo,notas.get(i));
		}
		return maximo;
	}
	
	public double notaMin () {
		double minimo=notas.get(0);
		for (int i=0;i<notas.size();i++) {
			minimo=Math.min(minimo,notas.get(i));
		}
		return minimo;
	}
	
	public double[] notas () {
		double[] res=new double[notas.size()];
		for (int i=0;i<notas.size();i++) {
			res[i]=notas.get(i);
		}
		return res;
	}
	
	public void  eliminarSuspensos() {
		
		for (int i=0;i<notas.size();i++) {
			if (notas.get(i)<5) {
				notas.remove(i);
			}
		}
		
	}
	public void subirNotas() {
		for (int i=0; i<notas.size();i++) {
			if (notas.get(i)<=9) {
				notas.set(i,notas.get(i)+1);
			}
		}
	}
}
