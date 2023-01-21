package principal;

public class UsoVariables {
	int global;
	public static void main(String[] args) {
		int data; // solo declarar la variable 
		data=230; // asignado
		
		int myvar=10; // declarar y asignar 
		
		System.out.println(data);
		System.out.println(myvar);
		
		int n; //las variables no se inicializan por defecto
		//System.out.println(n);  daria error por no estar inicializada n
	}
	
 public void m1() {
	global=1;
}
	public void m2() {
		System.out.println(global);
	}
}
