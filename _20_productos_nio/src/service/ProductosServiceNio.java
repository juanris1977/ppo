package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ProductosServiceNio {
	private Path ruta= Path.of("c:\\ficheroseclipse\\productos.txt");
	
	//método que devuelve la lista de productos
	public List<String> listaProductos() {
		
		try {
			return Files.readAllLines(ruta);   // Devuelve directamente una lista con las lineas 
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
		
	//método que a partir del numbre de un producto, nos dice
	//si está o no almacenado
	public boolean existeProducto(String producto) {
		try {
			return Files.lines(ruta)   //  Devuelve un stream con las lineas del fichero, Stream<String>
				   .anyMatch(s->s.equalsIgnoreCase(producto));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}			
	}
	
	//método que recibe un producto y lo guarda
	public void grabarProducto(String producto) {
		try {
			Files.writeString(ruta, producto+System.lineSeparator(), StandardOpenOption.APPEND);
			//Ojo, que el writeString no genera salto de linea
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void grabarProductos(List<String> productos) {
		try {
			Files.write(ruta, productos, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

