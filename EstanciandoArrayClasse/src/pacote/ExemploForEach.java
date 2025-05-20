package pacote;

import java.util.*;

public class ExemploForEach {

	public static void main(String[] args) {
		String[] nomes = new String[3];
		nomes[0] = "Karoline";
		nomes[1] = "Lucas";
		nomes[2] = "Andrea";
		
		ArrayList<String> listaNomes = new ArrayList();
		listaNomes.add(nomes[0]);
		listaNomes.add(nomes[1]);
		listaNomes.add(nomes[2]);
		Collections.sort(listaNomes);
		
		listaNomes.forEach((nom) -> {
			System.out.println(nom + "");
		});
	}

}
