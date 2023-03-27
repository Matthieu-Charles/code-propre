package ex2;

/**Classe qui représente un Livret A
 *
 */
public class LivretA extends CompteBancaire {
	public static final double TAUX_REMUNERATION = 0.02;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public LivretA(double solde, double decouvert) {
		super(solde, decouvert);
	}

	/**
	 * Classe qui permet d'appliquer la rémunération annuelle au solde
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(this.getSolde() + this.getSolde()*TAUX_REMUNERATION);
	}

	/**Permet de débiter le compte en vérifiant que le solde ne soit pas négatif
	 * @param montant de type double
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde() - montant);
		}
	}
}
