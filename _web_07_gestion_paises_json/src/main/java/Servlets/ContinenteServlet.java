package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PaisesService;


@WebServlet("/ContinenteServlet")
public class ContinenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaisesService service = new PaisesService();
		List<String> continentes = service.continentes();
		request.setAttribute("continentes", continentes);
		request.getRequestDispatcher("continentes.jsp").forward(request, response);
		
	}

}
