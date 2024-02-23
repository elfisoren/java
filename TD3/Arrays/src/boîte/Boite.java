package boîte;

import java.awt.*;

import point.Point;

public class Boite {
	final int nb_max=5;
	Color Couleur;
	private Boite[] box_tab;
	private int nb_boite_contenu;
	private Objet contenu;
	
	
	public Boite(Color Couleur1) {
		box_tab = new Boite[nb_max];
		this.Couleur=Couleur1;
		this.contenu=null;	
	}
	public Boite(Color Couleur_boite,Objet obj1) {
		box_tab = new Boite[nb_max];
		this.Couleur=Couleur_boite;
		this.contenu=obj1;
	}
	public Boite(Color Couleur_boite,Boite boite1) {
		this.Couleur=Couleur_boite;
		this.box_tab[0] = new Boite(Couleur_boite);
		this.nb_boite_contenu++;
	}
	public Boite(Color C1, Objet OBJ1, Boite boite1) {
		this.Couleur=C1;
		this.box_tab[0]=new Boite(C1,OBJ1);
	}	
	
	public Objet getObjet() {
		return contenu;
	}
	public Color getCouleur() {
		return Couleur;
	}
	public boolean contientObjet(Objet o){
		if(contenu.equals(o)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean estVide() {
		if(contenu==null && nb_boite_contenu==0 ) {
			return true;
		}else {
			return false;
		}
	}
	public void ajouteBoite(Boite b) {
		if(nb_boite_contenu<nb_max) {
			this.nb_boite_contenu=nb_boite_contenu+1;
			this.box_tab[nb_boite_contenu] =  b;
		}
	}
	
	public static void main(String arg[]) {
		Boite b1= new Boite(Color.green);
		Objet o1= new Objet();
		Boite b2 = new Boite(Color.green,o1);
		Boite bt = new Boite(Color.blue);
		Boite b3= new Boite(Color.green);
		b3.ajouteBoite(bt);
		Boite bt2 = new Boite(Color.yellow);
		Boite b4=new Boite(Color.green);
		b4.ajouteBoite(bt);
		b4.ajouteBoite(bt2);
		Boite b5=new Boite(Color.green,o1);
		b5.ajouteBoite(bt);
		
		
		
	}
}
