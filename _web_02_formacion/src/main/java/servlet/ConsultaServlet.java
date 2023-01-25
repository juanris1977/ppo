package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Alumno;
import service.FormacionService;
            
@WebServlet("/ConsultaServlet")
public class ConsultaServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// debe recoger la lista de nombres de cursos, guardarla en algun 
		// Lugar que sea accesible para el jsp, y despues transferir el control
		// a la pagina seleccion.,jsp
		
		FormacionService  service = new  FormacionService();
		
		
		List<String> listacursos = service.nombresCursos();  // Me quedo con la lista de cursos
		request.setAttribute("ListaCursos", listacursos);   // Guardamos la lista de cursos para ser accesible al jsp
		
		//transferir el control al JSP

		request.getRequestDispatcher("seleccion.jsp").forward(request, response);
	}

}
