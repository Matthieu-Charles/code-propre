package ex3.entites;

/**Classe qui permet de créer un animal, soit un individu unique
 * @author Matthieu CHARLES
 */
public class Animal {
    private String nom;
    private Espece espece;

    public Animal(String nom, Espece espece) {
        this.nom = nom;
        this.espece = espece;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                ", espece=" + espece +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Espece getEspece() {
        return espece;
    }

    public void setEspece(Espece espece) {
        this.espece = espece;
    }
}
