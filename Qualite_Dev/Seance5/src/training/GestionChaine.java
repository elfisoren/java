package training;

public class GestionChaine {
    private String valeur;
    private int longueurMax;

    public GestionChaine(String initial, int longueurMax) {
        if (initial.length() > longueurMax) {
            throw new IllegalArgumentException("La chaîne initiale est trop longue.");
        }
        this.valeur = initial;
        this.longueurMax = longueurMax;
    }

    public void ajouter(String ajout) {
        if (valeur.length() + ajout.length() > longueurMax) {
            throw new RuntimeException("L'ajout dépasse la longueur maximale autorisée.");
        }
        valeur += ajout;
    }

    public String getValeur() {
        return valeur;
    }
}
