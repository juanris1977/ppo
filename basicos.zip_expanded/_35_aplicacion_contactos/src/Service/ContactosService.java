package Service;

import java.util.Collection;
import java.util.HashMap;


/*EJERCICIO AGENDA DE CONTACTOS
1.- Nuevo contactoo
2.- Buscar contacto
3.- Borrar contacto
4.- Mostrar todos los nombres 
5.- Salir

Opción 1: Se solicita el nombre del contacto y su número telefono y se guardará. Si ese número de telefono ya está siendo utilizado, el contacto no se guarda
Opción 2. Se pide el número de teléfono y te muestra el nombre del contacto
Opción 3. Se pide el número de teléfono y se elimina ese contacto*/



public class ContactosService {
	HashMap<Integer,String> contactos = new HashMap<>();
	
	
	public void nuevoContacto(Integer telefono, String nombre) {
		if (!contactos.containsKey(telefono)) {
		contactos.put(telefono, nombre);
		}
	}
	public String buscarContacto(Integer telefono) {
			
		return 	contactos.get(telefono);
	}
	public void borrarContacto(Integer telefono) {
		contactos.remove(telefono);
		
	}
	public String [] mostrarNombres() {	
		String [] res = new String[contactos.size()];
		Collection<String> col=contactos.values();
		int i=0;
		for (String n:col) {
			res[i]=n;
			i++;
		}
		return res;
		
		
		
	}

}
