package Compte;

public class Compte {
private int solde=0;

	void deposer(int montant) {
			solde += montant;
}
	void retirer(int montant) {
			solde -= montant;
}
	void virerVers(int montant, Compte destination) {
			this.retirer(montant);
				destination.deposer(montant);
}
	void afficher() {
			System.out.println("Solde du compte = "+solde);
}
}