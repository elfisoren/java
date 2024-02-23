package fleuriste;

public class Bouquet {
	private LotFleurs roses;
	private LotFleurs tulipes;
	private LotFleurs Oeillets;
	private Fleur prix;
	private LotFleurs quantite;
	
	public Bouquet(LotFleurs LOT1,LotFleurs LOT2,LotFleurs LOT3){
		this.roses=LOT1;
		this.tulipes=LOT2;
		this.Oeillets=LOT3;
	}
	public double prix() {
		return (roses.getPrix()*tulipes.getPrix()*Oeillets.getPrix())*1.15;
	}
	
	public String toString() {
		return "Le bouquet contient : " + roses.getQuantite() + " roses,"+tulipes.getQuantite()+" tulipes,"+Oeillets.getQuantite()+" Oeillets, prix="+prix;
	}
	public int getNombre(Fleur rose2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
