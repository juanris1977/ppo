package model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Empleado {
	private String nombre;
	private String departamento;
	private double salario;
	private Date fecha;
	
}
