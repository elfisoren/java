package formes;

public class Carre extends Rectangle {
	private double longueur;
	
	public Carre(int x){
		super(x,x);
	}
	
	
	public String toString() {
		return "Carre [longueur=" + longueur + "]";
	}

	public static void main(String arg[]) {
		Carre C1= new Carre(12);
		Carre C2=new Carre(5);
		Rectangle R1=new Rectangle(3,5);
		Rectangle R2=new Rectangle(12,3);
		System.out.println(C1.toString());
		System.out.println(C2.toString());
		System.out.println(R1.toString());
		System.out.println(R2.toString());
	}
	
}
