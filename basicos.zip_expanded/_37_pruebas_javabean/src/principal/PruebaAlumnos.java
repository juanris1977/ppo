package principal;

import model.Alumno;
import model.Empleado;

public class PruebaAlumnos {

	public static void main(String[] args) {
		Alumno al=new Alumno("alumno 1","Java",8,"alumno1@gmail.com");
		System.out.println("nombre: "+al.getNombre());
		System.out.println("curso: "+al.getCurso());
		
		// array empleados
		Empleado[] empleados= new Empleado [10];
		empleados[0]=new Empleado("Juan","12345678W", 3000); 
	}

}
