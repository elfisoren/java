package garagiste;

import java.util.Arrays;

public class Voiture {
	private static int count=0;
	private String numId;
	private Roue[] roue_normale;
	private Roue roue_secours;
	private Moteur prix;
	private Moteur moteur;

	
	public Voiture(int puissance,double prixM,double diamN,double largN,double prixN,double diamS,double largS,double prixS) {
		this.numId=numId;
		numId= "V"+(count++);
		this.roue_normale= new Roue[4] ;
		
		moteur = new Moteur(puissance, prixM);
		
		for(int i=0;i==4;i++) {
			roue_normale[i] = new Roue(diamN,largN,prixN);
		}
		roue_secours = new Roue(diamS,largS,prixS);
	}
	
	public boolean estPlusPuissante(Voiture v) {
		if(v.moteur.getPuissance() < moteur.getPuissance()){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String toString() {
		
		return "Voiture " + numId + ", Prix : " + prix + "$\n" + moteur + "\nroue_normale : " +roue_normale.toString()+
				"\nroue_secours : "+ roue_secours +  "";
	}

	public double prix(Roue roue_normale,Roue secours,Moteur prix ) {
		return roue_normale.getPrixRoue()*4 + secours.getPrixRoueSecours() + prix.getPrixMoteur();		
	}


	public static void main(String arg[]) {
		
		Voiture t1 = new Voiture(15,10510,17,165,15,15,165,165);
		System.out.println(t1.toString());
	}
}
