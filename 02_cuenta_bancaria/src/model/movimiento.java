package model;

public class movimiento {
	private int cantidad;
	private String tipo;
	
	public movimiento(int cantidad, String tipo) {
		super();
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
