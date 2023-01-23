package model;

public record Ciudad3(String nombre, String pais) {
	public Ciudad3 () {
		this (null, null);  //  todo constructor explicito de un record , debe llamar al constructor implicito
	}
}
