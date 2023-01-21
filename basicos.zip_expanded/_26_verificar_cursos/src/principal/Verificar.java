package principal;

public class Verificar {

	public static void main(String[] args) {
		String cadena="Java básico,Python,JavaEE,JavaScript,Angular 10,Big data";
		// cuantos cursos empiezan por java?
		String[] cursos=cadena.split(",");
		int cuantos= 0;
		for (int i=0;i<cursos.length; i++) {
			if (cursos[i].startsWith("Java")) {
				cuantos++;
			}
					
		}
		System.out.println(cuantos);
	}

}
