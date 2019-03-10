package com.org;

import java.util.ArrayList;
import java.util.List;

import com.org.data.Livre;

public class ProduitService {
	private static final List<Livre> data = new ArrayList<>();

	public static List<Livre> getAllProduits() {
		if(data.size()==0) {
			for(int i=0; i<500; i++) {
				Long prix = new Long(5 + i/2);
				Livre livre = new Livre("nom_"+i, "code_"+i, prix);
				
				Long prix2 = new Long(8 + i/2);
				Livre livre2 = new Livre("nom_"+i, "EXTRA"+i, prix);
				
				data.add(livre);
				data.add(livre2);
			}
		}
		return data;
	}
}
