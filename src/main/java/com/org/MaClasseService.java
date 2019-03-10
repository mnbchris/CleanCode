package com.org;

import java.util.List;

import com.org.data.Livre;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MaClasseService {
	/**recuperer toute la liste des livre en base puis pour chaque livre, on verifie :
	* que le code du livre est identique au code en parametre de la fonction. Si c'est le cas on 
	* le compte et on retourne le nombre de livre total
	*/
	public Integer f(String c) {
		Integer r = 0;
		if(c!=null && !c.isEmpty()) {
			List<Livre> data = ProduitService.getAllProduits();
			for(Livre l : data) {
				if(l.getCode().equals(c)) {
					r+=1;
				}
			}
		}
		return r;
	}
	
	//TODO : la documentation n'est pas une option
	public Integer f2(List<Livre> yo) {
		int nb = 0;
		for(Livre li : yo) {
			nb +=li.getPrix();
		}
		return (nb/(yo.size()));
	}
	
	//TODO : commentaire s'il vous plait. desinformation
	public Livre rechercherDansLaListeLeLivreLemoinsCherDuMarcheFrancophone(List<Livre> yo) {
		//TODO doumenter ce que c'est ce nombre
		int nb = 0;
		Livre livre1 = yo.get(0);
		for(Livre livre2 : yo) {
			if(livre1.getPrix()>livre2.getPrix()) {
				livre1=livre2;
			}
		}
		return livre1;
	}
}
