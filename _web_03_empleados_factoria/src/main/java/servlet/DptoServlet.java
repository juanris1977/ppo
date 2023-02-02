package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmpleadosFactory;
import service.EmpleadosService;


@WebServlet("/DptoServlet")
public class DptoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpleadosService service = EmpleadosFactory.getEmpleadosService();	
	
		List<String> departamentos = service.departamentos();
		request.setAttribute("departamentos", departamentos);
		request.getRequestDispatcher("departamentos.jsp").forward(request, response);
	}

}
