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

@WebServlet("/SeleccionServlet")
public class SeleccionServlet extends HttpServlet {
	
	// recoge el parametro que contiene el nombre del curso seleccionado
	// obtiene la lista de alumnos de ese curso, la guarda en lugar accesible 
	// para el jsp y transfiere el control a alumnos.jsp
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FormacionService  service = new  FormacionService();
		
		String nombreCurso = request.getParameter("curso");
		
		List<Alumno> alumnos = service.listaAlumnos(nombreCurso);
		request.setAttribute("ListaAlumnos", alumnos);
		double media = service.notaMediaCurso(nombreCurso);
		request.setAttribute("NotaMedia", media);
		request.getRequestDispatcher("alumnos.jsp").forward(request, response);
		
	}

}
