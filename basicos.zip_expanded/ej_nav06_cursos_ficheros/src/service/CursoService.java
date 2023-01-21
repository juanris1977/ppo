package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

import model.Curso;

public class CursoService {
	
	String ruta="c:\\ficheroseclipse\\cursosnav.txt";
	HashSet <Curso> cursos = new HashSet<>();
	
	public  void añadirCurso(String nombre, String categoria, double precio, int duracion ) {
			
		
		
		try (FileOutputStream fos = new FileOutputStream(ruta,true);
			PrintStream out = new PrintStream(fos)){
			out.println(nombre +"|"+ categoria +"|"+ precio +"|"+ duracion) ;
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
			
				
	}
	
	public Curso cursoMasCaro(){
		Curso res = null;
		try (FileReader fr = new FileReader(ruta);
		    BufferedReader br = new BufferedReader(fr)){
			String linea;
			double mascaro= 0;
			while ((linea= br.readLine())!=null) {             //leo el texto de una linea
				String [] datos = linea.split("[|]");          //creo array con las partes de la linea
				Curso c =new Curso(datos[0],datos[1],Double.parseDouble(datos[2]),Integer.parseInt(datos[3]));    // Creo el curso con el contenido
																										        //adecuadamente formateado del array
				if (c.getPrecio()>mascaro) {
					mascaro= c.getPrecio();
					res = c;
				}				
			}				
		}
		
		catch (FileNotFoundException ex) {
			try (FileOutputStream fos = new FileOutputStream (ruta, true);
				PrintStream out= new PrintStream (fos);) {}
			
				catch (FileNotFoundException exi) {
					exi.printStackTrace();
				}
				catch (IOException exi) {
					exi.printStackTrace();
				}
		}		
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return res;	
				
	}
	
	public ArrayList<Curso>  cursosCategoria(String categoria) {
		
		ArrayList<Curso> res = new ArrayList<>();
		try (FileReader fr = new FileReader(ruta);
			    BufferedReader br = new BufferedReader(fr)){
				String linea;
		
				while ((linea= br.readLine())!=null) {             //leo el texto de una linea
					String [] datos = linea.split("[|]");          //creo array con las partes de la linea
					Curso c =new Curso(datos[0],datos[1],Double.parseDouble(datos[2]),Integer.parseInt(datos[3]));    // Creo el curso con el contenido
					if (c.getCategoria().equalsIgnoreCase(categoria)) {
						res.add(c);
					}
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
	
	public ArrayList<Curso> actualizarDuracion(int duracion) {
		
		ArrayList<Curso> cambiados = new ArrayList<>();
		ArrayList<Curso> iguales = new ArrayList<>();
		try (FileReader fr = new FileReader(ruta);
			    BufferedReader br = new BufferedReader(fr)){
				String linea;
			
				while ((linea= br.readLine())!=null) {             //leo el texto de una linea
					String [] datos = linea.split("[|]");          //creo array con las partes de la linea
					Curso c =new Curso(datos[0],datos[1],Double.parseDouble(datos[2]),Integer.parseInt(datos[3]));    // Creo el curso con el contenido
					if (c.getDuracion()>duracion) {
						c.setDuracion(c.getDuracion()-(10*c.getDuracion()/100));    // Si la duracción es mayor tengo que reducirla
																			// pero necesito saber a qué cursos se la he reducido 
																			// para ello me creo 2 arraylist 
																			// y luego generaré el fichero con la suma de ambos
						cambiados.add(c);            
					}
					else {
						iguales.add(c);
					}
					
				}
		}
		catch (FileNotFoundException exi) {
			exi.printStackTrace();
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}
		
		// genero de nuevo el fichero desde cero 
		 // empiezo a escribir sobreescribiendo  , es una forma de crear de cero el fichero
		try (FileOutputStream fosi = new FileOutputStream (ruta, false)) {
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		// añado en el fichero los datos que hemos cambiado anteriormente
		for (Curso c: cambiados) { 
			
	    	String datos=(c.getNombre() +"|"+ c.getCategoria() +"|"+ c.getPrecio() +"|"+ c.getDuracion());
			try (FileOutputStream fos = new FileOutputStream (ruta, true);  //pero cuando escribo de verdad, añado datos
				 PrintStream out= new PrintStream (fos);) {
				 out.println(datos);
					
			}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
	    }
		
		// añadimos los que no cambiaron
		for (Curso c: iguales) { 
			
	    	String datos=(c.getNombre() +"|"+ c.getCategoria() +"|"+ c.getPrecio() +"|"+ c.getDuracion());
			try (FileOutputStream fos = new FileOutputStream (ruta, true);  //pero cuando escribo de verdad, añado datos
				 PrintStream out= new PrintStream (fos);) {
				 out.println(datos);
					
				}
				catch (FileNotFoundException ex) {
					ex.printStackTrace();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
	    }
		
		return cambiados;
		
	}
	
	public ArrayList<Curso> mostrarTodos () {
		ArrayList<Curso> res = new ArrayList<>();
		try (FileReader fr = new FileReader(ruta);
			    BufferedReader br = new BufferedReader(fr)){
				String linea;
			
				while ((linea= br.readLine())!=null) {             //leo el texto de una linea
					String [] datos = linea.split("[|]");          //creo array con las partes de la linea
					Curso c =new Curso(datos[0],datos[1],Double.parseDouble(datos[2]),Integer.parseInt(datos[3]));    // Creo el curso con el contenido
					
						res.add(c);
					
				}
		}
		catch (FileNotFoundException exi) {
			System.out.println("Aún no hay cursos");
		}
		catch (IOException exi) {
			exi.printStackTrace();
		}
		return res;
	}
	public boolean existeCurso(String cursobuscado ) {
		boolean existe=false;
		try (FileReader fr = new FileReader(ruta);
			    BufferedReader br = new BufferedReader(fr)){
				String linea;
			
				while ((linea= br.readLine())!=null) {             //leo el texto de una linea
					String [] datos = linea.split("[|]");          //creo array con las partes de la linea
					Curso c =new Curso(datos[0],datos[1],Double.parseDouble(datos[2]),Integer.parseInt(datos[3]));    // Creo el curso con el contenido
					if (c.getNombre().equalsIgnoreCase(cursobuscado)) {
						existe=true;
						break;
					}
					
				}
		}
		catch (FileNotFoundException ex)                  {
			try (FileOutputStream fos = new FileOutputStream (ruta, true);
				PrintStream out= new PrintStream (fos);) {}
			
			catch (FileNotFoundException exi) {
				exi.printStackTrace();
			}
			
			catch (IOException exi) {
				exi.printStackTrace();
			}
			
			
			}
		
		catch (IOException ex) 	{
			ex.printStackTrace();
	
		}
		return existe;
	}
}
