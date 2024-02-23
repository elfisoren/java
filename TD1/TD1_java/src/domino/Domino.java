package domino;

public class Domino {
	private int nombre1;
	private int nombre2;
	
	public Domino() {
		nombre1=0;
		nombre2=0;
	}
	public Domino(int p1,int p2) {
		if (p1 < 6 && p1 > 0 || p2 < 6 && p2 > 0){
			nombre1=p1;
			nombre2=p2;
		}
		else {
			nombre1=0;
			nombre2=0;
		}
	}
	public int getNombre1() {
		return nombre1;
	}
	public int getNombre2() {
		return nombre2;
	}
	public String toString() {
		return ("["+nombre1+","+nombre2+"]");
	}
	public Boolean compatible(Domino d) {
		if(d.nombre1 == nombre1 || d.nombre2==nombre2 ) {
			return (true);
		}
		else {
			return (false);
		}
	}
	public Domino somme(Domino d) {
		int valeur1 = (nombre1 + d.nombre1)%7;
		int valeur2 = (nombre2 + d.nombre2)%7;
		return new Domino(valeur1,valeur2);
	}
	public boolean equals(Domino d) {
		if(nombre1 == d.nombre1 && nombre2 == d.nombre2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
			Domino domino1 = new Domino(2,4);
			Domino domino2 = new Domino(3,5);
			System.out.println(domino1.getNombre1());
			System.out.println(domino1.getNombre2());
			System.out.println(domino1.toString());
			System.out.println(domino1.compatible(domino1));
			System.out.println(domino1.somme(domino2));
			System.out.println(domino1.equals(domino2));
			
	}
	
}


