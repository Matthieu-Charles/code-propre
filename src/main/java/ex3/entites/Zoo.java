package ex3.entites;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zoo {

	private String nom;
	/**
	 * Set contenant les individus animaux présents dans le zoo
	 */
	private Set<Animal> animalListe = new HashSet<>();
	
	public Zoo(String nom){
		this.nom = nom;
	}

	/** Ajout des animaux à la liste du Zoo
	 * @param animaux
	 */
	public void addAnimal(Animal ...animaux){
		this.animalListe.addAll(Arrays.asList(animaux));
	}

	/**Classe qui affiche en console les animaux présents dans le zoo
	 *
	 */
	public void afficherListeAnimaux(){
		for (Animal animal : animalListe) {
			System.out.println(animal.toString());
		}
	}
	
	public int taille() {
		return animalListe.size();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
