package points_colo;

import java.awt.Color;

public class ColoredPoint {
	public class Objet {
		Color couleur;
	@Override
		public boolean equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}
	@Override
	public String toString() {
		return "Objet "+couleur;
	}

}}
