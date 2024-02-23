package fleuriste;

public class LotFleurs {
	private Fleur nom;
	private int quantite;
	private double prix;
	
	public LotFleurs(Fleur nom_choix,int quantite_fleur){
		this.nom=nom_choix;
		this.quantite=quantite_fleur;
		this.prix= quantite_fleur* nom_choix.getPrix();
	}
	
	public int getQuantite(){
		return quantite;
	}
	public double getPrix() {
		return prix;
	}
	public double prix() {
		return prix;
	}
}
