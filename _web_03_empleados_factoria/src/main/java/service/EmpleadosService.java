package service;

import java.util.List;

import model.Empleado;

public interface EmpleadosService {

	void altaEmpleado (Empleado empleado);	
	List<Empleado>  empleadosPorDepartamento(String dpto);
	List<String> departamentos ();
	
}
	