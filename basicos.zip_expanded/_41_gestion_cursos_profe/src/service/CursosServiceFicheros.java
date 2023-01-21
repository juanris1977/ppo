package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import model.Curso;
/*
1.- Añadir curso
2.- Buscar curso
3.- Duración media de cursos
4.- Cursos por temática
5.- Eliminar cursos por precio
6.- Mostrar todos los cursos
7.- Salir
*/
public class CursosServiceFicheros {

	String ruta ="C:\\ficheroseclipse\\cursos.txt";
	
	//  En el constructor creamos el fichero vacio
	
	public CursosServiceFicheros() {
		File file = new File (ruta);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public boolean agregarCurso(Curso curso) {
		try(FileReader fr=new FileReader(ruta);
			BufferedReader bf=new BufferedReader(fr);){
			String s;
			while((s=bf.readLine())!=null) {
				//si encontramos curso con dicho nombre, salimos
				if(s.split("[|]")[0].equals(curso.getNombre())) {
					return false;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		//aqui llega si no encuentra curso, y entonces lo tiene
		//que grabar en el fichero
		try(FileOutputStream fos=new FileOutputStream(ruta,true);
			PrintStream out=new PrintStream(fos);){
			out.println(curso.getNombre()+"|"+curso.getPrecio()+"|"+curso.getDuracion()+"|"+curso.getTematica());
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return true;
		
	}
	
	
	
	
	public Curso buscarCurso(String cursobuscado ) {
		Curso curso = null;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader bf=new BufferedReader(fr);){
				String s , linea;
				while((s=bf.readLine())!=null) {
					String[] linea1=s.split("[|]");  
					Curso c =new Curso(linea1[0],Integer.parseInt(linea1[1]),Double.parseDouble(linea1[2]),linea1[3]);
					if (c.getNombre().equalsIgnoreCase(cursobuscado)) {
						curso = c;
						break;
					}
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		return curso;
	}
	
	public double duracionMedia() {
		double media=0;
		int contador=0;
		
		try (FileReader    fr =new FileReader(ruta);
			BufferedReader bf= new BufferedReader(fr);){
					
			String fila;  
			while ((fila= bf.readLine())!=null) {
				String[] linea=fila.split("[|]");  
				Curso c =new Curso(linea[0],Integer.parseInt(linea[1]),Double.parseDouble(linea[2]),linea[3]);
				media=media+c.getDuracion();
				contador++;
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return media/contador ;
		
		
	}
		
	
	
	public List<Curso> cursosTematica(String tematica) {
		List<Curso> res = new ArrayList<>();
		
		try (FileReader    fr =new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr);){
					
			String fila;  
			while ((fila= bf.readLine())!=null) {
				String[] linea=fila.split("[|]");  
				
				if (linea[3].equalsIgnoreCase(tematica)) {
					Curso c =new Curso(linea[0],Integer.parseInt(linea[1]),Double.parseDouble(linea[2]),linea[3]);
					res.add(c);
				}
			}
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return res;
		
	}
	
	public void  eliminarCurso(int precio) {
	
			
		// Me llevo a un arraylist de cursos los que son menores que el precio dado
		 ArrayList<Curso> res = new ArrayList<>();
		 	
			try (FileReader    fr =new FileReader(ruta);
				BufferedReader bf= new BufferedReader(fr);){
						
				String fila;  
				while ((fila= bf.readLine())!=null) {
					String[] linea=fila.split("[|]");  
					Curso c =new Curso(linea[0],Integer.parseInt(linea[1]),Double.parseDouble(linea[2]),linea[3]);					
					
						res.add(c);
				
				}
			}
			catch (FileNotFoundException ex) {
					ex.printStackTrace();
			}
			catch (IOException ex) {
					ex.printStackTrace();
			}
			
			// eliminamos los que no queremos
			
			res.removeIf( c -> c.getPrecio() > precio);  // removeif necesita un predicado
			
			 
			
			
			try (FileOutputStream fos = new FileOutputStream (ruta, false);  //machacamos el fichero anterior
					 PrintStream out= new PrintStream (fos);) {
			
				for (Curso c: res) { 
				
					String datos=c.getNombre()+"|"+c.getDuracion()+"|"+c.getPrecio()+"|"+c.getTematica();				
					out.println(datos);						
				}
			}
			catch (FileNotFoundException ex) {
					ex.printStackTrace();
			}
				catch(IOException ex) {
				ex.printStackTrace();
					}
    }
		
			
	
	
	
	public ArrayList<Curso>  mostrarTodos () {
		 ArrayList<Curso> res = new ArrayList<>();
		 	
	try (FileReader    fr =new FileReader(ruta);
			BufferedReader bf= new BufferedReader(fr);){
				
		String fila;  
		while ((fila= bf.readLine())!=null) {
			String[] linea=fila.split("[|]");  
			Curso c =new Curso(linea[0],Integer.parseInt(linea[1]),Double.parseDouble(linea[2]),linea[3]);
			res.add(c);
	
		}
	}
	catch (FileNotFoundException ex) {
			ex.printStackTrace();
	}
	catch (IOException ex) {
			ex.printStackTrace();
	}
	return res;
	
	
		}
			 
	}

