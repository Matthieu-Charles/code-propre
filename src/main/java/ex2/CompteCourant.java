package ex2;

/**Classe qui représente un compte courant
 *
 */
public class CompteCourant extends CompteBancaire {

	/**Constructeur qui reprend celui de la classe mère
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde, decouvert);
	}

	/** Permet de débiter le compte en vérifiant que le solde ne dépasse pas le découvert autorisé
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (this.getSolde() - montant > this.getDecouvert()){
			this.setSolde(this.getSolde() - montant);
		}
	}

}
