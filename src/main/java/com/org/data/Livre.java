package com.org.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livre {
	private String nom = "";
	private String code = "";
	private Long prix = null;
	
}
