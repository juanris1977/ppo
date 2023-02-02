<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List , model.Pais, java.text.NumberFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
	    <h2>Listado de paises del continente de <u><%=(String)request.getAttribute("Continente")%></u></h2>
	    <br>
	    <h4>(Pincha sobre el nombre del país para ver los paises adyacentes)</h4>
	   
		<br>
	    <a href="ContinenteServlet"><strong>Volver a elegir continente</strong></a>
	    <br>
		<br>
	    
		<%List<Pais> paises=(List<Pais>)request.getAttribute("Paises");
		NumberFormat formato = NumberFormat.getIntegerInstance();
		 %>		  
		
		<table border="4" cellpadding="5">
			<tr><th><FONT SIZE=4>  Pais  </FONT></th><th><FONT SIZE=4>  Capital  </FONT> </th><th><FONT SIZE=4>  Población  </FONT></th><th><FONT SIZE=4>  Bandera  </FONT></th></tr>
			<%for(Pais p: paises){%>
				<tr>
					<td><center><a href="InfoServlet?pais=<%=p.getName()%>"><%=p.getName()%> </center></td>					
					<td><center><%=p.getCapital()%> </center></td>
					<td><center><%=formato.format(p.getPopulation())%> </center></td>
					<td><center><img src=<%=p.getFlag()%>  alt=" " width="50" height="50"> </center></td>		
				</tr>		
			<%}%>   
		</table>
		<br>
		<br>
	    <br>
		<br>
		<a href="ContinenteServlet"><strong>Volver a elegir continente</strong></a>
 </center>	
</body>
</html>