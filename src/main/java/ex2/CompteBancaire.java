package ex2;

/** Représente un compte bancaire
 * @author Matthieu CHARLES
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/**
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
