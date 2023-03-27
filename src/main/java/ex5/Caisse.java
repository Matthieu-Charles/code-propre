package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private int acceptationPoids;

	/**
	 * Constructeur
	 *
	 * @param nom
	 * @param acceptationPoids
	 */
	public Caisse(String nom, int acceptationPoids) {
		super();
		this.nom = nom;
		this.acceptationPoids = acceptationPoids;
		this.items = new ArrayList<>();
	}

	public boolean addItem(Item item) {
		if(item.getPoids() < this.acceptationPoids) {
			items.add(item);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Caisse{" +
				"nom='" + nom + '\'' +
				", items=" + items +
				", acceptationPoids=" + acceptationPoids +
				'}';
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
