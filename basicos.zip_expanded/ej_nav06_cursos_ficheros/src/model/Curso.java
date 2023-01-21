package model;

public class Curso {
	private String nombre;
	private String categoria;
	private double precio;
	private int duracion;
	
	public Curso(String nombre, String categoria, double precio, int duracion) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	

	
}
