package service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Empleado;

public class EmpleadosServiceJsonImpl implements EmpleadosService{

	private String fichero= ("c:\\ficheroseclipse\\empleados.json");
//	Gson gson = new Gson();

	Gson gson=(new GsonBuilder())   //  hay que registrar el nuevo adaptador creado al usar el Gson para que sepa como se tratan fechas 
			.registerTypeAdapter(LocalDate.class, new Adaptador())
			.create();
	
	
	private Stream<Empleado> getJsonStream(){	          // método para obtener un Stream de empleados desde el JSON
		try(FileReader fr=new FileReader(fichero);){
			Empleado[] empleados=gson.fromJson(fr, Empleado[].class);
			return Arrays.stream(empleados);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
	}
	
	// recibe un empleado y lo guarda
	public void altaEmpleado (Empleado empleado) {
				
			
		ArrayList<Empleado> lista = new ArrayList<>(getJsonStream().toList());
					//añadimos el nuevo empleado
					lista.add(empleado);					
				
				try(FileWriter fw=new FileWriter(fichero);){//modo sobrescritura
					//y escribimos en el fichero la lista entera
					gson.toJson(lista, fw);
				//	System.out.println("empleado guardado!");
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}				
	}
	
	//devuelve la lista de empleados de un determinado departamento
	public List<Empleado>  empleadosPorDepartamento(String dpto) {			
			return  getJsonStream()					
					.filter( e -> e.getDepartamento().equalsIgnoreCase(dpto))
					.toList();	    
	}
	
	
	//devuelve una lista de departamentos
	
	public List<String> departamentos () {		
			return  getJsonStream()
					.map(c -> c.getDepartamento())
					.distinct()
					.toList();
	}	
}
