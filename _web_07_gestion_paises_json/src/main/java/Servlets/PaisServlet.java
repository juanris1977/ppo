package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisesService;


@WebServlet("/PaisServlet")
public class PaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaisesService service = new PaisesService();
		String continente = request.getParameter("continente");
		List<Pais> paises = service.paisesContinente(continente);
		request.setAttribute("Continente", continente);
		request.setAttribute("Paises", paises);		
		request.getRequestDispatcher("paises.jsp").forward(request, response);
		
	}

}
