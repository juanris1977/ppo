package model;

public class Alumno {
	
	//atributos
	private String nombre;
	private String curso;
	private double nota;
	private String email;
	
	//constructor que permite inicializar el objeto con datos
	public Alumno(String nombre, String curso, double nota, String email ) {
		this.nombre=nombre;
		this.curso=curso;
		this.nota=nota;
		this.email=email;
		
	}
	
	//setter y getter , para cada atributo tenemos un set (grabar) , y un get (leer)
	
	public void setNombre(String nombre) {   // se usa para asignar un valor al atributo
		this.nombre=nombre;
	}
	public String  getNombre() {
		return nombre;
	}
	public void setCurso(String curso) {   // se usa para asignar un valor al atributo
		this.curso=curso;
	}
	public String  getCurso() {
		return curso;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getNota(double nota) {
		return nota;
	
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String  getEmail() {
		return email;
	}



}
