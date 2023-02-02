package service;

import java.util.List;

import model.Pais;

public interface PaisesService {

	// metodo que devulve la lista de continentes
	List<String> continentes();

	List<Pais> paisesContinente(String cte);

	List<String> frontera(String pais);

	String nombre(String nom);

}