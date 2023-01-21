package model;

import java.time.LocalDate;

public class Empleado {

	private String nombre;
	private LocalDate fecha;
	private	double salario;
	private String departamento;
	public Empleado(String nombre, LocalDate fecha, double salario, String departamento) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.salario = salario;
		this.departamento = departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
