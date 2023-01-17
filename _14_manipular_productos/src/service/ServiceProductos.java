package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ServiceProductos {

	List <Producto> misproductos = new ArrayList<>();
	
	public void altaProducto (Producto producto) {
		misproductos.add(producto);
	}
	
	public void subirPrecio (Double subida) {		
		misproductos.replaceAll ( a -> { a.setPrecio(a.getPrecio()+a.getPrecio()*subida/100);
										return a;			
										}
		);		
	}
	public void ordenar () {
		misproductos.sort( (a,b) -> (int)a.getPrecio() - (int)b.getPrecio() );
		
	}
	
	public void eliminarProducto (String categoria) {
		
	}
	
	public List<Producto> mostrarProductos () {
		ArrayList res = new  ArrayList<Producto>();
		
		return res;
		
	}
}
