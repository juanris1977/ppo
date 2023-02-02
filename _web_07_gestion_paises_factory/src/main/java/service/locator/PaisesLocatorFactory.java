package service.locator;

import service.PaisesService;

public class PaisesLocatorFactory {
	public static PaisesLocator getPaisesLocator() {
		//return new PaisesLocatorWebImpl();
		return new PaisesLocatorFicherosImpl();
	}

}
