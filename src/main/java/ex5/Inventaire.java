package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 5));
		caisses.add(new Caisse("Moyens objets", 20));
		caisses.add(new Caisse("Grands objets", 1000));
	}

	public void addItem(Item item) {
		for(Caisse caisse : caisses) {
			if(caisse.addItem(item)) break;
		}
	}

	public int taille() {
		int size = 0;
		for(Caisse caisse : caisses) {
			size += caisse.getItems().size();
		}
		return size;
	}

	public List<Caisse> getCaisses() {
		return caisses;
	}

}
