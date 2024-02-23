package fleuriste;

public class Fleur {
	private String nom;
	private double prix;
	private int nombre;
	
	public Fleur(String fleur ,double prixFleur) {
		this.nom=fleur;
		this.prix=prixFleur;
	}
	
	public String toString() {
		return "" + nom + ", " + prix + "$";
	}
	public double getPrix() {
		return prix;
	}
	public int getNombre() {
		return nombre;
	}
	public void setN(int nombre) {
		this.nombre=nombre;
	}
}
