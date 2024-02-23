package fleuriste;

public class TestBouquet {
	public static void main( String[] args) {
		Fleur rose = new Fleur("roses",2.6);
		Fleur tulipe = new Fleur("tulipes",0.4);
		Fleur oeillet = new Fleur("oeillets",1.8);
		
		System.out.println(rose); // écrire une méthode public String toString() { return "..."; } dans la classe Fleur
		System.out.println(tulipe);
		System.out.println(oeillet);
		
		
		LotFleurs lotroses = new LotFleurs(rose,5);
		LotFleurs lottulipes = new LotFleurs(tulipe,7);
		LotFleurs lotoeillets = new LotFleurs(oeillet,3);
		
		Bouquet b = new Bouquet(lotroses, lottulipes, lotoeillets);
		double prixb = b.prix(); //calcule le prix d'un bouquet
		System.out.println(b+" : "+prixb+" euros"); // écrire une méthode public String toString() { return "..."; } dans la classe Bouquet
		
		Stock magasin = new Stock(rose,tulipe,oeillet);
		System.out.println(magasin); // écrire une méthode public String toString() { return "..."; } dans la classe Stock
		magasin.ajouteRose(100);
		magasin.ajouteTulipe(150);
		magasin.ajouteOeillet(200);
		System.out.println(magasin);
		System.out.println(magasin.valeurStock()); // prix du stock
		// Est-ce que le stock permet de produire le bouquet b ?
		boolean orderBouquet = magasin.bouquetFaisable(b);
		System.out.println(orderBouquet);
	}
}
