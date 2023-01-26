<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<br><br><br><br>
		
		<form action="EmpleadosServlet">
			<select name="dpto">
				 <option value="selecciona">Selecciona un departamento</option>
				<%List<String> deps=(List<String>)request.getAttribute("departamentos");
				for(String s:deps){%>
					<option value = "<%=s%>"><%=s%></option>
				<%}%>
			</select>
			<br><br><br><br><br><br><br><br>
			<input type="submit" value="Ver empleados">
		</form>
	
	
	</center>

</body>
</html>