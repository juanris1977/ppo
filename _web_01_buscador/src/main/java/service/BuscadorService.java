package service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.Pagina;

public class BuscadorService {
	List<Pagina> mispaginas=List.of(
			new Pagina(new String[] {"libros","ocio","musica"},"www.fnac.es","Fnac","Todo el libros y juegos"),
			new Pagina(new String[] {"libros","musica"},"www.fmbook.es","My music","La mejor web para múscia y libros"),
			new Pagina(new String[] {"juegos","ocio"},"www.gamer.es","The game","El mundo del gamer"),
			new Pagina(new String[]{"juegos","merchandising"},"www.friky.es","Friky","Regalos originales")
			);

	// recibe la temática y devuelve la lista de páginas asociadas a dicha temática	
	public List<Pagina> buscarPagina (String tematicabuscada) {
		return mispaginas.stream()   // Streams de paginas 
				         .filter(p -> Arrays.stream(p.getTemas()).anyMatch(c->c.equalsIgnoreCase(tematicabuscada)))
				         .toList();
	}
	
	//devuelve la lista de todos los temas registrados
	public List<String> temasRegistrados () {
		return mispaginas.stream()    // Stream<Pagina>
				         .flatMap(p -> Arrays.stream(p.getTemas()))  //  Stream<strings>
				         .distinct()
				         .toList();				         
	}
	
	
}
