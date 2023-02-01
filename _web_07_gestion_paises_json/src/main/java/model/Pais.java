package model;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pais {
	private String name;
	private String capital;
	private String region;
	private long population;
	private String flag;
	private String[] borders;
	private String alpha3Code;
	
	
}

