<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" import="java.util.List "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 60%;
}


tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<body>
	<center>
		
		<br>
		<br>
	    <br>
	    <h2>Paises fronterizos con   <u><%=(String)request.getAttribute("Pais")%></u>:</h2>
	    <br>
		<br>
	    <br>
		<%List<String> fronteras=(List<String>)request.getAttribute("Fronteras");
		 %>		  
		
		<table border="4" cellpadding="5">
			<%for(String e: fronteras){%>
				<tr>
					<td><center><%=e%> </center>	</td>					
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