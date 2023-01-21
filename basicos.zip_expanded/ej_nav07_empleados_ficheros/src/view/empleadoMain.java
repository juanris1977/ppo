package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Empleado;
import service.EmpleadoService;

public class empleadoMain {
	
	static EmpleadoService service = new EmpleadoService ();
	static Scanner sc = new Scanner(System.in);
	static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion ;
		
		
		do {
			mostrarMenu();
			opcion=Integer.parseInt(sc.nextLine());  // lee opcion elegida
			switch(opcion) {      // evaluamos
			case 1:
				mostrarTodos();
				break;
			case 2:
				empleadosDepartamento();
				break;   
			case 3:
				empleadoMasAntiguo();
				break;
			case 4:
				mayorSalario();
				break;
			case 5:
				nuevoEmpleado();
				break;			
			
			case 6: System.out.println("--- Adios ---");
			}
		}while(opcion!=6);
		
	}
	
	static void mostrarMenu() {
		
			System.out.println();
			System.out.println("1.- Mostrar todos los empleados ");
			System.out.println("2.- Mostrar empleados por departamento ");
			System.out.println("3.- Empleado más antiguo");
			System.out.println("4.- Empleado de mayor salario");
			System.out.println("5.- Nuevo empleado ");
			System.out.println("6.- Salir");
			System.out.println();
	}
	
	static void  empleadosDepartamento () {
		
		System.out.println("De qué departamento quieres ver sus empleados?");
		String dpto = sc.nextLine();
		ArrayList<Empleado> emp = service.empleadosPorDepartamento(dpto);
		
		if (emp.size()!=0) {				
			System.out.println("Empleados del departamento "+dpto+" :");
			for (Empleado e: emp) {
				System.out.println(e.getNombre() +" fue contratado el  "+ e.getFecha().format(formato) +" con un salario de  "+ e.getSalario() +" para el departamento de  "+ e.getDepartamento());
			}
			
		}
		else System.out.println("Aún no hay empleados en el departamento de "+dpto);
		
		
		
		
	}
	static void mostrarTodos() {
		ArrayList<Empleado> emp = service.mostrarTodos();
	
		for (Empleado e: emp) {
			System.out.println(e.getNombre() +" fue contratado el  "+ e.getFecha().format(formato) +" con un salario de  "+ e.getSalario() +" para el departamento de  "+ e.getDepartamento());
			
		}
		
		
	}
	static void empleadoMasAntiguo () {
		Empleado e = service.masAntiguo();
		System.out.println("El empleado más antiguo es: ");
		System.out.println(e.getNombre() +" que fue contratado el  "+ e.getFecha().format(formato) +" con un salario de  "+ e.getSalario() +" para el departamento de  "+ e.getDepartamento());


	}
	static void mayorSalario() {
		Empleado e = service.masSalario();
		System.out.println("El empleado con mayor salario es: ");
		System.out.println(e.getNombre() +" que fue contratado el  "+ e.getFecha().format(formato) +" con un salario de  "+ e.getSalario() +" para el departamento de  "+ e.getDepartamento());

	}
	static void nuevoEmpleado() {
		String nombre, dpto;
		double salario;
		LocalDate fecha;
		
		boolean fechainvalida= true;
		
		System.out.println("Introduce el nombre: ");
		nombre= sc.nextLine();
		System.out.println("Introduce el departamento: ");
		dpto= sc.nextLine();
		System.out.println("Introduce el salario: ");
		salario =  Double.parseDouble(sc.nextLine());
		
		while (fechainvalida) {
			try {
				System.out.println("Introduce la fecha de alta (dd/mm/aaaa): ");
				fecha = LocalDate.parse(sc.nextLine(), formato);
				fechainvalida= false;
				service.añadirEmpleado(nombre, fecha, salario, dpto);
			}
			catch (DateTimeParseException ex) {
				System.out.println("El formato de fecha es invalido, introduzca de nuevo. ");
				continue;
			}
		}
	}

}
