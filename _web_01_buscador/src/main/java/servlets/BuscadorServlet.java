package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pagina;
import service.BuscadorService;

//informa al servidor de aplicaciones que la clase es un servlet y tiene la dirección indicada
@WebServlet("/BuscadorServlet")
public class BuscadorServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//creamos un objeto de la capa de negocio
		BuscadorService buscaservice = new BuscadorService();
		
		// recoge el parámetro(datos enviados desde la página cliente) que contiene el tema de busqueda
		String tema = request.getParameter("tema");
		
		// Obtenemos lista de paginas de diho tema
		List<Pagina> paginas=buscaservice.buscarPagina(tema);
		
		//guardamos la lista en un atributo de peticion para que pueda recogerlo la JSP
		request.setAttribute("resultado de paginas",paginas);
		
		//transferir el control al JSP
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
		
	}

}
