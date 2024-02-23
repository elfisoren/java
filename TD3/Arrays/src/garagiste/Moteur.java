package garagiste;

public class Moteur {
	private int num;
	private int puissance;
	private double prix;
	
	public Moteur(int puissance,double prix) {
		this.num=num;
		num = num+1;
		this.puissance=puissance;
		this.prix=prix;
		
		
	}
	public int getPuissance() {
		return puissance;
	}
	public double getPrixMoteur() {
		return prix;
	}
	
	public String toString() {
		return "Moteur de puissance : " + puissance + " chevaux";
	}
	
	public static void main(String arg[]) {
		
	}
}
