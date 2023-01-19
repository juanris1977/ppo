package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Ciudad {
	private String nombre;
	private String pais;
	private int habitantes;
	private double temperatura;
}
