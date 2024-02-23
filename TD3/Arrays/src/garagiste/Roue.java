package garagiste;

public class Roue {
	private double diametre;
	private double largeur;
	private double prix;
	private double prix_secours;
	
	public Roue(double diametre ,double largeur,double prix) {
		this.diametre=diametre;
		this.largeur=largeur;
		this.prix=prix;
	}
	
	public String toString() {
		return ""+diametre+" x "+largeur+"";
	}
	

	
	public double getPrixRoue() {
		return prix;
	}
	public double getPrixRoueSecours() {
		return prix_secours;
	}

	public static void main(String arg[]) {
		
	}
}


