package ex3;

import ex3.entites.Animal;
import ex3.entites.Espece;
import ex3.entites.Zoo;
import ex3.entites.enumerations.Famille;
import ex3.entites.enumerations.RegimeAlimentaire;

/**Classe exécutable où l'on créé un zoo, on y ajoute des animaux et affiche le nombre
 * d'animaux présents dans le zoo
 * @author Matthieu CHARLES
 */
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		//Création d'animaux
		Espece gazelle = new Espece("Gazelle", Famille.MAMMIFERE, RegimeAlimentaire.HERBIVORE);
		Animal margot = new Animal("Margot", gazelle);

		Espece zebre = new Espece("Zèbre", Famille.MAMMIFERE, RegimeAlimentaire.HERBIVORE);
		Animal augustin = new Animal("Augustin", zebre);

		Espece lion = new Espece("Lion", Famille.MAMMIFERE, RegimeAlimentaire.CARNIVORE);
		Animal ernesto = new Animal("Ernesto", lion);

		Espece requinBlanc = new Espece("Requin blanc", Famille.POISSON, RegimeAlimentaire.CARNIVORE);
		Animal jeanPaul = new Animal("Jean-Paul", requinBlanc);

		Espece boaConstrictor = new Espece("Boa Constrictor", Famille.REPTILE, RegimeAlimentaire.CARNIVORE);
		Animal paulette = new Animal("Paulette", boaConstrictor);

		//Ajout d'animaux au zoo
		zoo.addAnimal(margot, augustin, ernesto, jeanPaul, paulette);
		//Affichage en console du nombre d'animaux présents
		System.out.println("Taille du zoo : " + zoo.taille());
		//Affichage en console des animaux présents dans le zoo
		zoo.afficherListeAnimaux();

	}
}
