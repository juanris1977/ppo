package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Empleado;

public class EmpleadoService {
	ArrayList<Empleado> empleados = new ArrayList<>();
	String ruta="c:\\ficheroseclipse\\empleados.txt";
	DateTimeFormatter formatofecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void añadirEmpleado(String nombre, LocalDate fecha, double salario, String departamento) {
		
		try (FileOutputStream fos = new FileOutputStream(ruta,true);
				PrintStream out = new PrintStream(fos)){
				System.out.println(fecha);
				
				out.println(nombre +"|"+ fecha.format(formatofecha) +"|"+ salario +"|"+ departamento) ;
			}
			catch (FileNotFoundException ex) {
				ex.printStackTrace();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		
	}
	
	public Empleado masAntiguo() {
		Empleado res= null;
		LocalDate fechaantiguo = LocalDate.now(); 
			
		try (FileReader fr = new FileReader(ruta);
			 BufferedReader br = new BufferedReader (fr)) {
			
			String linea = br.readLine();
			while (linea!=null) {
				String [] datoslinea=linea.split("[|]");
				Empleado empleado = new Empleado (datoslinea[0], LocalDate.parse(datoslinea[1], formatofecha), Double.parseDouble(datoslinea[2]),datoslinea[3]);
				if (empleado.getFecha().isBefore(fechaantiguo)) {
					res = empleado;
					fechaantiguo = empleado.getFecha();
				}	
				 linea = br.readLine();
			}			
		}
		catch (FileNotFoundException exi) {
			exi.printStackTrace();
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}		
		return res;
	}
	
	public Empleado masSalario () {
		Empleado res= null;
		double salariomayor= 0;
			
		try (FileReader fr = new FileReader(ruta);
			 BufferedReader br = new BufferedReader (fr)) {
			
			String linea = br.readLine();
			while (linea!=null) {
				String [] datoslinea=linea.split("[|]");
				Empleado empleado = new Empleado (datoslinea[0], LocalDate.parse(datoslinea[1], formatofecha), Double.parseDouble(datoslinea[2]),datoslinea[3]);
				if (empleado.getSalario()>salariomayor) {
					res = empleado;
					salariomayor = empleado.getSalario();
				}	
				 linea = br.readLine();
			}			
		}
		catch (FileNotFoundException exi) {
			exi.printStackTrace();
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}		
		return res;
		
	}
	public ArrayList<Empleado> empleadosPorDepartamento(String dpto) {
		ArrayList<Empleado> res= new ArrayList<>();
		
			
		try (FileReader fr = new FileReader(ruta);
			 BufferedReader br = new BufferedReader (fr)) {
			
			String linea = br.readLine();
			while (linea!=null) {
				String [] datoslinea=linea.split("[|]");
				Empleado empleado = new Empleado (datoslinea[0], LocalDate.parse(datoslinea[1], formatofecha), Double.parseDouble(datoslinea[2]),datoslinea[3]);
				if (empleado.getDepartamento().equalsIgnoreCase(dpto)) {
					 res.add(empleado);		
					
				}	
				 linea = br.readLine();
			}			
		}
		catch (FileNotFoundException exi) {
			exi.printStackTrace();
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}		
		return res;
	}
	
	public ArrayList<Empleado> mostrarTodos() {
		ArrayList<Empleado> res=new ArrayList<>();
		
			
		try (FileReader fr = new FileReader(ruta);
			 BufferedReader br = new BufferedReader (fr)) {
			
			String linea = br.readLine();
			while (linea!=null) {
				String [] datoslinea=linea.split("[|]");
				Empleado empleado = new Empleado (datoslinea[0], LocalDate.parse(datoslinea[1], formatofecha), Double.parseDouble(datoslinea[2]),datoslinea[3]);
				
					 res.add(empleado);		
					 linea = br.readLine();										
			}			
		}
		catch (FileNotFoundException exi) { 
			exi.printStackTrace();
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}		
		return res;
	}
}
