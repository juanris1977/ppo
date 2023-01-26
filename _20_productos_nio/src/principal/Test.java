package principal;

import java.util.List;

import service.ProductosServiceNio;

public class Test {

	public static void main(String[] args) {
		ProductosServiceNio service=new ProductosServiceNio();
		List<String> prods=List.of("pollo","cerveza","pizza");
		service.grabarProductos(prods);
		service.listaProductos().forEach(System.out::println);

	}

}
