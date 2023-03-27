package ex3.entites;

import ex3.entites.enumerations.Famille;
import ex3.entites.enumerations.RegimeAlimentaire;

/**Classe qui permet de créer une espèce
 * @author Matthieu CHARLES
 */
public class Espece {
    private String nom;
    private Famille Famille;
    private RegimeAlimentaire regimeAlimentaire;

    public Espece(String nom, Famille Famille, RegimeAlimentaire regimeAlimentaire) {
        this.nom = nom;
        this.Famille = Famille;
        this.regimeAlimentaire = regimeAlimentaire;
    }

    @Override
    public String toString() {
        return "Espece{" +
                "nom='" + nom + '\'' +
                ", Famille=" + Famille +
                ", regimeAlimentaire=" + regimeAlimentaire +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Famille getFamille() {
        return Famille;
    }

    public void setFamille(Famille Famille) {
        this.Famille = Famille;
    }

    public RegimeAlimentaire getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    public void setRegimeAlimentaire(RegimeAlimentaire regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }
}


