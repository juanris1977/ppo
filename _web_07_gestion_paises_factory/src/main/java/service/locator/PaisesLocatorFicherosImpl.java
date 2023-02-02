
package service.locator;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Pais;

public class PaisesLocatorFicherosImpl implements PaisesLocator {

	String ruta="c:\\Ficheroseclipse\\paises.json";	
	Gson gson=new Gson();
	
	@Override
	public Stream<Pais> getJsonStream(){
		   // Para acceder a un JSON en un fichero 
		try(FileReader fr=new FileReader(ruta);){
			Pais[]paises=gson.fromJson(fr, Pais[].class);
			return Arrays.stream(paises);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
	}
}
