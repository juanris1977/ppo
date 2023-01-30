package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import model.Curso;

public class TestLectura {

	public static void main(String[] args) {
		String ruta = "C:\\ficheroseclipse\\cursos.json";
		// Leer el contenido del fichero y mostrar los datos de todos los cursos 
		
		
		try 
			(FileReader fr = new FileReader(ruta);){
				Gson migson = new Gson();
				   Curso[] cursos = migson.fromJson(fr, Curso[].class);  // aqui le decimos que lea del Json y lo guarde en nuestro javabean
				for (Curso c :cursos ) {
					System.out.println(c);
					
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		}
		
		
}


