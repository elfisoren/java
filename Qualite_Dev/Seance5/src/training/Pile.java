package training;

public class Pile {
    private int tailleMax;
    private int[] tableauPile;
    private int sommet;

    public Pile(int taille) {
        this.tailleMax = taille;
        this.tableauPile = new int[tailleMax];
        this.sommet = -1;
    }

    public void empiler(int element) {
        if (estPleine()) {
            throw new RuntimeException("La pile est pleine");
        }
        tableauPile[++sommet] = element;
    }

    public int depiler() {
        if (estVide()) {
            throw new RuntimeException("La pile est vide");
        }
        return tableauPile[sommet--];
    }

    public boolean estVide() {
        return (sommet == -1);
    }

    public boolean estPleine() {
        return (sommet == tailleMax - 1);
    }
}
