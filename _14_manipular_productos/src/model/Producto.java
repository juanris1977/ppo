package model;

public class Producto {
	private String nombre_producto;
	private double precio;
	private String categoria;
	public Producto(String nombre_producto, double precio, String categoria) {
		super();
		this.nombre_producto = nombre_producto;
		this.precio = precio;
		this.categoria = categoria;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCartegoria(String cartegoria) {
		this.categoria = cartegoria;
	}

}
