package model;

public class Ciudad {
	private String nombre;
	private String pais;
	public Ciudad(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nombre+":"+pais;
	}
	
	

}
