<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List , model.Empleado, java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		
		<br>
		<br>
	    <br>
	    <h2>Listado de empleados de <%=(String)request.getAttribute("Departamento")%></h2>
		<%List<Empleado> empleados=(List<Empleado>)request.getAttribute("ListaEmpleados");
		  DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-YYYY");%>		  
		
		<table border="4">
			<tr><th>  Nombre  </th><th>Departamento</th><th>  Salario  </th><th>Fecha de ingreso</th></tr>
			<%for(Empleado e: empleados){%>
				<tr>
					<td><%=e.getNombre()%> </td>
					<td><center><%=e.getDepartamento()%>  </center>	</td>
					<td><%=e.getSalario()%> </td>
					<td  align="right"><%=e.getFecha().format(formato)%> </td>				
				</tr>		
			<%}%>
		</table>
		<br>
		<br>
	    <br>
		<br>
		<a href="inicio.html"><strong>Volver a inicio</strong></a>
 </center>	

</body>
</html>