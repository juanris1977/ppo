package main;

import service.BuscadorService;

public class Test {
	static BuscadorService service = new BuscadorService();
	public static void main(String[] args) {
		System.out.println(service.buscador("libros"));
			
	}

}
