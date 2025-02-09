package ex1;

import java.util.Date;

/**Classe qui définit une entité entreprise permet de réaliser diverses opérations
 * @author Matthieu CHARLES
 */
public class Entreprise {

	/**
	 * Constante qui définit le capital maximum
	 */
	public static final int CAPITAL_MAX = 3000000;
	/**
	 * Entier représentant le SIRET de l'entreprise
	 */
	private int siret;
	/**
	 * Chaîne de caractère représentant le nom de l'entreprise
	 */
	private String nom;
	/**
	 * Chaîne représentant l'adresse de l'entreprise
	 */
	private String adresse;
	/**
	 * Date représentant la date de création
	 */
	private Date dateCreation;

	/**Permet d'afficher le statut
	 *
	 */
	public void afficherStatut(){
		
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
