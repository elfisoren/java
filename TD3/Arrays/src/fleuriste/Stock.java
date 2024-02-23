package fleuriste;

public class Stock {
	
	private Fleur roses,tulipes,Oeillets;
	
	public Stock(Fleur r,Fleur t,Fleur o) {
		this.roses=r;
		this.tulipes=t;
		this.Oeillets=o;
	}
	
	public String toString() {
		return ("Le stock contient "+roses.getNombre()+" "+roses+", "+tulipes.getNombre()+" "+tulipes+", "+Oeillets.getNombre()+" "+Oeillets+".");
	}
	
	public void ajouteRose(int nb_rose) {
		roses.setN(nb_rose);
	}
	public void ajouteTulipe(int nb_tulipe) {
		tulipes.setN(nb_tulipe);
	}
	public void ajouteOeillet(int nb_Oeillet) {
		Oeillets.setN(nb_Oeillet);
	}
	public double valeurStock() {
		int QR=roses.getNombre();
		int QT=roses.getNombre();
		int QO=roses.getNombre();
		double r= roses.getPrix();
		double t=tulipes.getPrix();
		double o=Oeillets.getPrix();
		return ((QR*r)+(QT*t)+(QO*o)+200);
	}
	public boolean bouquetFaisable(Bouquet b) {
		if(roses.getNombre()>b.getNombre(roses)&&tulipes.getNombre()>b.getNombre(tulipes)&&Oeillets.getNombre()>b.getNombre(Oeillets)) {
			return true;
		}else {
			return false;
		}
	}
}
