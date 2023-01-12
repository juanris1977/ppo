package novedades;


interface Calculadora {
	int sumar(int a, int b);
	int restar(int a, int b);
	
	default int multiplicar(int a, int b) {
		return a*b;
	}
	
	default int sumatorio(int[] nums) {
		int suma= 0;
		for (int n : nums) {
			suma=suma+n;			
		}
		return suma;
	}
}

interface Estadisticas {
	int media(int [] nums);
	
	default int sumatorio(int[] nums) {
		return nums[0]+nums[nums.length-1];
	}
}

class Matematicas implements Calculadora, Estadisticas {

	@Override
	public int media(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}


	
	/*@Override     //  sumatorio hay que sobreescribirlo porque estaba como default en ambos interface
	public int sumatorio(int[] nums) {
		return 0;
	}*/
	
	@Override 
	public int sumatorio(int[] nums) {
		// TODO Auto-generated method stub
		return Calculadora.super.sumatorio(nums);    //  Es la forma de "elegir" el método del interfaz Calculadora
	}
	
	
	/*@Override
	public int sumatorio(int[] nums) {
		// TODO Auto-generated method stub           //  Es la forma de "elegir" el método del interfaz Matematicas
		return Estadisticas.super.sumatorio(nums);  */
	}
	
		
	

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,5,8,9};
		
		Matematicas m = new Matematicas();
		System.out.println("resta: "+m.restar(4, 2));
		System.out.println("suma: "+m.sumar(4, 2));
		System.out.println("multiplicar: "+m.multiplicar(4, 2));
		System.out.println("sumatorio: "+m.sumatorio(nums));
		System.out.println("sumatorio: "+m.sumatorio(new int [] {1,3,5,8,9}));
	
		
	}

}
