package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
	};		
		
	public void subirPrecio (Double subida, Predicate<Producto> cond) {		
		misproductos.replaceAll ( a -> {if(cond.test(a)) {
														a.setPrecio(a.getPrecio()+a.getPrecio()*subida/100);
														}										
										return a;			
										}
								); 
	};		
		
	
	//  
	/*
	public void productoPrecioCategoria (UnaryOperator <Producto> fun , Predicate <Producto> cond) {
		
		for (Producto p: misproductos) {
			if (cond.test(p)) {
				fun.apply(p);
			}
		}
	}

	// este es llamado desde el main con un porcentaje y una categoria a subir 
	public void subirPrecioCategoria(Double subida , String cat) {
		
		// este es el que he definido propio que hace una funcion y un predicate
		productoPrecioCategoria(a->{ a.setPrecio(a.getPrecio()+a.getPrecio()*subida/100);
							return a;			
							},
						b->b.getCategoria().equalsIgnoreCase(cat)			
						);
	}
	
*/
	
		
	
	
	
	public void ordenar () {
		//misproductos.sort( (a,b) -> (int)a.getPrecio() - (int)b.getPrecio() );  // no vale porque los precios separados po decimales los interpreta como iguales
		misproductos.sort( (a,b) ->Double.compare (a.getPrecio(), b.getPrecio() ) );
		
	}
	
	public void eliminarProducto (String categoria) {
		
		misproductos.removeIf(c -> c.getCategoria().equalsIgnoreCase(categoria));
		
	}
	
	/*public List<Producto> mostrarProductos () {
		ArrayList <Producto> res = new  ArrayList<>();
		 for (Producto p: misproductos) {
			 res.add(p);
		 }
		return res;*/
	public List<Producto> mostrarProductos () {
		return misproductos;
		//misproductos.forEach(a -> System.out.println(a.getNombre_producto()+ " "+ a.getPrecio()+" "+a.getCategoria()));		
	}
}
