<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List , model.Alumno"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <center>
		<h2>Listado de alumnos</h2>
		
		<%List<Alumno> alumnos=(List<Alumno>)request.getAttribute("ListaAlumnos");%>
		<table border="4">
			<tr><th>Nombre</th><th>Edad</th><th>Nota</th></tr>
			<%for(Alumno a:alumnos){%>
				<tr>
					<td><%=a.nombre()%> </td>
					<td><%=a.edad()%> </td>
					<td><%=a.nota()%> </td>
				
				</tr>
		
			<%}%>
		</table>
		<br>
		<br>
		<a href="ConsultaServlet"><strong>Volver</strong></a>
 </center>		
</body>
</html>