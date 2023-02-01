package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PaisesService;


@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaisesService service = new PaisesService();
		String pais = request.getParameter("pais");
		List<String> fronteras = service.frontera(pais);
		request.setAttribute("Fronteras", fronteras);
		request.setAttribute("Pais", pais);
		request.getRequestDispatcher("infopais.jsp").forward(request, response);

		
	}

}
